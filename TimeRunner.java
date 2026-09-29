
class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }
}

public class TimeRunner {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hours = 10;
        t1.minutes = 45;
        t1.seconds = 30;
        t1.displayTime();
    }
}