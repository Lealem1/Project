public class Teacher extends Person {
    public Teacher(String name, int age, boolean parentPermission) {
        super(name, age, parentPermission);
    }
    @Override
    public boolean canUseServices() {
        return true;
    }
}
