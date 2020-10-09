package hillel.enterprice.solid;

public class DocumentDAO  implements Document{
    private long id;
    private String name;

    public DocumentDAO() {
    }

    public DocumentDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DocumentDAO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isNew() {
        return id == 0L ? true : false;
    }

}
