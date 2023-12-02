public class BaseDecorator implements Nameable {
    Nameable nameable;
    public BaseDecorator(Nameable nameable) {
        this.nameable = nameable;
    }
    @Override
    public String getCorrectName() {
        return nameable.getCorrectName();
    }
}
