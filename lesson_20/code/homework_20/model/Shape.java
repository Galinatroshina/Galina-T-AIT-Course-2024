package homework_20.model;

//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class Shape {

    private double s;

    public Shape(double s) {
        this.s = s;
    }

    public static double calcArea() {
        return 0;
    }

    public static double calcPerimeter() {
        return 0;
    }
}
