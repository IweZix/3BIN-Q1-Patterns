public class PlayingState extends MediaPlayerState {
    @Override
    public void onPlay() {
        System.out.println("Already playing.");
    }

    @Override
    public void onPause() {
        System.out.println("Pausing playback...");
    }

    @Override
    public void onStop() {
        System.out.println("Stopping playback...");
    }
}