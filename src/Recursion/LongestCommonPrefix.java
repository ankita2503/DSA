package Recursion;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
String prefix = "flower";
        for(int i=0;i<strs.length-1;i++){
            if(prefix.length()>=strs[i+1].length()){
                prefix = getprefix(prefix, strs[i+1]);
            } else {
                prefix = getprefix(strs[i+1], prefix);
            }

        }

        System.out.println(prefix);

    }

    public static String getprefix(String str1, String str2){
        if(str1.length()==0){
            //System.out.println(str1);
            return str1;
        }
        if(str1.equals(str2)){
            //System.out.println(str1);
            return str1;
        }

        if(str1.length()>str2.length()){
            return getprefix(str1.substring(0,str1.length()-1), str2);
        } else {
            return getprefix(str1.substring(0,str1.length()-1), str2.substring(0,str2.length()-1));
        }


    }
}
