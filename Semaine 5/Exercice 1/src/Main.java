public class Main {
    public static void main(String[] args) {
        Album lonerism = new Album.Builder("Lonerism",
                "Tame Impala").country("Australie").year(2012).genre("indie rock").build(); Album
                orange = new Album.Builder("channel ORANGE",
                "Frank Ocean").year(2012).genre("R&B").build();
        Album visions = new Album.Builder("Visions",
                "Grimes").year(2012).label("4AD").genre("Electronic").build();

        System.out.println(lonerism);

        System.out.println(orange);
    }
}