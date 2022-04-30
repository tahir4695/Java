package Java;

public class timeconvorter_12_24{
    public static void timeConversion(String s){
        String hh=s.substring(0,2);
        String mm=s.substring(3,5);
        String ss=s.substring(6,8);
        String ampm=s.substring(8,10);
        int hour=0;
        if(ampm.equals("PM") && !(hh.equals("12"))){
            hour=Integer.valueOf(hh);
            hour+=12;
            hh=String.valueOf(hour);
        }
        if(ampm.equals("AM") && hh.equals("12")){
            hh="00";
        }
        String out=hh+":"+mm+":"+ss;
        System.out.println(out);
    }
    public static void main(String[] args){
        String s="12:45:54PM";
        timeConversion(s);
    }
}