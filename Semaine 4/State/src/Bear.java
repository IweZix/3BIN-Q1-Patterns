
public class Bear {
    /*
    public enum State {
        SLEEPING{
            public void attack(Bear b) {
                System.out.println("Zzzzzz");
            }

            public void sleep(Bear b) {
                throw new IllegalStateException("Bear is already sleeping");
            }
        },
        NOT_SLEEPING {
            public void attack(Bear b) {
                System.out.println("Roaaar");
            }

            public void wakeup(Bear b) {
                throw new IllegalStateException("Bear is not sleeping");
            }
        };

        public abstract void attack(Bear b);

        public void sleep(Bear b) {
            b.setState(State.SLEEPING);
        }

        public void wakeup(Bear b) {
            b.setState(State.NOT_SLEEPING);
        }
    }
    */

    private State state;

    public Bear() {
        setState(new StateNotSleeping());
    }

    public void attack() {
        state.attack(this);
    }

    public void sleep() {
        state.sleep(this);
    }

    public void wakeup() {
        state.wakeup(this);
    }

    public void setState(State state) {
        this.state= state;
    }

    public static void main(String[] args) {
        Bear b= new Bear();
        b.attack();
        b.sleep();
        b.attack();
    }
}