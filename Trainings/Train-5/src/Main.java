public class Main {
    public static void main(String[] args) {
        // Utilisation d'une stratégie Sword
        Warrior warrior = new Warrior(new AttackStrategySword());
        warrior.attack(); // Output: Swinging a sword!

        // Changement dynamique de stratégie
        warrior.setStrategy(new AttackStrategyBow());
        warrior.attack(); // Output: Shooting an arrow!
    }
}