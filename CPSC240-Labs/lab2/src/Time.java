

public class Time {
    public Time(int hour, int min, int sec) {
        this.hour =hour;
        this.min=min;
        this.sec=sec;

    }


    private Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    private int hour;
    private int min;
    private int sec;


    public static void main(String [] args){

        Time t1 = new Time();
        Time t2 = new Time(17, 30, 0);

        t1.increment(3600);
        t1.print(true);
        t1.print(false);

        t2.increment(5430);
        t2.print(true);
        t2.print(false);

    }

    public void increment(int sec){
        int t;
        t= this.hour*3600+this.min*60+this.sec+sec;
        int temp;
        int r;


        temp=t/3600;
        this.hour=temp;
        r=t%3600;
        t=r;

        temp=t/60;
        this.min=temp;
        r=t%60;

        this.sec= r;


    }

    public void print(boolean military){
       String tMin="-1";
       String tSec="-1";
        if (this.min<10)
            tMin= "0"+ this.min;
        else
            tMin=""+this.min;

        if (this.sec<10)
            tSec= "0"+ this.sec;
        else
            tSec=""+this.sec;
       String h;

        if (military==true){
            h = this.hour+":"+tMin+":"+tSec;
            System.out.println(h);
        }

        if(military==false)
        {
            if (this.hour>=12)
            {
                h=this.hour-12 + ":"+tMin+":"+tSec +" pm";
                System.out.println(h);
            }
            else {
                h=this.hour + ":"+tMin+":"+tSec +" am";
                System.out.println(h);
            }
        }

    }
}
