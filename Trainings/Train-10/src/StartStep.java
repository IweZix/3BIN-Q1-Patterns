public class StartStep extends PuzzleStep {
    @Override
    protected boolean doSolve(String action) {
        return action.equals("start");
    }
}