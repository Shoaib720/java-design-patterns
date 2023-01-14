public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
