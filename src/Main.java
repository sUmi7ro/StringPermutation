import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "ABC";

        permute(str.toCharArray(), 0);
        //System.out.println(str);
    }

    public static void permute(char[] seq, int pos){
        System.out.println(pos);
        for (int i=0;i < seq.length-1 && pos < seq.length-1;i++) {
            //if(pos >= seq.length) return;
            int pos1 = i*2;

            //System.out.println("i="+i);
            int pos2 = pos;


            bytt(seq, pos1, pos2);
            System.out.println(Arrays.toString(seq));
            //System.out.println("p="+pos);
            permute(seq, pos+1);
            bytt(seq, pos2, pos1);
        }

        /*
        * Bytt en og la neste gjøre resten.
        * */
    }

    public static void bytt(char[] seq, int pos1, int pos2){
        //System.out.println(pos1+" "+pos2);
        char temp = seq[pos1];
        seq[pos1] = seq[pos2];
        seq[pos2] = temp;
    }
}