public class DecoratorSchield extends Decorator {

    public DecoratorSchield(Robot robot) {
        super(robot);
    }

    @Override
    public int getShield() {
        return super.getShield() * 2;
    }
}
