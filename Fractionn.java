import java.util.Scanner;

class Fraction {
    int numerator; 
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;  //this indicates the instance variable here above in the class
        this.denominator = denominator;
    }
    void display() {
        System.out.println("The fraction before simplification is " + numerator + "/" + denominator);
    }
    public void simplifyFraction(Fraction obj) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(obj.numerator, obj.denominator); i++) {
            if (obj.numerator % i == 0 && obj.denominator % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The fraction after simplification is " + obj.numerator / gcd + "/" + obj.denominator / gcd);
    }
}

public class Fractionn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator"); 
        int numerator = input.nextInt();
        System.out.println("Enter a denominator"); 
        int denominator = input.nextInt();

        Fraction object = new Fraction(numerator, denominator);

        object.display();
        object.simplifyFraction(object);

        input.close();
    }
}
