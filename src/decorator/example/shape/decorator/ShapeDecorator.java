package decorator.example.shape.decorator;

import decorator.example.shape.component.Shape;

public abstract class ShapeDecorator implements Shape {
    Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
