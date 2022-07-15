import Utils.Loader;
import Utils.TempoDeLuta;
import model.Atleta;
import model.CategoriaPorIdade;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

public class ObterDadosDaCategoriaPorPeso {

    public static Categoria getCategoriaPeso(Atleta atleta, Categoria categoria){

        var categoriaPeso = getDescricao(atleta, categoria);

        return new Categoria(atleta.getNome(), atleta.getFaixa(), categoriaPeso, categoria.getTempo());
    }

    private static String getDescricao(Atleta atleta, Categoria categoria) {
        String categoriaPeso = null;
        String descricao = null;
        Map<String, String> x;
        String genero = atleta.getGenero();
        String peso = atleta.getPeso();

        switch (categoria.getCategoriaIdade()){
            case "Pre Mirim":
                if ((genero.equals("M") && peso <= 17) || (genero.equals("F") && peso <= 15)) {
                    x = Loader.getPesoGalo();
                    descricao = x.get(categoria.getCategoriaIdade());
                }
                break;
            case "Mirim":
            case "Infantil A":
            case "Infantil B":
            case "Infanto Juvenil A":
            case "Infanto Juvenil B":
            case "Juvenil":
            case "Adulto":
            case "Master 1":
            case "Master 2":
            case "Master 3":
            case "Master 4":
            case "Master 5":
            case "Master 6":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + categoria.getCategoriaIdade());
        }
        
        return descricao;
    }
}
