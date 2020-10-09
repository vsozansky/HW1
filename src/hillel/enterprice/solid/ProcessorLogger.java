package hillel.enterprice.solid;

public class ProcessorLogger implements Processor {
    private Processor processor;
    private Logger logger;

    public ProcessorLogger(Processor processor) {
        this.processor = processor;
        this.logger = new LoggerTepminal();
    }

    @Override
    public void init(long id) {
        this.processor.init(id);
    }

    @Override
    public boolean isNew() {
        return this.processor.isNew();
    }

    @Override
    public void create() {
        this.processor.create();
    }

    @Override
    public void putOutput() {
        this.logger.log("Start");
        this.processor.putOutput();
        this.logger.log("Stop");
    }
}
