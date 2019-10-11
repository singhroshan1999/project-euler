public class _2 {
    //    https://www.projecteuler.net/problem=2
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        long result = 0;
        int a0 = 1,a1 = 1;
        int curr = 0;
        while(curr <=4000000){
            if(curr%2==0) {result+=curr;
            };
            curr = a0+a1;
            a0 = a1;
            a1 = curr;
        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("mills="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/1000.0);
    }
}
