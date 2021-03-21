package DrawingTools;

public class ShapeFactory {
    public static Shape initShape(String name) throws Exception {
        if(name.equalsIgnoreCase("Circle")){
            System.out.println("图形工厂生产圆形！");
            return new Circle();
        }
        else if(name.equalsIgnoreCase("Triangle")) {
            System.out.println("图形工厂生产三角形！");
            return new Triangle();
        }
        else if(name.equalsIgnoreCase("Rectangle")) {
            System.out.println("图形工厂生产长方形！");
            return new Rectangle();
        }
        else {
            throw new Exception("对不起，暂不能生产该种图形！");
        }
    }
    public static void deleteShape(String name) throws Exception {
        if(name.equalsIgnoreCase("Circle")){
            System.out.println("已销毁圆形！");
        }
        else if(name.equalsIgnoreCase("Triangle")) {
            System.out.println("已销毁三角形！");
        }
        else if(name.equalsIgnoreCase("Rectangle")) {
            System.out.println("已销毁长方形！");
        }
        else {
            throw new Exception("对不起，图形工厂中没有该种图形！");
        }
    }
}

