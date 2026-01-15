package uz.pdp.electronics.computers;

public class Laptop extends Computers {
    private double weight;

    public Laptop(String brand, String cpu, double weight) {
        super(brand, cpu);
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println(
                "Laptop | Brand: " + getBrand() +
                        ", CPU: " + getCpu() +
                        ", Weight: " + weight + "kg"
        );
    }
}
