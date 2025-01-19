class FilterBlur implements Filter {
    @Override
    public void apply(String imagePath) {
        System.out.println("Applying blur filter to " + imagePath);
    }
}