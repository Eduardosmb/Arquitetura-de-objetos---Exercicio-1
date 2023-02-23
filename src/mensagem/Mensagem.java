package mensagem;
import usuario.Usuario;

public abstract class Mensagem {
    private String data;
    private Usuario destinatario;
    private Usuario remetente;
    private String titulo;

    public Mensagem(String data, Usuario destinatario, String titulo, Usuario remetente) {
        this.data = data;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.remetente = remetente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }
    
}
