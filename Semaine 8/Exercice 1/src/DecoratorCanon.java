public class DecoratorCanon extends Decorator {

    public DecoratorCanon(Robot robot) {
        super(robot);
    }

    @Override
    public int getCanon() {
        return super.getCanon() * 2;
    }
}
