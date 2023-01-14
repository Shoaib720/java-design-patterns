public class ShapeFactory {

    public Shape getShape(ShapeType shapeType){
        Shape shape = null;
        if (shapeType == ShapeType.CIRCLE) {
            shape = new Circle();
        }
        else if (shapeType == ShapeType.SQUARE) {
            shape = new Square();
        }
        return shape;
    }

}