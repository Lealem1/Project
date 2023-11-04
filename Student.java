public class Student extends Person {
     String classroom;

    public Student(String name, int age, boolean parentPermission, String classroom) {
        super(name, age, parentPermission);
        this.classroom = classroom;
    }

    
}
