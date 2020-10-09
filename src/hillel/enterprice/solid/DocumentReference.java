package hillel.enterprice.solid;

public class DocumentReference implements Document, Reference{
    private long id;

    public DocumentReference(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public boolean isNew() {
        return id == 0L ? true : false;
    }

}
