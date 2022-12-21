package lab06.Task10;

public class Computer {
    private final Nameable processor;
    private final Nameable memory;
    private final Nameable monitor;
    private final Brands brand;

    public Computer(String processorName, String memoryName, String monitorName, Brands brand) {
        processor = new Processor(processorName);
        memory = new Memory(memoryName);
        monitor = new Monitor(monitorName);
        this.brand = brand;
    }

    public String getProcessor() {
        return processor.getName();
    }

    public String getMemory() {
        return memory.getName();
    }

    public String getMonitor() {
        return monitor.getName();
    }

    public Brands getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "{Processor=" + getProcessor() + "; " +
                "Monitor=" + getMonitor() + "; " +
                "Memory=" + getMemory() + "; " +
                "Brand=" + getBrand() + "}";
    }
}
