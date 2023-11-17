public class CapitalizeDecorator extends BaseDecorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String getCorrectName() {
        String name = super.getCorrectName();
        return name.toUpperCase();
    }
}