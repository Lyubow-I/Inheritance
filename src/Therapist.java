class Therapist extends Doctor {
    private  String  specialization;

    public Therapist(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
    public void treat() {
        System.out.println(getName() + " проводит осмотр");
    }
    public Doctor assignDoctor(int treatmentPlan) {
        switch (treatmentPlan) {
            case 1:
                return  new Surgeon("Хирург Скальпель А.А");
            case 2:
                return new Dentist("Дантист Имплант В.В");
            default:
                return this;

        }
    }
}
