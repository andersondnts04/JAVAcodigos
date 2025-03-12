package je26_newIO;

import java.io.File;
import java.io.IOException;

public class JavaFile {
    public static void main(String[] args) {
        File diretorio = new File("C:\\Users\\ander\\IdeaProjects\\rocketseat\\diretorio_novo");
        if(!diretorio.exists()){
            diretorio.mkdir(); //cria um diretorio fora de src
        }else{
            System.out.println("diretorio ja existe");
        }
        System.out.println("Diretorio existe? "+diretorio.exists());
       // File arquivo = new File();
        try{
            File novo_diretorio = new File(diretorio, "aula_java.txt");
            System.out.println(novo_diretorio.exists());
            novo_diretorio.createNewFile();
            System.out.println(novo_diretorio.exists());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
