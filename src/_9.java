public class _9 {
    //    https://www.projecteuler.net/problem=9
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        int N = 1000;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N ; j++) {
                for (int k = 0; k <= N ; k++) {
                    if(i+j+k == N && i*i+j*j ==k*k && i < j &&  j < k){
                        result = i*j*k;
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                        System.out.println("-");
                    }
                }
            }
        }
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
