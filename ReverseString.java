public class ReverseString {

    /*
    * Create a method that reverse the string
    * @parameter String
    * @return String reverse
    */
    public static String reverseString(String str) {

        String reverse = "";
        int strLength = str.length();

        for (int i = strLength; i > 0; i--) {
            reverse+= str.charAt(i - 1);
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello, Java"));
    }

}