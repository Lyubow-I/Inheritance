public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist("Терапевт Сидорова", "Общая терапия");

        Patient patient = new Patient();

        patient.setTreatmentPlan(3);

        patient.setDoctor(therapist.assignDoctor(patient.treatmentPlan));

        patient.treat();
    }
}
