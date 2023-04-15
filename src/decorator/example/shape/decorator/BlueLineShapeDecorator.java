package decorator.example.shape.decorator;

import decorator.example.shape.component.Shape;

public class BlueLineShapeDecorator extends ShapeDecorator {

    public BlueLineShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Added Blue Line to the shape");
    }
}
