import java.util.ArrayList;
import java.util.LinkedList;

public class _36 {
    //    https://www.projecteuler.net/problem=36
    static boolean isD(int n){ // FAST
        char[] p = Integer.toString(n).toCharArray();
        char[] b = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < p.length/2; i++) {
            if(p[i] != p[p.length-1-i]) return false;
        }
        for (int i = 0; i < b.length/2; i++) {
            if(b[i] != b[b.length-1-i]) return false;
        }
        return true;
    }
    static void conv(ArrayList<Integer> p, ArrayList<Integer> b, int n){
        int t = n;
        while (t>0){
            p.add(t%10);
            t=t/10;
        }
        t = n;
        while (t>0){
            b.add(t&1);
            t=t>>1;
        }
    }
    static boolean isD2(int n){  // SLOW
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        conv(p,b,n);
        for (int i = 0; i < p.size()/2; i++) {
            if(p.get(i) != p.get(p.size()-1-i)) return false;
        }
        for (int i = 0; i < b.size()/2; i++) {
            if(b.get(i) != b.get(b.size()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe = System.nanoTime();
        int result = 0;
        for (int i = 0; i < 1000000; i++) {
            if(isD(i))result+=i;
        }


        _zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe -= System.nanoTime();
        System.out.println("result="+result);
        System.out.println("seconds="+Math.abs(_zEr0tWoZeRo0nEoNenInEnInEnInE_ThIsIsOnLyFoRBeNcHmArKiNgNoThInGElSe)/(1000.0*1000.0*1000.0));
    }
}
