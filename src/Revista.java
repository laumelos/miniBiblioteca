import java.util.ArrayList;

public class Revista {

    private String tituloR;
    private ArrayList<String> autores;
    private String ano;
    private String local;

    public Revista(String tituloR, ArrayList<String> autores, String ano, String local) {
        this.tituloR = tituloR;
        this.autores = autores;
        this.ano = ano;
        this.local = local;
    }

    public String getTituloR() {
        return tituloR;
    }

    public void setTituloR(String tituloR) {
        this.tituloR = tituloR;
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
