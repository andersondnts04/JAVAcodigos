class Hardware {
    void ligar(){
        System.out.println("Ligado");
    }
}
class Pc extends Hardware{
    void ligar(){
        System.out.println("Pc ligado!");
    }
    void computar(){
        System.out.println("Computando");
    }
}

public class Casting03 {
    public static void main(String[] args){
       Hardware a = new Pc();
       a.ligar();
       Pc b = (Pc) a;
       b.computar();
    }
}
