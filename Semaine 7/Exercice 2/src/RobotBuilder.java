public class RobotBuilder implements Robot {

    private final int canon, schield, freq;
    private int life;
    private final String name;

    public RobotBuilder(Builder builder) {
        this.canon = builder.canon;
        this.schield = builder.schield;
        this.freq = builder.freq;
        this.name = builder.name;
        this.life = builder.life;
    }

    @Override
    public int getCanon() {
        return canon;
    }

    @Override
    public int getShield() {
        return schield;
    }

    @Override
    public int getFreq() {
        return freq;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int diffLife(int i) {
        return life += i;
    }

    /**
     * Builder class for RobotBuilder
     */
    public static class Builder {
        private int canon, schield, freq, life;
        private String name;

        public Builder setCanon(int canon) {
            this.canon = canon;
            return this;
        }

        public Builder setSchield(int schield) {
            this.schield = schield;
            return this;
        }

        public Builder setFreq(int freq) {
            this.freq = freq;
            return this;
        }

        public Builder setLife(int life) {
            this.life = life;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public RobotBuilder build() {
            return new RobotBuilder(this);
        }
    }
}
