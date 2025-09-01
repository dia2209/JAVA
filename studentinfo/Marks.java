package studentinfo;

public class Marks {
    public int m1, m2, m3;

    public Marks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return total() / 3.0f;
    }
}
