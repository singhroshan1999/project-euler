public class _4_2 {
    //    https://www.projecteuler.net/problem=4
    static boolean isPalindrom(int n){
        String str = Integer.toString(n);
//        boolean flag = true;
        for (int i = 0; i < str.length()/2+1; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = Integer.MIN_VALUE;

        for (int i = 999; i > 99 ; i--) {
            for (int j = 999; j > 99; j--) {
                int t = i*j;
                if(isPalindrom(t) && result < t)result = i*j;
            }

        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
