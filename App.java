import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Leitura fileReader = new Leitura();
        Scanner sc = new Scanner(System.in);
        List<Box> boxes = fileReader.leArquivo("\\teste.txt");
        ConstrutorGraph construtor = new ConstrutorGraph();
        Graph graph = construtor.contrutorGrafo(boxes);
        System.out.println(graph.getTotal());
        for (Box b : boxes) {
            System.out.println(b);
        }

        /*
         * while (true) {
         * System.out
         * .println("\nQual caso você deseja\n1.10\n2.20\n3.50\n4.100\n5.200\n6.300\n7.500\n8.1000\n9. sair"
         * );
         * int escolha = sc.nextInt();
         * if (escolha == 1) {
         * 
         * }
         * if (escolha == 2) {
         * 
         * }
         * if (escolha == 3) {
         * 
         * }
         * if (escolha == 4) {
         * 
         * }
         * if (escolha == 5) {
         * 
         * }
         * if (escolha == 6) {
         * 
         * }
         * if (escolha == 7) {
         * 
         * }
         * if (escolha == 8) {
         * 
         * }
         * if (escolha == 9) {
         * System.out.println("Saindo...");
         * sc.close();
         * break;
         * }
         * }
         */
    }
}