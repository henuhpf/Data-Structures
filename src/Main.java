public class Main {

    private static int[] getNex(String str){
        if(str.length() == 1){
            return new int[]{-1};
        }
        int[] next = new int[str.length()];
        next[0] = -1;
        next[1] = 0;
        int cn = 0;
        int i = 2;
        while(i < str.length()){
            if(str.charAt(i - 1) == str.charAt(cn)) {
                cn ++;
                next[i++] = cn;
            }else if(cn > 0){
                cn = next[cn];
            }else{
                next[i ++] = 0;
            }
        }
        return next;
    }
    public static void main(String[] args) {

    }
}
