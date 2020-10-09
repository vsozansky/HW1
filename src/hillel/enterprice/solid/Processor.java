package hillel.enterprice.solid;

public interface Processor {
    void init(long id);
    boolean isNew();
    void create();
    void putOutput();
}
