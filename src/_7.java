public class _7 {
    //    https://www.projecteuler.net/problem=7
    static boolean isPrime(long n){
        for (int i = 2; i < Math.sqrt(n)+1; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        long result = 1;
        int N = 10001;
        for (int i = 1; i < N;) {
            result++;
            if(isPrime(result)) i++;
        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
