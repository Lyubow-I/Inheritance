package principles;

public class Patient {
    int treatmentPlan;
    private Doctor doctor;

    public void setTreatmentPlan(int plan) {
        this.treatmentPlan = plan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void treat() {
        doctor.treat();
    }

}
