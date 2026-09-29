public class Marks {
    private int m1;
    private int m2;
    private int m3;

    public Marks() {
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }

    public Marks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int sum() {
        return m1 + m2 + m3;
    }

    public static void main(String[] args) {
        Marks s1 = new Marks();
        Marks s2 = new Marks(80, 75, 90);

        System.out.println("Sum of s1: " + s1.sum());
        System.out.println("Sum of s2: " + s2.sum());
    }
}
