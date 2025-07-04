class Dentist extends Clinic {

    public Dentist(String name) {
        super(name);
    }

    public void treat() {
        System.out.println(getName() + " лечит зубы");
    }
}
