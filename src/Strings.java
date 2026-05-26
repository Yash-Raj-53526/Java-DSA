public class Strings {
    public static void main(String[] args) {
        String name = "Tony Stark";
        // System.out.println(name.length());

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i)+ " at index -> " + i);
        }
    }
}