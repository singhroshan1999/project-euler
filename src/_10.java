public class _10 {
    //    https://www.projecteuler.net/problem=10
    //slow
    static  boolean isPrime(int n){
        for (int i = 2; i < Math.sqrt(n)+1; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        long result = 2;
        int N = 1000000*2;
        for (int i = 3; i < N; i++) {
            if(isPrime(i)) result+=i;
        }


        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
