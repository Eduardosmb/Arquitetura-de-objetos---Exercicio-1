import usuario.Usuario;
import mensagem.Mensagem;
import mensagem.MensagemTexto;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario magno = new Usuario("Magno", "magno.magno@magno.magno");
        Usuario celao = new Usuario("Celao", "celao.celao@elon.ma");
        
        Mensagem mensagem = new MensagemTexto("23/02/2023", celao, magno, "Jamais off", "Amata quinta?");

        System.out.println(mensagem.getRemetente().getNome());
        System.out.println(mensagem.getTitulo());
        System.out.println(((MensagemTexto) mensagem).getTexto());
        System.out.println(mensagem.getDestinatario().getNome());
        System.out.println(mensagem.getData());
        

    }
}
