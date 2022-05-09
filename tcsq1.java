package Java;

public class tcsq1 {
    public static void ftw(int v,int w){
        int fw=(w-(2*v))/2;
        System.out.print("FW="+fw);
        System.out.println("TW="+(v-fw));
    }
    public static void main(String[] args) {
        ftw(200, 540);
    }
}
