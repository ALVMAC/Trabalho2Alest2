import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Leitura fileReader = new Leitura();
        Scanner sc = new Scanner(System.in);
        // for (Box b : boxes) {
        // System.out.println(b);
        // }

        while (true) {
            System.out.println("\nQual caso você deseja\n" +
                    "1. 10\n" +
                    "2. 20\n" +
                    "3. 50\n" +
                    "4. 100\n" +
                    "5. 200\n" +
                    "6. 300\n" +
                    "7. 500\n" +
                    "8. 1000\n" +
                    "9. 2000\n" +
                    "10. 5000\n" +
                    "11. 10000\n" +
                    "12. sair");

            int escolha = sc.nextInt();
            String fileName = "";

            switch (escolha) {
                case 1:
                    fileName = "/caso00010.txt";
                    break;
                case 2:
                    fileName = "/caso00020.txt";
                    break;
                case 3:
                    fileName = "/caso00050.txt";
                    break;
                case 4:
                    fileName = "/caso00100.txt";
                    break;
                case 5:
                    fileName = "/caso00200.txt";
                    break;
                case 6:
                    fileName = "/caso00300.txt";
                    break;
                case 7:
                    fileName = "/caso00500.txt";
                    break;
                case 8:
                    fileName = "/caso01000.txt";
                    break;
                case 9:
                    fileName = "/caso02000.txt";
                    break;
                case 10:
                    fileName = "/caso05000.txt";
                    break;
                case 11:
                    fileName = "/caso10000.txt";
                    break;
                case 12:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Escolha uma opção valida, amigao");
                    continue;
            }

            List<Box> boxes = fileReader.leArquivo(fileName);
            Caminho construtor = new Caminho();
            Graph g = new Graph();
            construtor.construtorGraph(boxes, g);
            System.out.println(construtor.encontrarMaior(g, boxes));
        }
    }
}