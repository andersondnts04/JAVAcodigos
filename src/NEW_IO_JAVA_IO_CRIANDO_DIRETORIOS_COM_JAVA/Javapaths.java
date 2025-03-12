package NEW_IO_JAVA_IO_CRIANDO_DIRETORIOS_COM_JAVA;

import java.io.File;
import java.nio.file.*;
import java.util.List;

public class Javapaths {

    public static void main(String[] args) {
        try {

            Path path = Paths.get("C:\\Users\\ander\\IdeaProjects\\rocketseat\\diretorio_novo\\aula_java.txt");

            //byte[] bytesArquivo = Files.readAllBytes(path);
            List<String> linhas = Files.readAllLines(path);
            linhas.forEach(l-> System.out.println(l));
            //String conteudo = new String(bytesArquivo);
           // System.out.println();

        }catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
