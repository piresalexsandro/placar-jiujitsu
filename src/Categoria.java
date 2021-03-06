
public class Categoria {

    String categoriaIdade;
    String graducacao;
    double peso;
    String tempo;

    public Categoria() {
    }

    public Categoria(String categoriaIdade, String graducacao, double peso, String tempo) {
        this.categoriaIdade = categoriaIdade;
        this.graducacao = graducacao;
        this.peso = peso;
        this.tempo = tempo;
    }

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoriaIdade + " - " +  graducacao + " - " +  peso + " - Tempo: " +  tempo;
    }
}
