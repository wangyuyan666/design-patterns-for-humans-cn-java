package memento;

public class MementoMain {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // Type some stuff
        editor.type("This is the first sentence.");
        editor.type("This is second.");

        // Save the state to restore to : This is the first sentence. This is second.
        EditorMemento saved = editor.save();

        // Type some more
        editor.type("And this is third.");

        // Output: Content before Saving
        System.out.println(editor.getContent()); // This is the first sentence. This is second. And this is third.

        // Restoring to last saved state
        editor.restore(saved);

        System.out.println(editor.getContent()); // This is the first sentence. This is second.
    }
}
