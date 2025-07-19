package interfaceAndAbstractClasses;

public class Worker implements Employee{
    @Override
    public void printPosition() {
        System.out.println("Должность: Рабочий");
    }
}
