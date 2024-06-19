public class Box {

    private int d1, d2, d3;

    public Box(int d1, int d2, int d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public boolean cabe(Box b) {
        if ((this.d1 * this.d2 * this.d3) > (b.d1 * b.d2 * b.d3)) {
            return true;
        }
        return false;
    }
}
