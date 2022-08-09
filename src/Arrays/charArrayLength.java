package Arrays;

public class charArrayLength {

    public static void main(String[] args) {

        String stri = "ankita";
        stri.toCharArray();
        char[] name = new char[]{'a', 'n', 'k', 'i', 't'};
        int count = 0;
        while (true) {
            try {
                char c = name[++count];
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        System.out.println(count);

        String s = "ankita";
        char[] newStr = new char[s.length()];
        int j=0;

        for(int i=s.length()-1;i>=0;i--){
            newStr[j] = s.charAt(i);
            j++;
        }

        for(int i=0;i<s.length();i++){
            System.out.print(newStr[i]);
            }
        }

    }

