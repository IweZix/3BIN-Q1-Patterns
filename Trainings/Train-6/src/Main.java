public class Main {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor();

        // Appliquer un filtre noir et blanc
        processor.setFilter(new FilterBlackAndWhite());
        processor.applyFilter("image1.jpg");

        // Appliquer un filtre flou
        processor.setFilter(new FilterBlur());
        processor.applyFilter("image2.jpg");

        // Appliquer un filtre de netteté
        processor.setFilter(new FilterSharpen());
        processor.applyFilter("image3.jpg");
    }
}