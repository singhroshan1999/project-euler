public class _18 {
    //    https://www.projecteuler.net/problem=18
    public static void main(String[] args) {
        int result = 0;
        String[] num = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23".split(" ");
        int[] number = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            number[i] = Integer.parseInt(num[i]);
        }
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int tcount = 5;
        int count = 4;
        int start = 3;
        int level = 2;
        int start_i = 1;
        int[] dp = new int[number.length];
        dp[0] = number[0];
        dp[1] = number[1]+dp[0];
        dp[2] = number[2]+dp[0];
        int max2 = 0;
        for (int i = 3; i < number.length; i++) {
            int maxA = 0;
            int maxB = 0;
            if(i-level < start ) maxB = dp[i-level]+number[i];
            if(i-level-1 >= level  || i-level >= start_i) maxA = dp[i-level-1] + number[i];
            dp[i] = Math.max(maxA,maxB);
            max2 = Math.max(dp[i],max2);
            if(tcount == i){
                level++;
                tcount+=count;
                count++;
                start_i = start;
                start = i+1;
            }
        }
        result = max2;
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
