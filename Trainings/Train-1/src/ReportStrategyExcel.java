public class ReportStrategyExcel implements ReportStrategy {

    @Override
    public void generate(String data) {
        System.out.println("Generating Excel report with data: " + data);
    }
}