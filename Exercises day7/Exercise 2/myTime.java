import java.lang.invoke.MutableCallSite;

public class myTime {
    private int hour;
    private int minute;
    private int second;

    public myTime() {

    }

    public myTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public String toString(){
        String h, m, s;
        if(String.valueOf(this.getHour()).length()==1){
            h="0".concat(String.valueOf(this.getHour()));
        }else{
            h=String.valueOf(this.getHour());}

        if(String.valueOf(this.getMinute()).length()==1){
            m="0".concat(String.valueOf(this.getMinute()));
        }else{
            m=String.valueOf(this.getMinute());}

        if(String.valueOf(this.getSecond()).length()==1){
            s="0".concat(String.valueOf(this.getSecond()));
        }else{
            s=String.valueOf(this.getSecond());}

        return h+":"+m+":"+s;
    }
    public myTime nextSecond(){
        this.setSecond(this.getSecond()+1);

        if(second==60){
            this.setMinute(this.getMinute()+1);
            this.setSecond(0);}
        if(minute==60){
            this.setHour(this.getHour()+1);
            this.setMinute(0);}
        if(hour==24){
            this.setHour(0);
           this.setMinute(0);
            this.setSecond(0);
        }
        return this;
    }
    public myTime nextMinute(){
        this.setMinute(this.getMinute()+1);

        if(minute==60){
            this.setMinute(this.getMinute()+1);
            this.setMinute(0);}
        if(hour==24){
            this.setHour(0);
            this.setMinute(0);
            this.setSecond(0);
        }
        return new myTime(this.getHour(),this.getMinute(),this.getSecond());
    }
    public myTime nextHour(){
        this.setHour(this.getHour()+1);

        if(hour==24){
            this.setHour(0);
            this.setMinute(0);
            this.setSecond(0);
        }
        return new myTime(this.getHour(),this.getMinute(),this.getSecond());
    }

    public myTime previousSecond(){
        this.setSecond(this.getSecond()-1);

        if(second==-1){
            this.setSecond(59);
            this.previousMinute();
        }

        return new myTime(this.getHour(),this.getMinute(),this.getSecond());

    }
    public myTime previousMinute(){
        this.setMinute(this.getMinute()-1);

        if(minute==-1){
            this.setMinute(59);
            this.previousHour();
        }

        return new myTime(this.getHour(),this.getMinute(),this.getSecond());
    }
    public myTime previousHour(){
        this.setHour(this.getHour()-1);

        if(hour==-1){
            this.setHour(23);
        }

        return new myTime(this.getHour(),this.getMinute(),this.getSecond());
    }

}
