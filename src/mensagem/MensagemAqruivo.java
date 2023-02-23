package mensagem;

import usuario.Usuario;

public class MensagemAqruivo extends Mensagem {

    private String url;
    private Integer tamanho_arquivo_mb;
    private String nome_arquivo;
    
    public MensagemAqruivo(String data, Usuario destinatario, String titulo, String url, Integer tamanho_arquivo_mb, String nome_arquivo, Usuario remetente) {
        super(data, destinatario, titulo, remetente);
        this.url = url;
        this.tamanho_arquivo_mb = tamanho_arquivo_mb;
        this.nome_arquivo = nome_arquivo;
    }
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getTamanho_arquivo_mb() {
        return tamanho_arquivo_mb;
    }
    public void setTamanho_arquivo_mb(Integer tamanho_arquivo_mb) {
        this.tamanho_arquivo_mb = tamanho_arquivo_mb;
    }
    public String getNome_arquivo() {
        return nome_arquivo;
    }
    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }
}
