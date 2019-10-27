import java.util.Arrays;
// wrong
public class _23 {
    //    https://www.projecteuler.net/problem=23
    static int fact_sum(int n){
        int sum = 0;
        for (int i = 1; i < n/2+1; i++) {
            if(n%i==0) sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        int[] abdno = new int[28123];
        int acount = 0;
        for (int i = 1; i < 28123; i++) {
            int f = fact_sum(i);
            if(f > i) abdno[acount++] = i;
        }
//        acount;
        int count = 0;
        int[] sumnum = new int[acount*acount];
        for (int i = 0; i < acount; i++) {
            for (int j = 0; j < acount; j++) {
                sumnum[count++] = abdno[i]+abdno[j];
            }
        }
        Arrays.sort(sumnum);
//        System.out.println(Arrays.toString(Arrays.copyOfRange(abdno,0,acount)));
//        for(int i : sumnum) System.out.print(i+" ");
        count = 0;
        for (int i = 0; i < 28123+1; i++) {
            if(i!=sumnum[count]) result+= i;
            if(i == sumnum[count]) count++;
        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
