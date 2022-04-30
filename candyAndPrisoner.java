package Java;

public class candyAndPrisoner{
    public static int saveThePrisoner(int n, int m, int s){
        //n=number of prisoner
        //m=number of candy
        //s=starting number
        int num=0;
        int flag=1;
        int i=0;
        while (num<m){
            for(i=s;i<=n;i++){
                if(num<m){
                    num+=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                break;
            }
            s=1;
        }
        return i-1;
    }
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(3, 394274638, 3));
    }
}