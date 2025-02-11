//upcasting e downcasting

class Animal {
    void fazerSom() {
        System.out.println("emitir um som");
    }
}

    class Cachorro extends Animal{
        void fazerSom() {
            System.out.println("cachorro latindo!!");
        }
            void cavar(){
            System.out.println("cachorro cavando!!");
            }
    }


public class Casting02 {
    public static void main(String[]args){
        Animal a = new Cachorro();
        a.fazerSom();
        Cachorro c = (Cachorro) a;
        c.cavar();
    }

}
