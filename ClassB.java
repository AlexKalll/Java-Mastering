public class ClassB {
    public static void main(String[] args)
    {
        // we can have multiple classes in the same directory/folder
         // here i am using the ClassA class which is from the same directory but from other file which is ClassA.java i.e. this links them
        ClassA s = new ClassA();
        s.getInfo();
        s.printInfo(); // Call the printInfo method
    }
}