package uz.pdp.electronics;

public class Electronics {
    private String brand;

    public Electronics(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void showInfo() {
        System.out.println("Brend: " + brand);
    }
}
