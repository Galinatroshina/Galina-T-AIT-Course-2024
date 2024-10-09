package homework_20.model;

abstract class Shape {

    double s;

    public Shape(double s) {
        this.s = s;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();
}

