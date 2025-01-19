public class Scanner implements Device {
    @Override
    public void action(String document) {
        System.out.println("Scanning: " + document);
    }
}