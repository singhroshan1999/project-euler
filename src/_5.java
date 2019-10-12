public class _5 {
    //    https://www.projecteuler.net/problem=5
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 1;
        for (int i = 1; i < 20; i++) {
            result = lcm(result,i);
        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("mills="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
