package principles;

class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
    }

    public void treat() {
        System.out.println(getName() + " проводит операцию");
    }
}
