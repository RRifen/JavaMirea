package lab24;

import org.w3c.dom.Text;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument("new");
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument("open");
    }
}
