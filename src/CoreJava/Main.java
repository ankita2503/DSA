package CoreJava;

public class Main extends AbstractInterfaceImpl {

    public static void main(String[] args) {
        AbstractShape shape = new Circle();
        AbstractShape shape1 = new Square();
        String sh = shape.common(shape.shape());
        String sh1 = shape1.common(shape1.shape());
        System.out.println(sh);
        System.out.println(sh1);


    }

    @Override
    public String square() {
        return "square";
    }

    @Override
    public String rectangle() {
        return "rectangle";
    }
}
