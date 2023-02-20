package callByValAndRef;

public class Operation {

    int data = 50;

    public int changeInCallByValue(int data){
        data+=100;
        return data;
    }


    public int changeInCallByReference(Operation op){
        op.data+=100;
        return op.data;
    }
}
