package DesignPattern.MementoDesignPattern;

public class Editor {

    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void resoreState(EditorState state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
