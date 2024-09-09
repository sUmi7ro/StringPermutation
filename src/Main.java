public class Main {
    public static void main(String[] args) {
        String str = "ABCD";

        permute(str.toCharArray(), 0);
    }

    public static void permute(char[] seq, int pos){
        for (int i = 0; i < seq.length; i++) {
            bytt(seq, seq[pos], seq[pos+1]);
            permute(seq, pos+1);
            bytt();
        }

    }

    public static void bytt(char[] seq, char c1, char c2){

    }
}