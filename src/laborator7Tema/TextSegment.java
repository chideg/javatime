package laborator7Tema;

public abstract class TextSegment {
    private String content;

    public TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // TODO add method for applying the visitor
    abstract void accept(DocumentVisitor documentVisitor);

}
