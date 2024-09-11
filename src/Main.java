import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "ABC";

        permute(str.toCharArray(), 0);
    }

    public static void permute(char[] seq, int pos){
        for (int i = 0; i < seq.length; i++) {

            System.out.println(Arrays.toString(seq));

            int pos1 = pos+1;
            int pos2 = pos1+1;

            bytt(seq, pos1, pos2);
            permute(seq, pos+1);
            bytt();
        }

    }

    public static void bytt(char[] seq, int pos1, int pos2){
        char temp = seq[pos1];
        seq[pos1] = seq[pos2];
        seq[pos2] = temp;
    }
}