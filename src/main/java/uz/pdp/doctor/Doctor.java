package uz.pdp.doctor;

public class Doctor {
    private String name;
    private int experience;

    public Doctor(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void showInfo() {
        System.out.println("Doctor: " + name + ", Tajriba: " + experience + " yil");
    }
}
