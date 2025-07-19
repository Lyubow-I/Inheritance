package interfaceAndAbstractClasses;

public class Director implements Employee{
    @Override
    public void printPosition() {
        System.out.println("Должность: Директор");
    }
}
