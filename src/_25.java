import java.math.BigInteger;

public class _25 {
    //    https://www.projecteuler.net/problem=25
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
//        int a=1,b=1,c;
        BigInteger a = new BigInteger("1"),b = new BigInteger("1"),c;
//        int _1000 = Math.pow(10,1000);
        int count = 2;
        while(true){
            c=a.add(b);
            b=a;
            a=c;
            count++;
            if(a.toString().length()==1000) break;
        }
        result = count;

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
