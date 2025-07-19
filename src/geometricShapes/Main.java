package geometricShapes;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 4, 5),
                new Rectangle(2, 5),
                new Circle(4),
                new Triangle(6, 8, 10),
                new Rectangle(3, 3)
        };

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}

