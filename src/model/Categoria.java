package model;

public class Categoria {

    String categoriaIdade;
    String graducacao;
    String categoriaPeso;
    String tempo;

    public String getCategoriaIdade() {
        return categoriaIdade;
    }

    public void setCategoriaIdade(String categoriaIdade) {
        this.categoriaIdade = categoriaIdade;
    }

    public String getGraducacao() {
        return graducacao;
    }

    public void setGraducacao(String graducacao) {
        this.graducacao = graducacao;
    }

    public String getCategoriaPeso() {
        return categoriaPeso;
    }

    public void setCategoriaPeso(String categoriaPeso) {
        this.categoriaPeso = categoriaPeso;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoriaIdade + " - " +  graducacao.trim().toUpperCase() + " - " +  categoriaPeso + " - Time: " +  tempo;
    }
}
