package service;

import Utils.Loader;
import Utils.TempoDeLuta;
import model.Atleta;
import model.Categoria;
import model.CategoriaPorIdade;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

public class GetCategoryData {

    public  Atleta formatDataCategory(Atleta atleta){

        var categoriaIdade = getCategoryCode(getAge(atleta.getAnoNascimento()));

        var categoria = new Categoria();
        categoria.setCategoriaIdade(categoriaIdade.getNome());
        categoria.setCategoriaPeso(ObterDadosDaCategoriaPorPeso.getDescricao(categoriaIdade.getNome(), atleta.getGenero(), atleta.getPeso()));
        categoria.setGraducacao(atleta.getFaixa());
        categoria.setTempo(getTimeOfFight(categoriaIdade.getCodigo().concat(getBeltCode(atleta.getFaixa()))));

        atleta.setCategoria(categoria);

        return atleta;
    }

    private int getAge(Integer anoNascimento){
        Date date =  new Date(System.currentTimeMillis());
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int anoCorrente = calendar.get(Calendar.YEAR);
        return anoCorrente - anoNascimento;
    }

    private  CategoriaPorIdade getCategoryCode(int idade){
        String code = null;
        String name = null;
        if(idade > 3) {
            switch (idade){
                case 4: case 5:
                    name = "Pre Mirim";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 6: case 7:
                    name = "Mirim";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 8: case 9:
                    name = "Infantil A";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 10: case 11:
                    name = "Infantil B";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 12: case 13:
                    name = "Infanto Juvenil A";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 14: case 15:
                    name = "Infanto Juvenil B";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 16: case 17:
                    name = "Juvenil";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 18: case 19: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
                    name = "Adulto";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 30: case 31: case 32: case 33: case 34: case 35:
                    name = "Master 1";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 36: case 37: case 38: case 39: case 40:
                    name = "Master 2";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 41: case 42: case 43: case 44: case 45:
                    name = "Master 3";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 46: case 47: case 48: case 49: case 50:
                    name = "Master 4";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                case 51: case 52: case 53: case 54: case 55:
                    name = "Master 5";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
                default:
                    name = "Master 6";
                    code = Loader.loadCategoryByAge().get(name);
                    break;
            }
        } else {
            return  new CategoriaPorIdade(name, code);
        }
        return new CategoriaPorIdade(name, code);
    }

    private  String getTimeOfFight(String codigoCategoriaFaixa){
        return TempoDeLuta.getTime(codigoCategoriaFaixa);
    }

    private  String getBeltCode(String belt){
        String code = null;
        Map<String, String> mapBelt = Loader.loadBelt();
        belt = belt.trim().toUpperCase();
        switch (belt){
            case "BRANCA":
            case "CINZA":
            case "AMARELA":
            case "LARANJA":
            case "VERDE":
            case "AZUL":
            case "ROXA":
            case "MARROM":
            case "PRETA":
                code = mapBelt.get(belt);
                break;
            default:
                break;
        }
        return code.trim().toUpperCase();
    }
}
