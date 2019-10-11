public class _3 {
    //    https://www.projecteuler.net/problem=3
    static boolean isPrime(long n){
        for (long i = (long) (Math.sqrt(n)+1); i > 2; i--) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        long N = 600851475143L;
        long sqrt = (int)Math.sqrt(N)+1;
        while(true){
            if(N%sqrt == 0 && isPrime(sqrt)) break;
            sqrt--;
        }
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println(sqrt);
        System.out.println("mills="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/1000.0);
    }
}
