package lab24;

public class CreateImageDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new ImageDocument("new");
    }

    @Override
    public IDocument createOpen() {
        return new ImageDocument("open");
    }
}

