import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leitura {

    public List<Box> leArquivo(String relativo) {
        String currDir = System.getProperty("user.dir");
        String completo = currDir + relativo;
        Path p = Paths.get(completo);

        List<Box> boxes = new ArrayList<>();

        try (BufferedReader myFile = Files.newBufferedReader(p, StandardCharsets.UTF_8);
                Scanner reader = new Scanner(myFile)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] dimensions = line.split(" ");
                int d1 = Integer.parseInt(dimensions[0]);
                int d2 = Integer.parseInt(dimensions[1]);
                int d3 = Integer.parseInt(dimensions[2]);
                boxes.add(new Box(d1, d2, d3));
            }
        } catch (Exception e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }

        return boxes;
    }
}
