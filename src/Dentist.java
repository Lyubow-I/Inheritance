class Dentist extends Doctor {

    public Dentist(String name) {
        super(name);
    }

    public void treat() {
        System.out.println(getName() + " лечит зубы");
    }
}
