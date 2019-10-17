public class _14 {
    //    https://www.projecteuler.net/problem=14
    static int[] dp = new int[1000000+1];
    static {
        dp[0] = 1;
        dp[1] = 1;
    }
    static int compute_n(int i){
        if(i%2 == 0) return i/2;
        return 3*i+1;
    }
    static void fill(int n){
        if(n == 1) return;
        if(dp[n] != 0) return;
        dp[n] = compute_n(n);
        fill(dp[n]);
    }
    static void generate(){
        for (int i = 2; i < 1000000; i++) {
            if(dp[i] == 0) fill(i);
        }
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        generate();



        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
