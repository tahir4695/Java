package Java;
import java.lang.Math;
public class square {
    public static int squares(int a, int b){
        int count=0;
        double sr=Math.sqrt(a);
        while((sr*sr)<=b){
            if((sr*sr)>=a){
                count++;
            }
            sr++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(squares(17, 24));
    }
}
