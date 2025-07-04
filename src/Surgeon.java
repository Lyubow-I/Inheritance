class Surgeon extends Clinic {
    public Surgeon(String name) {
        super(name);
    }

    public void treat() {
        System.out.println(getName() + " проводит операцию");
    }
}
