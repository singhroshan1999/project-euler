public class _28_2 {
    //fast 10^-4 sec
    //    https://www.projecteuler.net/problem=28
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 1;
        int X = 1001;
        int q = 0;
        int odd = 2;
        for (int i = 3; i <= X*X; i+=odd) {
            result+=i;
            q++;
            if(q == 4){
                odd+=2;
                q = 0;
            }
        }
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
