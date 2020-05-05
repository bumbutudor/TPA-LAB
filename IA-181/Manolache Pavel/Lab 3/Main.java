package lab3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Time {
    String date;

    Time() {
        this.date="null";
    }

    Time(String date) {
        this.date=new String(date);
    }


    public void Time(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        this.date = formattedDate;
    }
    public void afis(){
        System.out.println ("Time: "+date);
    }

}

class minutes extends Time {
    String Times,minutesle,seconds;
    int mins;
    int inMIn;
    minutes(String date){
        super(date);
    }
    void inmin(){
        if(super.date.length ()>1){
            Times=super.date.substring (0,2);
            minutesle=super.date.substring (3,5);
            seconds=super.date.substring (6,8);
        }
        int mins2=Integer.parseInt (Times);
        mins=mins2*60;
        int mins4=Integer.parseInt (minutesle);
        inMIn=mins4+mins;
        System.out.println("Time in minutes:"+inMIn+"."+seconds);

    }
    void insec(){
        int sec2=Integer.parseInt (seconds);
        int seconds;
        seconds=inMIn*60+sec2;
        System.out.println("Time in seconds: "+seconds);
    }

}

public class Main {

    public static void main(String[] args) {
        Time d1=new Time ();
        d1.Time ();
        d1.afis ();
        String as;
        as=d1.date;
        minutes m1=new minutes (as);
        m1.inmin ();
        m1.insec ();

    }
}
