package OnlineShop.entity.Entity;

import java.util.Objects;

public class Computer extends Product {
    private String processor;
    private int memoryRAM;

    public Computer( String productName, double productPrice, int amountOfAvailableProducts, String processor, int memoryRAM) {
        super( productName, productPrice, amountOfAvailableProducts);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        return memoryRAM == computer.memoryRAM && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processor, memoryRAM);
    }

    @Override
    public String toString() {

        return
                super.toString() +
                        ", processor = " + processor +
                        ", memoryRAM = " + memoryRAM;
    }
}
