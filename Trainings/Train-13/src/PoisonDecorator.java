public class PoisonDecorator implements Skill {
    private Skill skill;

    public PoisonDecorator(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void use() {
        skill.use();
        System.out.println("Adding a poison effect.");
    }
}