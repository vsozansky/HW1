package hillel.enterprice.solid;

public class GatewaysLayer {

    public Document getDocument(Reference eference){
        long id = eference.getId();
        if (id != 0L){
            return new DocumentDAO(id, "element " + id);
        }
        return null;
    }

    public Document putDocument(Document document){
        long id = document.getId();
        if (id != 0L){
            return new DocumentDAO(id, "element " + id);
        }
        return null;
    }

    public Document createDocument(){
        long id = 10L;
        return new DocumentDAO(id, "element " + id);
    }

}
