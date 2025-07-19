package interfaceAndAbstractClasses;

public class Accountant implements Employee {
    @Override
    public void printPosition() {
        System.out.println("Должность: Бухгалтер");
    }
}
