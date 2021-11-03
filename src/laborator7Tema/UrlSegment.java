package laborator7Tema;

public class UrlSegment extends TextSegment{
    String url;

    public UrlSegment(String url, String content) {
        super(content);
        this.url = url;
    }

    @Override
    void accept(DocumentVisitor documentVisitor) {
    }
}
