public class Student extends Person {
    private String classroom;

    public Student(String name, int age, boolean parentPermission, String classroom) {
        super(name, age, parentPermission);
        this.classroom = classroom;
    }
}
