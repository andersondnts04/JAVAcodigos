package People;

public class UsingSet {
    private String nome;
    public void setnome(String newname){
        this.nome=newname;
    }
    public String getnome(){
        return this.nome;
    }
    public static void main(String[] args){
        UsingSet cliente = new UsingSet();
        cliente.setnome("Junior");
        System.out.println(cliente.getnome());
    }
}
