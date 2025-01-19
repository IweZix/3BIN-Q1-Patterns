class DeleteCommand implements Command {
    private Editor editor;
    private String deletedText;

    public DeleteCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        deletedText = editor.getText().substring(editor.getText().length() - 1);
        editor.deleteText(1);
    }

    @Override
    public void undo() {
        editor.appendText(deletedText);
    }
}