public class _4 {
    //    https://www.projecteuler.net/problem=4
    static boolean divide_check(int x,int y,int n){
        for (int i = x; i <= y; i++) {
            if(n%i == 0) return true;
        }
        return false;
    }
    static int max_out(int n,int di,int d,int limit){
        int temp = n;
        while(limit >= temp){
            n = temp;
//            System.out.println("t"+n);
            temp += Math.pow(10,di) + Math.pow(10,d-di);
        }
        return n;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;

        int N = 999*999;
        int d = Integer.toString(N).length()-1;
        int di = d;
        int n = 0;
//        System.out.println(d);
        while(di > d/2 ){
            System.out.println(di);
            n = max_out(n,di,d,N);
            di--;
        }
        result = n;


        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("mills="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0));
    }
}
