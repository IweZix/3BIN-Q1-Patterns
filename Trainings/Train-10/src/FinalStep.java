public class FinalStep extends PuzzleStep {
    @Override
    protected boolean doSolve(String action) {
        return action.equals("end");
    }
}