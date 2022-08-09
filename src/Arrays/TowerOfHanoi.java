package Arrays;

public class TowerOfHanoi {

    private static int n=3;
    public static void main(String ... args){
        towerOfHanoi(n,"A","B","C");
    }


    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1,source, destination, helper);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
}
