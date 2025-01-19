public class Warrior {
    private AttackStrategy strategy;

    public Warrior(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        if (strategy != null) {
            strategy.attack();
        } else {
            System.out.println("No weapon equipped!");
        }
    }
}