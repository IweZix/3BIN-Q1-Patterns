Objectif :
M’entraîner à identifier, utiliser et comprendre les design patterns de manière progressive et efficace. Pour cela, tu me donneras des exercices variés, un à la fois, basés sur la liste des design patterns ci-dessous. Ces exercices doivent me permettre de travailler les points suivants :

    Identifier le design pattern utilisé dans un morceau de code donné.
    Implémenter un design pattern à partir d'une problématique ou d'un code existant.
    Comprendre comment les classes/méthodes du code sont reliées aux concepts théoriques du design pattern.

Structure d’un exercice :
Pour chaque exercice, respecte les consignes suivantes :

    Si c’est un exercice d’identification :
        Donne un code dans lequel un design pattern est utilisé (en évitant de mentionner explicitement son nom).
        Pose des questions pour guider mon analyse (identifier le pattern et justifier pourquoi c’est celui-ci).

    Si c’est un exercice d’implémentation :
        Fournis une description claire du problème ou un code nécessitant un refactoring.
        Demande ensuite d’améliorer ou d’étendre ce code en utilisant un pattern spécifique, sans nécessairement me dire lequel utiliser dès le départ (je dois le déduire).
	Si possible, le nom des patterns ne doivent pas apparaitre dans le nom des classse.

    Dans tous les cas, inclue les points suivants pour m’aider à relier la théorie et la pratique :
        Nom du pattern (à identifier ou à utiliser).
        Participants théoriques : Liste des concepts du pattern (par ex. Context, Strategy, etc.).
        Correspondances dans le code : Fais le lien entre les classes/méthodes du code et les participants théoriques du pattern.

    Pour chaque exercice, le langage utilisé doit être Java et de donner un minimum de contexte (où et comment ce code pourrait être utilisé).

Exemple de demande :
Voici un code partiel où les méthodes onPlay(), onLock(), onNext() et onPrevious() de la classe Player sont remplies de conditions if, ce qui rend le programme difficilement maintenable. Par refactoring, améliorez ce programme en utilisant un design pattern.
Faites le lien entre les classes/méthodes implémentées et le diagramme de classe du pattern choisi.

Liste des patterns à travailler :
Les exercices couvriront les catégories suivantes :

    Créationnels (instanciation des objets)
        Builder
        Abstract Factory
        Factory Method
        Singleton
        Prototype

    Structurels (composition des classes et objets)
        Adapter
        Facade
        Composite
        Decorator
        Flyweight

    Comportementaux (communication entre objets)
        Strategy
        Command
        Visitor
        Observer
        Template Method
        Chain of Responsibility
        Iterator
        State

Points importants :

    Propose des exercices adaptés à mon niveau de compréhension, en commençant par les plus simples pour aller vers des cas plus complexes.
    Si un exercice me semble complexe, n’hésite pas à me proposer des indices pour que je puisse avancer pas à pas.
    Donne pour chaque exercice une correction claire et détaillée, avec :
        Le nom du pattern et son but.
        Une explication du fonctionnement du pattern et de sa structure théorique.
        Des extraits de code (ou un code complet, si nécessaire) montrant comment le pattern est appliqué.
        Les correspondances entre le code et les participants théoriques du pattern.
        Éventuellement, un court résumé des bénéfices apportés par ce pattern dans ce cas précis.

    Tu peux ajouter des exemples de scénarios concrets (jeu, application web, traitement de fichiers…) pour illustrer l’intérêt du pattern si tu le juges utile.