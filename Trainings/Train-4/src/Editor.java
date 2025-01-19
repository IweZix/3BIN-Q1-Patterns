import java.util.Stack;

public class Editor {
    private StringBuilder text = new StringBuilder();
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }

    public void appendText(String newText) {
        text.append(newText);
    }

    public void deleteText(int length) {
        text.delete(text.length() - length, text.length());
    }

    public String getText() {
        return text.toString();
    }
}