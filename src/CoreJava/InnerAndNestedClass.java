package CoreJava;

public class InnerAndNestedClass {

    public class Inner {
        int innerObj = 10;

        public int getObj() {
            return innerObj;
        }
    }

    public static class Nested {
        int nestedObj = 20;

        public int getObj() {
            return nestedObj;
        }
    }


}

