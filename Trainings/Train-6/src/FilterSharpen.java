class FilterSharpen implements Filter {
    @Override
    public void apply(String imagePath) {
        System.out.println("Applying sharpen filter to " + imagePath);
    }
}