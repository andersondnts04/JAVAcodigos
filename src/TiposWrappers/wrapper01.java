package TiposWrappers;

public class wrapper01 {
    public static void main(String [] args){
        Double number1 = 19.00;
        Double number2 = 20.00;
        String oi = "oi";//curiosidade: String já é um tipo wrapper!
        int comparar = number1.compareTo(number2);

        System.out.println(oi+" String ja é um tipo wrapper!");

        if(comparar < 0){
            System.out.println("A variável number1 é menor que variável number2!");
        } else if (comparar > 0) {
            System.out.println("A variável number1 é maior que a variavel number2!");
        }else{
            System.out.println("As variávies number1 e number2 possuem valores iguais!");
        }
    }
}
