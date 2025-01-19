public class ReportStrategyPDF implements ReportStrategy {

    @Override
    public void generate(String data) {
        System.out.println("Generating PDF report with data: " + data);
    }
}