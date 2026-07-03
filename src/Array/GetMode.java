package Array;
import java.util.HashMap;

public class GetMode {
    public static void getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxFreqKey = currentKey;
            }
        }
        System.out.println("Mode is: " + maxFreqKey + " with frequency: " + maxFreq);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        getMode(arr);
    }
}
