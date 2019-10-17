import java.math.BigInteger;

public class _16_2 {
    //    https://www.projecteuler.net/problem=16
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        BigInteger b = new BigInteger("2");
        for (int i = 0; i < 10; i++) {
            b = b.multiply(b);
        }
        b = b.divide(new BigInteger((Integer.toString((int)Math.pow(2,24)))));
        for (char i : b.toString().toCharArray()) result+=i-'0';

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
