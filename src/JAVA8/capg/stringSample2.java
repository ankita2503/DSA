package JAVA8.capg;

public class stringSample2 {

    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        int c=0;
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                c++;
            }
        }

        for(int i=0;i<c;i++){
            builder.append('#');
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='#'){
                builder.append(str.charAt(i));
            }
        }

        System.out.println(builder.toString());

    }
}
