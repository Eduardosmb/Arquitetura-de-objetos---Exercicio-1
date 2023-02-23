package mensagem;

import usuario.Usuario;

public class MensagemTexto extends Mensagem{
    
    private String texto;
    
    public MensagemTexto(String data, Usuario destinatario, Usuario remetente, String titulo, String texto) {
        super(data, destinatario, titulo, remetente);
        this.texto = texto;
        
    }
    

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
