package callByValAndRef;

public class main {

    public static void main(String[] args) {
        Operation op = new Operation();

        op.changeInCallByValue(100);
        System.out.println("After Call By Value" + op.data);
        op.changeInCallByReference(op);
        System.out.println("After Call By Reference" + op.data);

    }
}
