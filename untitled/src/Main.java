public class Main {
    public static void main(String[] args) {
        SwordDecorator sword = new ReinforcedSwordDecorator(new SimpleSword());

        System.out.println(sword.description());
        System.out.println(sword.damage());

        SwordDecorator sword2 = new HeavySwordDecorator(new SimpleSword());

        System.out.println(sword2.damage());
        System.out.println(sword2.description());

        SwordDecorator sword3 = new PoisonSwordDecorator(new SimpleSword());
        System.out.println(sword3.damage());
        System.out.println(sword3.description());

        WasdPersonControl wasdControl = new WasdPersonControl();

        ArrowControl arrowControl = new ArrowControlAdapter(wasdControl);

        arrowControl.up();
        arrowControl.down();
        arrowControl.left();
        arrowControl.right();
    }
}