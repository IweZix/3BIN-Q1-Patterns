Pattern : Strategy

Context : ImageProcessor
Strategy : Filter
    execute() : apply()
ConcreteStrategy : FilterBlackAndWhite, FilterBlur, FilterSharpen
    execute() : apply()

Car on essaye d'éviter la redondance de if/else
Car la classe ImageProcessor à un attribut qui est une interface
Car l'interface à une méthode apply() qui est utilisée dans la classe ImageProcessor
Car la méthode de l'interface est implémentée dans les classes commençant pas ``Filter``
Car l'interface ne possède qu'une seule méthode

