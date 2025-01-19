Pattern : Observer

Observer : Observer
    update() : update()
ConcreteObserver : User
    update() : update()
Subject : MessagePublisher
    observerCollection : observers 
    registerObserver() : addObserver
    unregisterObserver() : removeObserver
    notifyObservers() : notifyObservers