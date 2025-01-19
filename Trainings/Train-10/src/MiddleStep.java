public class MiddleStep extends PuzzleStep {
    @Override
    protected boolean doSolve(String action) {
        return action.equals("middle");
    }
}