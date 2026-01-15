package uz.pdp.electronics.sounds;

public class Subwoofer extends Sounds {

    public Subwoofer(String brand, int power) {
        super(brand, power);
    }

    public void showInfo() {
        System.out.println(
                "Subwoofer | Brand: " + getBrand() +
                        ", Power: " + getPower() + "W"
        );
    }
}
