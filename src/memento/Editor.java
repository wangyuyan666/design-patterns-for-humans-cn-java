package memento;

public class Editor {
    String content = "";

    public void type(String word) {
        this.content = this.content + " " + word;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
