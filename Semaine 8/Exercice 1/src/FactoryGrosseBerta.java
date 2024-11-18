public class FactoryGrosseBerta implements AbstractFactory {

    public FactoryGrosseBerta() {
    }

    @Override
    public Robot createRobot() {
        return new RobotBuilder.Builder().setName("Grosse Berta").setCanon(200).setFreq(10).build();
    }
}
