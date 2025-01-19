Pattern : Composite

IComposite : Partie
Operator() : demande(), getNiveau()
Leaf : Valeur
Composite Groupe


Pattern : Visitor

Client = Main
Element = Partie
    accept() = demande()
ConcreteElement = Valeur, Groupe
Visitor = Traitement
    visit() = traiteValeur(), traiteGroupe()
ConcreteVisitor = Listeur, Totaliseur, ListeurNombre