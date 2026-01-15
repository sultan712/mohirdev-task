package uz.pdp.doctor;

public class Lor extends Doctor {
    private String specialization;

    public Lor(String name, int experience, String specialization) {
        super(name, experience);
        this.specialization = specialization;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "LOR: " + getName() +
                        ", Tajriba: " + getExperience() +
                        " yil, Yo‘nalish: " + specialization
        );
    }
}
