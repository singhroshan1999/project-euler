public class _12 {
    //    https://www.projecteuler.net/problem=12

    static int MAX = 100000001;
    static int factor[];
    static void generatePrimeFactors()
    {
        factor[1] = 1;
        for (int i = 2; i < MAX; i++)
            factor[i] = i;
        for (int i = 4; i < MAX; i += 2)
            factor[i] = 2;
        for (int i = 3; i * i < MAX; i++) {
            if (factor[i] == i) {
                for (int j = i * i; j < MAX; j += i) {
                    if (factor[j] == j)
                        factor[j] = i;
                }
            }
        }
    }

    static int calculateNoOFactors(int n)
    {
        if (n == 1)
            return 1;

        int ans = 1;

        int dup = factor[n];
        int c = 1;
        int j = n / factor[n];
        while (j != 1) {
            if (factor[j] == dup)
                c += 1;
            else {
                dup = factor[j];
                ans = ans * (c + 1);
                c = 1;
            }
            j = j / factor[j];
        }
        ans = ans * (c + 1);

        return ans;
    }
    static int countFactor(int n){
        int count = 0;
        for (int i = 1; i < n/2+1; i++) {
            if(n%i == 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        int count = 500;
        int lastn = 1;
        int tno = 0;
        factor = new int[MAX];
        factor[0] = 0;
        generatePrimeFactors();
        while(true){
            tno+=lastn++;

//            int c = countFactor(tno);
//            System.out.println(tno+" "+c );
//            if(tno > 100) break;
            if(calculateNoOFactors(tno) >= count){
                result = tno;
                break;
            }
        }

        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
