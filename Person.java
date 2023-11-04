public class Person {
    private static int nextId = 1;

     int id;
     String name="unknown";
     int age;
     boolean parentPermission=true;

    public Person(String name, int age, boolean parentPermission) {
       
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
    }

    public Person(String name, int age) {
        this(name, age, true); // Use default values
    }

    
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge() || parentPermission;
    }
}

