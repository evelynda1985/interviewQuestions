package Strings;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("hello"));
        System.out.println(reverseString("celeste"));
    }

//    StringBuilder is not thread safe!

    static String reverseString(String input){

        String copyInput = input;
        StringBuffer result = new StringBuffer();
        for(int i = copyInput.length() - 1; i >=0 ; i--){
            result.append(copyInput.charAt(i));
        }

        return result.toString();
    }

}
