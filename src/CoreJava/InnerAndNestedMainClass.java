package CoreJava;

public class InnerAndNestedMainClass {

    public static void main(String[] args) {

        InnerAndNestedClass obj = new InnerAndNestedClass();

        InnerAndNestedClass.Inner o = obj.new Inner();
        System.out.println(o.getObj());

        InnerAndNestedClass.Nested o1 = new InnerAndNestedClass.Nested();
        System.out.println(o1.getObj());


    }


}

