package TiposWrappers;

public class TiposPrimitivos {
    public static void main(String [] args){
        double numDouble = 2.4;
        //converte o numero double para inteiro
        int numInt = (int)Math.round(numDouble);
        System.out.println("aqui o numero convertido em int: " +numInt);
    }
}
