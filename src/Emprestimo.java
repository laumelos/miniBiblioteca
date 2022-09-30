public class Emprestimo {
    String data;
    String login;
    Revista tituloR;
    Livro tituloL;
    String dataDevolucao;

    public Emprestimo(String data, String login, Revista tituloR, Livro tituloL, String dataDevolucao) {
        this.data = data;
        this.login = login;
        this.tituloR = tituloR;
        this.tituloL = tituloL;
        this.dataDevolucao = dataDevolucao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Revista getTituloR() {
        return tituloR;
    }

    public void setTituloR(Revista tituloR) {
        this.tituloR = tituloR;
    }

    public Livro getTituloL() {
        return tituloL;
    }

    public void setTituloL(Livro tituloL) {
        this.tituloL = tituloL;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
