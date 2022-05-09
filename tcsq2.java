package Java;

public class tcsq2 {
    public static void star_hash(String s){
        int star=0,hash=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                star++;
            }
            else{
                hash++;
            }
        }
        System.out.println(star-hash);
    }
    public static void main(String[] args) {
        String s="*##";
        star_hash(s);
    }
}
