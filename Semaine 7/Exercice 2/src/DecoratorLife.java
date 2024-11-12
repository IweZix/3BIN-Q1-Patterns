public class DecoratorLife extends Decorator {

    public DecoratorLife(Robot robot) {
        super(robot);
    }

    @Override
    public int diffLife(int i) {
        if (i < 0) i = i / 2;
        return super.diffLife(i) / 2;
    }
}
