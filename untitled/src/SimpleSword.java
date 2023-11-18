public class SimpleSword implements SwordDecorator {
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String description() {
        return "This is a sword ";
    }
}
