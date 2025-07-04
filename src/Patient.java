public class Patient {
    int treatmentPlan;
    private Clinic doctor;

    public void setTreatmentPlan(int plan) {
        this.treatmentPlan = plan;
    }

    public void setDoctor(Clinic doctor) {
        this.doctor = doctor;
    }

    public void treat() {
        doctor.treat();
    }

}
