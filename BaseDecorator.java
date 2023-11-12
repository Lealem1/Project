public class BaseDecorator implements Nameable {
     Nameable nameable;

    public BaseDecorator(Nameable nameable) {
        this.nameable = nameable;
    }
    public BaseDecorator() {
    }
    @Override
    public String getCorrectName() {
        return nameable.getCorrectName();
    }
}