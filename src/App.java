import usuario.Usuario;
import Mensagem.Mensagem;
import Mensagem.MensagemTexto;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario magno = new Usuario("Magno", "magno.magno@magno.magno");
        Usuario celao = new Usuario("Celao", "celao.celao@elon.ma");
        
        Mensagem mensagem = new MensagemTexto("23/02/2023", magno, "Amata quinta?", celao);

        System.out.println(mensagem);

    }
}
