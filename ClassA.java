import java.util.Scanner;

class ClassA {
    int id;
    String name;
    String gender;

    void getInfo(){
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
            sc.close();
        }
    }

    void printInfo() {
        System.out.println("Student Details: ");
        System.out.println("Id: " +id);
        System.out.println("Name: " +name);
        System.out.println("Gender: " +gender);
    }
}