public class Album {

    private final String title; // required
    private final String artist; // required
    private final String label;
    private final String producteur;
    private final String country;
    private final String version;
    private final String genre;
    private final int year;
    private final boolean remastered;
    private final int originalYear;
    private final int standardDebitQuality;
    private final int subDebitQuality;

    private Album(Builder b) {
        this.title = b.title;
        this.artist = b.artist;
        this.label = b.label;
        this.producteur = b.producteur;
        this.country = b.country;
        this.version = b.version;
        this.genre = b.genre;
        this.year = b.year;
        this.remastered = b.remastered;
        this.originalYear = b.originalYear;
        this.standardDebitQuality = b.standardDebitQuality;
        this.subDebitQuality = b.subDebitQuality;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getLabel() {
        return label;
    }

    public String getProducteur() {
        return producteur;
    }

    public String getCountry() {
        return country;
    }

    public String getVersion() {
        return version;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public boolean isRemastered() {
        return remastered;
    }

    public int getOriginalYear() {
        return originalYear;
    }

    public int getStandardDebitQuality() {
        return standardDebitQuality;
    }

    public int getSubDebitQuality() {
        return subDebitQuality;
    }

    public static class Builder {
        private final String title; // required
        private final String artist; // required
        private String label;
        private String producteur;
        private String country;
        private String version;
        private String genre;
        private int year;
        private boolean remastered;
        private int originalYear;
        private int standardDebitQuality;
        private int subDebitQuality;

        public Builder(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder producteur(String producteur) {
            this.producteur = producteur;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder remastered(boolean remastered) {
            this.remastered = remastered;
            return this;
        }

        public Builder originalYear(int originalYear) {
            this.originalYear = originalYear;
            return this;
        }

        public Builder standardDebitQuality(int standardDebitQuality) {
            this.standardDebitQuality = standardDebitQuality;
            return this;
        }

        public Builder subDebitQuality(int subDebitQuality) {
            this.subDebitQuality = subDebitQuality;
            return this;
        }

        public Album build() {
            return new Album(this);
        }
    }
}
