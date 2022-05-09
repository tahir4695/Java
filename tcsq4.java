package Java;

public class tcsq4 {
    public static void parking(int r,int c,int[] arr){
        int[][] a=new int[r][c];
        int i=0,row=-1,count=0,max=0;
        for(int x=0;x<r;x++){
            for(int y=0;y<c;y++){
                a[x][y]=arr[i];
                i++;
            }
        }
        for(int x=0;x<r;x++){
            for(int y=0;y<c;y++){
                if(a[x][y]==1){
                    count++;
                }
            }
            if(max<count){
                max=count;
                row=x;
            }
        }
        System.out.print(row+1);

    }
    public static void main(String[] args) {
        int[] a={0,1,0,1,1,0,1,0,1,1,1,1};
        parking(4, 3, a);
    }
}
