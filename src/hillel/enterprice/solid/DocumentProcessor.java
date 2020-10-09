package hillel.enterprice.solid;

public class DocumentProcessor implements Processor{
    private GatewaysLayer gatewaysLayer;
    private PresentersLayer presentersLayer;
    private Document document;

    public DocumentProcessor() {

    }

    public DocumentProcessor(GatewaysLayer gatewaysLayer, PresentersLayer presentersLayer) {
        this.gatewaysLayer = gatewaysLayer;
        this.presentersLayer = presentersLayer;
    }

    public GatewaysLayer getGatewaysLayer() {
        return gatewaysLayer;
    }

    public void setGatewaysLayer(GatewaysLayer gatewaysLayer) {
        this.gatewaysLayer = gatewaysLayer;
    }

    public PresentersLayer getPresentersLayer() {
        return presentersLayer;
    }

    public void setPresentersLayer(PresentersLayer presentersLayer) {
        this.presentersLayer = presentersLayer;
    }

    public boolean isNew() {
        return document == null ? true : document.isNew();
    }

    public void init(long id) {
        document = gatewaysLayer.getDocument(new DocumentReference(id));
    }
    public void create() {
        document = gatewaysLayer.createDocument();
    }

    public void save() {
        document = gatewaysLayer.putDocument(document);
    }

    public void putOutput() {
        presentersLayer.putOutput(document);
    }

}
