class AppendCommand implements Command {
    private Editor editor;
    private String textToAppend;

    public AppendCommand(Editor editor, String textToAppend) {
        this.editor = editor;
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute() {
        editor.appendText(textToAppend);
    }

    @Override
    public void undo() {
        editor.deleteText(textToAppend.length());
    }
}