package DrawingTools;

public class Client {
    public static void main(String args[])
    {
        try {
            Shape shape;
            shape = ShapeFactory.initShape("Circle");
            shape.init();
            /*
            shape = ShapeFactory.initShape("Triangle");
            shape.init();
            shape = ShapeFactory.initShape("Rectangle");
            shape.init();
            shape = ShapeFactory.initShape("app");
            shape.init();
            */
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
