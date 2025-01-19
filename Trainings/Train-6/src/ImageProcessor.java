public class ImageProcessor {
    private Filter currentFilter;

    public void setFilter(Filter filter) {
        this.currentFilter = filter;
    }

    public void applyFilter(String imagePath) {
        if (currentFilter != null) {
            currentFilter.apply(imagePath);
        } else {
            System.out.println("No filter selected.");
        }
    }
}