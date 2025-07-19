package interfaceAndAbstractClasses;

public class Main {
    public static void main(String[] args) {
        Employee director = new Director();
        Employee worker = new Worker();
        Employee accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
