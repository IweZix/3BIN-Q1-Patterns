public class Printer implements Device {
    @Override
    public void action(String document) {
        System.out.println("Printing: " + document);
    }
}