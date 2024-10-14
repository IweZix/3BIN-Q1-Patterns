public class StateNotSleeping extends State {

    public void attack(Bear b) {
        System.out.println("Roaaar");
    }

    public void wakeup(Bear b) {
        throw new IllegalStateException("Bear is not sleeping");
    }
}
