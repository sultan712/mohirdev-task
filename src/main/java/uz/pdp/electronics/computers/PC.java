package uz.pdp.electronics.computers;

public class PC extends Computers {
    private boolean gaming;

    public PC(String brand, String cpu, boolean gaming) {
        super(brand, cpu);
        this.gaming = gaming;
    }

    public void showInfo() {
        System.out.println(
                "PC | Brand: " + getBrand() +
                        ", CPU: " + getCpu() +
                        ", Gaming: " + gaming
        );
    }
}
