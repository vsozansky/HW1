package hillel.enterprice.solid;

public class ProcessorLogger2 extends ProcessorLogger implements Processor {
    private Logger logger;

    public ProcessorLogger2(Processor processor) {
        super(processor);
        this.logger = new LoggerTepminal();
    }

    @Override
    public void putOutput() {
        this.logger.log("Start Logger2");
        super.putOutput();
        this.logger.log("Stop Logger2");
    }
}
