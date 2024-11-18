public class FactoryPicVert implements AbstractFactory {

    public FactoryPicVert() {}

    @Override
    public Robot createRobot() {
        return new RobotBuilder.Builder().setName("Pic Vert").setCanon(10).setSchield(2).setFreq(200).build();
    }
}
