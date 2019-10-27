public class _28 {
    // slow 0.02 sec
    //    https://www.projecteuler.net/problem=28
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        int X = 1001;
        int[][] array = new int[X][X];
        int x = 0,y = 0;
        int indx = X/2,indy = X/2;
        boolean xd = false,yd = false;
        for (int i = 1; i <= X*X;) {
            if(!xd && !yd){
                for (int j = 0; j <= x; j++) {
                    array[indy][indx] = i++;
                    indx++;
                }
                xd = true;
                x++;
                continue;
            }else if(xd && !yd){
                for (int j = 0; j <= y; j++) {
                    array[indy][indx] = i++;
                    indy++;
                }
                yd = true;
                y++;
                continue;
            }else if(xd && yd){
                for (int j = 0; j <= x; j++) {
                    array[indy][indx] = i++;
                    indx--;
                }
                xd = false;
                x++;
                continue;
            }else if(!xd && yd){
                for (int j = 0; j <= y; j++) {
                    array[indy][indx] = i++;
                    indy--;
                }
                y++;
                yd = false;
            }
        }
        for (int i = 0; i < X; i++) {
            result+=array[i][i];
            result+=array[i][X-i-1];
        }
        result-=1;
        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
