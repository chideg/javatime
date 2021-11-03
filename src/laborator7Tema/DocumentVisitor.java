package laborator7Tema;

public interface DocumentVisitor {
    StringBuilder getDocument();
    void visit(UrlSegment urlSegment);
    void visit(PlainTextSegment plainTextSegment);
    void visit(ItalicTextSegment italicTextSegment);
    void visit(BoldTextSegment boldTextSegment);

}
