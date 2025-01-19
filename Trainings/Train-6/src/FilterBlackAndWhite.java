class FilterBlackAndWhite implements Filter {
    @Override
    public void apply(String imagePath) {
        System.out.println("Applying black and white filter to " + imagePath);
    }
}