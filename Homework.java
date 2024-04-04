import java.util.Scanner;
class Student{
    int id;
    String name;
    String gender;
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter id, name and gender: ");
            id = sc.nextInt();
            name = sc.next();
            gender = sc.next();
        } 
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            sc.close(); // this will close the scanner object "sc" and always excuted so long as the method is called b.c  finally in java always executed
        }
    }
    void printInfo() {
        System.out.println("Id" +id);
        System.out.println("Name" +name);
        System.out.println("Gender" +gender);
    }
}
public class Homework {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.getInfo();
        s.printInfo(); 
    }
}