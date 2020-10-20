package hillel.enterprice;

import hillel.enterprice.solid.*;

public class SolidApp {

    public static void main(String[] args) {

        GatewaysLayer gatewaysLayer = new GatewaysLayer();
        PresentersLayer presentersLayer = new PresentersLayer();
        Processor processor = new ProcessorLogger2(new DocumentProcessor(gatewaysLayer,presentersLayer));

        long id = 1;
        processor.init(id);
        if (processor.isNew()){
            processor.create();
        }
        processor.putOutput();

    }

}
