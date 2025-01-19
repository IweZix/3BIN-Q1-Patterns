Pattern : Chain of responsibility

C'est une chain of responsibility : 
- car chaque étape de la résolution du puzzle est gérée par un objet de type Handler. 
- Chaque Handler a une référence vers le Handler suivant. 
- Lorsqu'un Handler termine son traitement, il appelle le traitement du Handler suivant.

Client : N/A
Handler : PuzzleStep
    HandleRequest() : doSolve()
ConcreteHandler : StartStep, MiddleStep, FinalStep
    HandleRequest() : doSolve()