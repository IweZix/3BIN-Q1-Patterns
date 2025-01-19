public class ReportGenerator {
    private ReportStrategy strategy;

    public ReportGenerator(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateReport(String data) {
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy set for generating report");
        }
        strategy.generate(data);
    }
}