import Utils.Loader;

public class DadosFixos {

    public static void loader(){
        var faixa = Loader.carregaFaixa();
        var categoriaIdade = Loader.carregaCategoriaIdade();
        var categoriaTempo = Loader.carregarCategoriaTempo();
        var pesoGalo = Loader.carregaPesoGalo();
        var pesoPluma = Loader.carregaPluma();
        var pesoPena = Loader.carregaPena();
        var pesoLeve = Loader.carregaLeve();
        var pesoMedio = Loader.carregaMedio();
        var pesoMeioPesado = Loader.caregaMeioPesado();
        var pesado = Loader.carregaPesado();
        var pesoSuperPesado = Loader.carregaSuperPesado();
        var pesoPesadissimo = Loader.carregaPesadissimo();
        var pesoExtraPesadissimo = Loader.carregaExtraPesadissimo();
    }
}
