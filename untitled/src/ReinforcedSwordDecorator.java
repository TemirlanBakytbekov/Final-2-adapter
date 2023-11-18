public class ReinforcedSwordDecorator implements SwordDecorator{
    private SwordDecorator swordDecorator;

    public ReinforcedSwordDecorator(SwordDecorator swordDecorator) {
        this.swordDecorator = swordDecorator;
    }

    @Override
    public int damage() {
        return swordDecorator.damage() + 5;
    }

    @Override
    public String description() {
        return swordDecorator.description() + "with some buff ";
    }
}
