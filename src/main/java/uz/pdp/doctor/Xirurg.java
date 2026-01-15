package uz.pdp.doctor;

public class Xirurg extends Doctor {
    private String operationType;

    public Xirurg(String name, int experience, String operationType) {
        super(name, experience);
        this.operationType = operationType;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Xirurg: " + getName() +
                        ", Tajriba: " + getExperience() +
                        " yil, Operatsiya turi: " + operationType
        );
    }
}
