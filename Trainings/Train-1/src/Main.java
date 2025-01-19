public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator(new ReportStrategyExcel());
        generator.generateReport("Report data 1");

        generator.setStrategy(new ReportStrategyPDF());
        generator.generateReport("Report data 2");

        generator.setStrategy(new ReportStrategyExcel());
        generator.generateReport("Report data 3");
    }
}