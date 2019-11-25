import java.util.Arrays;

public class _34 {
    //    https://www.projecteuler.net/problem=34
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        int[] F = new int[10];
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i < 10; i++) {
            F[i] = F[i-1]*i;
        }
        System.out.println(Arrays.toString(F));
        for (int i = 3; i < 10000000; i++) {
            int n = 0;
            for (char c : Integer.toString(i).toCharArray()){
                n+=F[c-'0'];
            }
            if(n == i){
                result+=i;
            }
        }
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
