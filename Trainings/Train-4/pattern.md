Pattern : Command

Car une interface possède une méthode execute ou similaire (class Command)
Car une ou plusieurs classe implémente la méthode (class AppendCOmmand & DeleteCommand)
Car dans execute() de AppendCommand et DeleteCommand, la class appelle Editor pour faire l'action

Client : N/A
Invoker : N/A
Command : Command
    execute() : execute()
    undo() : undo ()
Receiver : Editor
    doAction() : executeCommand()
    undoAction() : undo()
ConcreteCommand : AppendCommand, DeleteCommand 
    Receiver :  Editor
    execute() : execute()
    undo() : undo()