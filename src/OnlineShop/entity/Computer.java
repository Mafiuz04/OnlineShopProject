package OnlineShop.entity;

public class Computer extends Product {
    private String processor;
    private int memoryRAM;

    public Computer(int productId, String productName, double productPrice, int amountOfAvailableProducts, String processor, int memoryRAM) {
        super(productId, productName, productPrice, amountOfAvailableProducts);
        this.processor = processor;
        this.memoryRAM = memoryRAM;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }
}
