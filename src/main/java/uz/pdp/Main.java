package uz.pdp;


import uz.pdp.doctor.Lor;
import uz.pdp.doctor.Xirurg;
import uz.pdp.electronics.computers.Laptop;
import uz.pdp.electronics.computers.PC;
import uz.pdp.electronics.sounds.Loudspeaker;
import uz.pdp.electronics.sounds.Subwoofer;

public class Main {
    public static void main(String[] args) {

        // A sxema
        Xirurg x = new Xirurg("Ali", 10, "Yurak");
        Lor l = new Lor("Bek", 7, "Quloq");

        x.showInfo();
        l.showInfo();

        // B sxema
        PC pc = new PC("Asus", "i7", true);
        Laptop laptop = new Laptop("Dell", "i5", 1.8);
        Subwoofer sub = new Subwoofer("Sony", 500);
        Loudspeaker loud = new Loudspeaker("JBL", 300);

        pc.showInfo();
        laptop.showInfo();
        sub.showInfo();
        loud.showInfo();
    }
}

