package task6;

public class Time {

    int hour;
    int minute;
    int second;

    public Time(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
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
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
        else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        }
        else {
            this.second = 0;
        }
    }

    public void changeHours(int h) {
        setHour((this.hour + h) % 24);
    }

    public void changeMinutes(int m) {
        int totalM;
        totalM = this.minute + this.hour * 60 + m;
        setHour((totalM / 60) % 24);
        setMinute(totalM % 60);
    }

    public void changeSeconds(int s) {
        int totalS;
        totalS = this.hour * 3600 + this.minute * 60 + this.second + s;
        setHour((totalS / 3600) % 24);
        setMinute((totalS / 60) % 60);
        setSecond(totalS % 60);
    }

    public void showTime() {
        System.out.printf("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    }
}
