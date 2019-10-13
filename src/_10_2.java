public class _10_2 {
    //    https://www.projecteuler.net/problem=10

    //fast
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        long result = 0;
        /* sieve of eratosthesis */
        int N = 1000000*2;
        boolean[] sieve = new boolean[N+1];
        for (int i = 2; i <= N; i++) {
            if(sieve[i]) continue;
            for (int j = i+i; j <= N; j+=i) {
                sieve[j] = true;
            }
        }
        for (int i = 2; i < N; i++) {
            if(!sieve[i]) result+=i;
        }


        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
