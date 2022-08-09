package Arrays;

public class MoveAllXToEndRecursion {
    private static int count = 0;
    private static String newStr = new String();
    public static void main(String[] args) {
        String str = "axnxkitxa";
        move(str,0);
        System.out.println(newStr);
    }

    public static void move(String str, int i) {
        if (i == str.length()) {
            for(int k=0;k<count;k++){
                newStr+="x";
            }
            return;
        }
        if (str.charAt(i) == 'x') {
            count++;
        } else {
            newStr = newStr + str.charAt(i);
        }
        move(str, i + 1);
    }


}
