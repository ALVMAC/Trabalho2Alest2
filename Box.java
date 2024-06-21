import java.util.Arrays;

public class Box {

    private int[] dimensions;

    public Box(int d1, int d2, int d3) {
        dimensions = new int[] { d1, d2, d3 };
        // Arrays.sort(dimensions);
    }

    public boolean cabe(Box b) {
        for (int i = 0; i < 3; i++) {
            if (this.dimensions[i] >= b.dimensions[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Box{" +
                "d1=" + dimensions[0] +
                ", d2=" + dimensions[1] +
                ", d3=" + dimensions[2] +
                '}';
    }

}
