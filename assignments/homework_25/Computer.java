package homework_25;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private final Storage storage;

    public Computer(String pBrand, String pModel, String mBrand, String mModel, String sBrand, String sModel) {
        // Association: Composition(tight coupling)
        this.processor = new Processor(pBrand, pModel);
        this.memory = new Memory(mBrand, mModel);
        this.storage = new Storage(sBrand, sModel);
    }

    public String getInfo() {
        return String.format("Processor: %s %s\nMemory: %s %s\nStorage: %s %s",
                processor.getModel(), processor.getBrand(),
                memory.getModel(), memory.getBrand(),
                storage.getModel(), storage.getBrand()
        );
    }
}
