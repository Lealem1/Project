public class Teacher extends Person {

    public Teacher(String name, int age, boolean parentPermission) {
        super(name, age, parentPermission);
    }

     String specialization;

    public Teacher(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    

    
    }


    @Override
    public boolean canUseServices() {
        return true;
    }
}
