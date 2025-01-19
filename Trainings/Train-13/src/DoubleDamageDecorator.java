public class DoubleDamageDecorator implements Skill {
    private Skill skill;

    public DoubleDamageDecorator(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void use() {
        skill.use();
        System.out.println("Dealing double damage.");
    }
}