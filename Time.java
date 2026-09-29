public class Time {
    private int hr;
    private int min;
    private int sec;

    public Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Time(int hr, int min, int sec) {
        if (hr >= 0 && hr <= 23) {
            this.hr = hr;
        } else {
            this.hr = 0;
        }

        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            this.min = 0;
        }

        if (sec >= 0 && sec <= 59) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }

    public void display() {
        System.out.println(String.format("%02d:%02d:%02d", hr, min, sec));
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(14, 30, 45);
        Time t3 = new Time(25, 70, 90); // invalid values

        t1.display();
        t2.display();
        t3.display();
    }
}
