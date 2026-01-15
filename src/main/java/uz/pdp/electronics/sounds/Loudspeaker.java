package uz.pdp.electronics.sounds;

public class Loudspeaker extends Sounds {

    public Loudspeaker(String brand, int power) {
        super(brand, power);
    }

    public void showInfo() {
        System.out.println(
                "Loudspeaker | Brand: " + getBrand() +
                        ", Power: " + getPower() + "W"
        );
    }
}
