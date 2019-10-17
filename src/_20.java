import java.math.BigInteger;

public class _20 {
    //    https://www.projecteuler.net/problem=20
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;

        BigInteger b = new BigInteger("1");
        for (int i = 2; i <= 100; i++) {
            b = b.multiply(new BigInteger(Integer.toString(i)));
        }
        for (char i : b.toString().toCharArray()) result+=i-'0';
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
