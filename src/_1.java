public class _1 {
//    https://www.projecteuler.net/problem=1
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int N = 1000;
        int sum = 0;
        int count = 1;
        int _3 = 0,_5 = 0;
        while(true){
            _3 = 3*count;
            if(_3 >= 1000) break;
            count++;
            if(_3%5 == 0) continue;
            sum+=_3;
        }
        count = 1;
        while(true){
            _5 = 5*count;
            if(_5 >= 1000) break;
            sum+=_5;
            count++;
        }
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();

        System.out.println(sum);
        System.out.println("mills="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/1000.0);
    }
}
