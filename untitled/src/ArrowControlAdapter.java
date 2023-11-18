public class ArrowControlAdapter implements ArrowControl{
    private WasdPersonControl wasdControl;

    public ArrowControlAdapter(WasdPersonControl wasdControl) {
        this.wasdControl = wasdControl;
    }

    @Override
    public void up() {
        wasdControl.moveForward();
    }

    @Override
    public void down() {
        wasdControl.moveBackward();
    }

    @Override
    public void left() {
        wasdControl.moveLeft();
    }

    @Override
    public void right() {
        wasdControl.moveRight();
    }
}
