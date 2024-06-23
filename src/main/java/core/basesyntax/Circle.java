package core.basesyntax;

import core.basesyntax.enums.FigureType;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void draw() {
        System.out.println("Figure: " + FigureType.CIRCLE.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
