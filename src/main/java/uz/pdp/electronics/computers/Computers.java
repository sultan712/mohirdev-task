package uz.pdp.electronics.computers;

import uz.pdp.electronics.Electronics;

public class Computers extends Electronics {
    private String cpu;

    public Computers(String brand, String cpu) {
        super(brand);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }
}

