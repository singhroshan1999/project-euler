public class test {
    //    https://www.projecteuler.net/problem=21
    static  int fact_sum(int n){
        int sum = 0;
        for (int i = 1; i < n/2+1; i++) {
            if(n%i==0) sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
//        boolean[] check = new boolean[10000+1];
        for (int i = 0; i <= 100000; i++) {
//            if(check[i] == false){
                int sum_i = fact_sum(i);
                int sum_j = fact_sum(sum_i);
                if(sum_j == i && sum_i != sum_j) result+=sum_i+sum_j;
//                if(sum_i<=10000)check[sum_i] = true;
//                if(sum_j<=10000)check[sum_j] = true;
//            }
        }
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result/2);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
