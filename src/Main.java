public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rhombus = new Rhombus();
        Shape octagon = new Octagon();

        NameShape nameShape = new NameShape();

        
        System.out.println(nameShape.getNameShape(triangle));

    }
}