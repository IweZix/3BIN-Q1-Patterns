public abstract class PuzzleStep {
    private PuzzleStep nextStep;

    public void setNextStep(PuzzleStep nextStep) {
        this.nextStep = nextStep;
    }

    public void solve(String action) {
        if (doSolve(action)) {
            System.out.println("Step solved: " + this.getClass().getSimpleName());
            if (nextStep != null) {
                nextStep.solve(action);
            }
        } else {
            System.out.println("Failed at step: " + this.getClass().getSimpleName());
        }
    }

    protected abstract boolean doSolve(String action);
}