# Auto-push watcher for Windows PowerShell
# Place this file in the repo root and run with:
#   powershell -NoProfile -ExecutionPolicy Bypass -File .\auto-push.ps1

$repo = Get-Location

$watcher = New-Object System.IO.FileSystemWatcher $repo.Path, '*.*'
$watcher.IncludeSubdirectories = $true
$watcher.EnableRaisingEvents = $true

$timer = $null

$shouldIgnore = {
    param($path)
    if ($null -eq $path) { return $true }
    $lower = $path.ToLower()
    if ($lower -match '\\bin\\' -or $lower -match '\\.git\\' -or $lower -match '\\.vscode\\' -or $lower -match '\\node_modules\\') { return $true }
    if ($lower -match '\.class$' -or $lower -match '\.log$') { return $true }
    return $false
}

$onEvent = {
    param($s, $e)
    if (& $shouldIgnore $e.FullPath) { return }

    if ($timer) {
        $timer.Stop()
        $timer.Dispose()
    }

    $timer = New-Object Timers.Timer 1200
    $timer.AutoReset = $false
    $timer.add_Elapsed({
        try {
            Set-Location $repo.Path
            $status = git status --porcelain
            if ($status) {
                git add -A
                git commit -m "auto-save: $(Get-Date -Format o)" 2>$null
                git push origin HEAD
                Write-Host "[auto-push] pushed at $(Get-Date -Format o)"
            }
        } catch {
            Write-Host "[auto-push] error: $($_.Exception.Message)"
        }
    })
    $timer.Start()
}

Register-ObjectEvent $watcher Changed -Action $onEvent | Out-Null
Register-ObjectEvent $watcher Created -Action $onEvent | Out-Null
Register-ObjectEvent $watcher Renamed -Action $onEvent | Out-Null
Register-ObjectEvent $watcher Deleted -Action $onEvent | Out-Null

Write-Host "Watching $($repo.Path) (ignores: bin, .git, .vscode, *.class, *.log). Press Ctrl+C to stop."
while ($true) { Start-Sleep -Seconds 3600 }
