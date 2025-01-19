public class Warrior {
    private String weapon;

    public Warrior(String weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon.equals("sword")) {
            System.out.println("Swinging a sword!");
        } else if (weapon.equals("bow")) {
            System.out.println("Shooting an arrow!");
        } else if (weapon.equals("axe")) {
            System.out.println("Swinging an axe!");
        } else {
            System.out.println("Fighting unarmed!");
        }
    }
}