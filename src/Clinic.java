class Clinic {
    private String name;

    public Clinic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void treat() {
        System.out.println("Базовый метод лечения в клинике");
    }
}
