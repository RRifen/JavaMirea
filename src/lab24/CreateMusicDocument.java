package lab24;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new MusicDocument("new");
    }

    @Override
    public IDocument createOpen() {
        return new MusicDocument("open");
    }
}
