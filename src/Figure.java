/**
 * Created by kolesnik_s on 09.01.16.
 */

public abstract class Figure {
    private String name;
    private double radius;
    private double high;
    private double whide;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWhide() {
        return whide;
    }

    public void setWhide(double whide) {
        this.whide = whide;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
}

class Square extends Figure {
    public Square(double high, double whide) {
        this.setHigh(high);
        this.setWhide(whide);
        this.setName("Square");
    }
    @Override
    public double area() {
        return  ( this.getHigh() * this.getWhide() );
    }
}

class Tringle extends Figure {
    public Tringle(double whide, double high) {
        this.setHigh(high);
        this.setWhide(whide);
        this.setName("Tringle");
    }
    @Override
    public double area() {
        return (this.getHigh() * this.getWhide() / 2);
    }
}

class Circle extends Figure {
    public Circle(double radius) {
        this.setRadius(radius);
        this.setName("Circle");
    }
    @Override
    public double area() {
        return ( Math.PI * Math.pow(this.getRadius(), 2) );
    }
}






