public class Casting{
    public static void main(String[] args) {
        // Declare variables
        int num = 12;
        double decimalNum = 345.456778;
        String name = "Anna";
        char letter = 'W';
// here below is explicit casting heirarchy in java 
// N.b... byte -> short -> int -> long -> float -> double  -> char -> String -> boolean -> void  -> null -> any other class or interface  
        double castedDouble = num; // here we don't need to have explicit casting b.c int is 4byte but double is 8byte

        int castedInt = (int) decimalNum;  // explicit casting

        // Cast the String value to character (taking the specific index character)
        char charFromStr = name.charAt(0);

        // Cast the double value to String ....... casting to string uses non.primitive data types
        String doubleStr = Double.valueOf(decimalNum).toString(); 
        //or    String doubleStr = String.valueOf(decimalNum); 

        String charToString = String.valueOf(letter);
        //or    String charToString = Character.valueOf(letter).toString();
 
        System.out.println("Casted integer to double: " + castedDouble);
        System.out.println("Casted double to integer: " + castedInt);
        System.out.println("Casted string to character: " + charFromStr);
        System.out.println("Casted double to string: " + doubleStr);
        System.out.println("Casted char to string: " + charToString);

    }
}