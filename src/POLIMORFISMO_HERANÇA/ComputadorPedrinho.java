package je14PilaresPOO;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        MSNmessenger msn = new MSNmessenger();
        msn.iniciar();
        msn.BuscarUsuario();
        msn.trocaravatar();
        msn.recebermensagem();
        msn.enviarmensagem();
    }
}
