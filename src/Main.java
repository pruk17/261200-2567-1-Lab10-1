public class Main {
    public static void main(String[] args) {
        Shape shapeC1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape shapeC2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        //Shape shapeC3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        //      Exception in thread "main" java.lang.NullPointerException:
        //      Cannot invoke "Shape.draw()" because "shapeC3" is null
        shapeC1.draw();
        shapeC2.draw();
        //shapeC3.draw();
        Shape shapeR1 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        Shape shapeR2 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        shapeR1.draw();
        shapeR2.draw();
        Shape shapeQ1 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        //Shape shapeQ2 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        //      Exception in thread "main" java.lang.NullPointerException:
        //      Cannot invoke "Shape.draw()" because "shapeQ2" is null
        shapeQ1.draw();
        //shapeQ2.draw();
    }
}