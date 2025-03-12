package je14PilaresPOO;

public class MSNmessenger extends sistemademensagens {
    Boolean online = false;

    public void iniciar() {
        System.out.println("iniciando o aplicativo");
    }

    public void BuscarUsuario() {
        System.out.println("bucando");

    }

    public void trocaravatar() {
        System.out.println("avatar trocado");
    }

    public void recebermensagem() {
        System.out.println("recebeu mensagem");
    }

    public void enviarmensagem() {
        if (online) {
            System.out.println("mensagem enviada");
        } else {
            System.out.println("pc offline");
        }

    }
}