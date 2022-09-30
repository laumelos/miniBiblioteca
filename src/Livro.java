import java.util.ArrayList;

public class Livro {
    private String tituloL;
    private ArrayList<String> autores;
    private String ano;
    private String local;

    public Livro(String tituloL, ArrayList<String> autores, String ano, String local) {
        this.tituloL = tituloL;
        this.autores = autores;
        this.ano = ano;
        this.local = local;
    }

    public String getTituloL() {
        return tituloL;
    }

    public void setTituloL(String tituloL) {
        this.tituloL = tituloL;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
