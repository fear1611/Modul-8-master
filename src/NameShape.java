public class NameShape extends Shape{
    public String getNameShape(Shape shape) {
        return shape.getNameShape();
    }

    @Override
    public String getNameShape() {
        return "Name Shape";
    }
}
