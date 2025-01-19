Pattern : State

Context : MediaPlayer
    request() : play(), pause(), stop()
State : MediaPlayerState
    handle() : onPlay(), onPause(), onStop()
ConcreteState : PlayingState, PausedState