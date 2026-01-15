package uz.pdp.electronics.sounds;

import uz.pdp.electronics.Electronics;

public class Sounds extends Electronics {
    private int power;

    public Sounds(String brand, int power) {
        super(brand);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
