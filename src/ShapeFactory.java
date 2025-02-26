public class ShapeFactory {
    private
    static int Count_circle = 0;
    static int Count_circle_LIMIT = 2;
    static int Count_Rectangle = 0;
    static int Count_Rectangle_LIMIT = 2;
    static int Count_Square = 0;
    static int Count_Square_LIMIT = 2;
    static int All_Count = 0;
    static int All_Count_LIMIT = 5;
    public static final int TYPE_CIRCLE = 0;
    static final int TYPE_RECTANGLE = 1;
    static final int TYPE_SQUARE = 2;

    public static Shape getShape(int shapeType) {
        All_Count++;
        if (All_Count <= All_Count_LIMIT) {
            switch (shapeType) {
                case TYPE_CIRCLE:
                    Count_circle++;
                    if (Count_circle <= Count_circle_LIMIT) return new Circle();
                    return null;
                case TYPE_RECTANGLE:
                    Count_Rectangle++;
                    if (Count_Rectangle <= Count_Rectangle_LIMIT) return new Rectangle();
                    return null;
                case TYPE_SQUARE:
                    Count_Square++;
                    if (Count_Square <= Count_Square_LIMIT) return new Square();
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }
}

