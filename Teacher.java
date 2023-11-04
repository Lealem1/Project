public class Teacher extends Person {
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
