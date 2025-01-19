public class PausedState extends MediaPlayerState {
    @Override
    public void onPlay() {
        System.out.println("Resuming playback...");
    }

    @Override
    public void onPause() {
        System.out.println("Already paused.");
    }

    @Override
    public void onStop() {
        System.out.println("Stopping playback...");
    }
}