public class HeavySwordDecorator implements SwordDecorator{
    private SwordDecorator swordDecorator;

    public HeavySwordDecorator(SwordDecorator swordDecorator) {
        this.swordDecorator = swordDecorator;
    }

    @Override
    public int damage() {
        return swordDecorator.damage() + 10;
    }

    @Override
    public String description() {
        return swordDecorator.description() + "be careful its very sharp sword";
    }
}
