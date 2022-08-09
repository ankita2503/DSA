package Arrays;

public class FirstAndLastOccuranceRecursion {
    private static String str ="ankataasaaaaaaaaaaaaa";
    static int first = -1;
    static int last = -1;
    public static void main(String ... args){

        printOccur(str,0);
        System.out.println("First and last Occurance : " + first + "," + last);
    }
    public static void printOccur(String str, int index){
        if(index == str.length()){
            return;
        }
        if(str.charAt(index)=='a') {
            if (first == -1) {
                first = index;

            } else {
                last = index;
            }
        }
        printOccur(str,index+1);
    }
}
