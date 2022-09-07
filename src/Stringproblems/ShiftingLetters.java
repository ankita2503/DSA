package Stringproblems;

public class ShiftingLetters {

    public static void main(String[] args) {
        String str = "bad";
        int[] shifts = {10,20,30};
        char[] s = str.toCharArray();
        int j=0;
        int inc=0;
        while(j<shifts.length){
            for(int i=0;i<=j;i++){
                char ch = s[i];
                if(ch+shifts[j]>122){
                    inc = 97+ (122-ch);
                } else {
                    inc = shifts[j];
                }
                s[i]+=inc;
            }
            j++;
        }

        System.out.println(new String(s));
    }
}
