public class PoisonSwordDecorator implements SwordDecorator {
    private SwordDecorator swordDecorator;

    public PoisonSwordDecorator(SwordDecorator swordDecorator) {
        this.swordDecorator = swordDecorator;
    }
    @Override
    public int damage() {
        return swordDecorator.damage() + 1;
    }

    @Override
    public String description() {
        return swordDecorator.description() + "and this sword is smeared with poison(1 hit in 1 second)";
    }

}
