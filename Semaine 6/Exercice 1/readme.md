Pattern : Observer
    Subject : JeuDeLaVie
        ObserverCollection : List<Espion>
        registerObserver : attacher()
        unregisterObserver : detacher()
        notifyObservers : notifier()
    Observer : Espion
        update : utiliserRenseignements()
    ConcreteObserver : JeuDeLaVideGui


Pattern : State
    context : Cellule
        request : toggle(), vit(), meurt()
    State : Situation
        handle : toggle(), vit(), meurt(), ajouterAuxVoisinsVivants(), estVivante()
    ConcreteState : estVivante, estMorte
        handle: toggle,...

Pattern : Singleton
    singleton : EstMorte, EstVivante
        getInstance : EstMort EstVivant

Pattern : Command
    Command -> Activite
        execute() --> activer()
    ConcreteCommand -> Meurt , Vit
    Client -> JeuDeLaVieGUI
    Invoker -> JeuDeLaVie
    Receiver -> Cellule

Pattern : Visitor
    Client -> JeuDeLaVie
    Visitor -> parcourir
        visit() -> ParcourCellulVivante(cellule)
                -> ParcourCelluleMort(cellule)
    ConcreteVisitor -> ParcourNormal, parcourFnt
    Element -> Cellule
        accept(visitor) -> generer(parcourir)

