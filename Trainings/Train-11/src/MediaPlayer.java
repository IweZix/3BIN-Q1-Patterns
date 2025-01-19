public class MediaPlayer {
    private MediaFile file;

    public MediaPlayer(MediaFile file) {
        this.file = file;
    }

    public void playFile() {
        file.play();
    }
}