package state;

public class StateMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new DefaultText());
        textEditor.type("First line");

        textEditor.setWritingState(new UpperCase());
        textEditor.type("Second line");
        textEditor.type("Third line");

        textEditor.setWritingState(new LowerCase());
        textEditor.type("Fourth line");
        textEditor.type("Fifth line");

        // Output:
        // First line
        // SECOND LINE
        // THIRD LINE
        // fourth line
        // fifth line
    }
}
