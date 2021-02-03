package Arrays;

public class SymbolsBetweenNumbers {

    public static void main(String[] args) {

        System.out.println(addStarsHyphenBetweenNumbers("98234925928"));
        System.out.println(addStarsHyphenBetweenNumbers("2397492834092"));
    }

//    Insert Star(*) between consecutive even digits and Hyphen(-) between consecutive odd digits.
//    String does not allow appending. Each method you invoke on a String creates a new object and returns it. This is because String is immutable - it cannot change its internal state.
//      On the other hand StringBuilder is mutable. When you call append(..) it alters the internal char array, rather than creating a new string object.

    static String addStarsHyphenBetweenNumbers(String input){

        StringBuilder result = new StringBuilder();
        String inputCopy = input;
        result.append(inputCopy.charAt(0));
        int stringSize = input.length();
        for (int i = 0; i < stringSize-1; i++){
            int indexCopy = i;
            int numberPosIndex = Integer.parseInt("" + inputCopy.charAt(indexCopy));
            int numberPosIndexPlusOne = Integer.parseInt("" + inputCopy.charAt(indexCopy+1));
            if(numberPosIndex %2 == 0 && numberPosIndexPlusOne % 2 == 0){
                result = result.append("*");
            }
            else if(numberPosIndex %2 != 0 && numberPosIndexPlusOne % 2 != 0){
                result = result.append("-");
            }
            result.append(numberPosIndexPlusOne);
        }
        return result.toString();
    }

}
