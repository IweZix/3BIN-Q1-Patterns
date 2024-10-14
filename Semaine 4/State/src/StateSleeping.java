public class StateSleeping extends State {

    public void attack(Bear b) {
        System.out.println("Zzzzzz");
    }

    public void sleep(Bear b) {
        throw new IllegalStateException("Bear is already sleeping");
    }
}
