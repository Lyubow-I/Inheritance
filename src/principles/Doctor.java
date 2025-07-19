package principles;

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void treat() {
        System.out.println("Базовый метод лечения в клинике");
    }
}
