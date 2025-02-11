import java.sql.SQLOutput;

public class Media {
    public static void main(String [] args){
        double nota1 = 8.0;
        double nota2 = 5.0;
        double media = (nota1 + nota2)/ 2;
        if(media>6) {
            System.out.println("Aprovado! " + media);
        }
        else if (media==6) {
            System.out.println("Prova final " + media);
        }
        else {
            System.out.println("Reprovado " + media);
        }
            int x = 1;
        for(x=1; x<=5; x++){
            System.out.println("retorno: " + x);
            if (x == 4) {
                System.out.println("aqui o 4: " + x);
            }
        }
    }
}
