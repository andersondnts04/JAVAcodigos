package SWITCH;

public class Switch {
    public static void main(String[] args) {
        String tam ="g" ;
        switch(tam.toUpperCase()){
            case "P":{
                System.out.println("tamanho P");
                break;
            }
            case "M":{
                System.out.println("tamanho M");
                break;
            }
            case "G":{
                System.out.println("tamanho G");
                break;
            }
            default :{
                System.out.println("indefinido");
                break;
            }
        }
    }
}
