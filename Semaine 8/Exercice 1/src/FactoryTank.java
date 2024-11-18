public class FactoryTank implements AbstractFactory {

    public FactoryTank() {
    }

    @Override
    public Robot createRobot() {
        return new RobotBuilder.Builder().setName("Tank").setCanon(10).setSchield(100).setFreq(10).setLife(1000).build();
    }
}
