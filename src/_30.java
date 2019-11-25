public class _30 {
    //    https://www.projecteuler.net/problem=30
    static int digitsum(int n){
        int sum = 0;
        for(char i : Integer.toString(n).toCharArray()) sum+=Math.pow(i-'0',5);
        return sum;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        int N = 10000000;
        for (int i = 2; i <N ; i++)
            if(i == digitsum(i)) result+=i;
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
