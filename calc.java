import java.util.Scanner;

class operation{
    int x;
    double y;
    void add(int x, double y){
        System.out.println(x + y);
    }
    void sub(int x, double y){
        System.out.println(x-y);
    }

    void mul(int x, double y){
        System.out.println(x*y);
    }

    double div(int x, double y){
        return x/y;
    }

}
public class calc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        double b = input.nextDouble();

        operation obj = new operation();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        double  divv = obj.div(a,b);
        System.out.println(divv);

    }
}
// write the code above using switch cases to make it more interactive