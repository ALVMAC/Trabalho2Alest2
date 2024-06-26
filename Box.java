import java.util.Arrays;

public class Box {

    private int[] dimensoes;

    public Box(int d1, int d2, int d3) {
        dimensoes = new int[] { d1, d2, d3 };
        Arrays.sort(dimensoes);
    }

    public boolean cabe(Box b) {
        for (int i = 0; i < 3; i++) {
            if (this.dimensoes[i] >= b.dimensoes[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Box{" +
                "d1=" + dimensoes[0] +
                ", d2=" + dimensoes[1] +
                ", d3=" + dimensoes[2] +
                '}';
    }

}
