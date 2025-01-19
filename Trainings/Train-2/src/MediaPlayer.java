public class MediaPlayer {
    private MediaPlayerState state;

    public MediaPlayer(MediaPlayerState state) {
        this.state = state;
    }

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public void play() {
        state.onPlay();
    }

    public void pause() {
        state.onPause();
    }

    public void stop() {
        state.onStop();
    }
}