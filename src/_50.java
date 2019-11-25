public class _50 {
    //TODO

    //    https://www.projecteuler.net/problem=50
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        boolean[] sieve = new boolean[1000000];
        for (int i = 2; i < sieve.length; i++) {
            if(sieve[i] == true) continue;
            for (int j = i+i; j < sieve.length; j+=i) {
                sieve[j] = true;
            }
        }
        for (int i = 2; i < sieve.length; i++) {
            if(sieve[i] == true) continue;


        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
