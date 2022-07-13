import Utils.TempoDeLuta;
import model.CategoriaPorIdade;

import java.text.SimpleDateFormat;
import java.util.*;

public class ObterDadosDaCategoriaIdade {

    public static String getCategoriaTempo(int anoNascimento, String faixa){
        var categoriaIdade = getCodigoCategoria(getIdade(anoNascimento));
        var codigoFaixa = getCodigoFaixa(faixa);
        var categoriaGraduacao = categoriaIdade.getCodigo().concat(codigoFaixa);

        var tempo =  getTempoDeLuta(categoriaGraduacao);
        return new Categoria(categoriaIdade.getNome(), faixa.trim().toUpperCase(), 99.9, tempo).toString();
    }

    public static int getIdade(Integer anoNascimento){
        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
        Date date =  new Date(System.currentTimeMillis());
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int anoCorrente = calendar.get(Calendar.YEAR);
        return anoCorrente - anoNascimento;
    }

    public static CategoriaPorIdade getCodigoCategoria(int idade){
        String codigo = null;
        String nome = null;
        if(idade > 3) {
            switch (idade){
                case 4: case 5:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.PRE_MIRIM.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.PRE_MIRIM.getNomeCategoria();
                    break;
                case 6: case 7:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MIRIM.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MIRIM.getNomeCategoria();
                    break;
                case 8: case 9:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.INFANTIL_A.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.INFANTIL_A.getNomeCategoria();
                    break;
                case 10: case 11:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.INFANTIL_B.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.INFANTIL_B.getNomeCategoria();
                    break;
                case 12: case 13:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.INFANTO_JUVENIL_A.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.INFANTO_JUVENIL_A.getNomeCategoria();
                    break;
                case 14: case 15:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.INFANTO_JUVENIL_B.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.INFANTO_JUVENIL_B.getNomeCategoria();
                    break;
                case 16: case 17:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.JUVENIL.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.JUVENIL.getNomeCategoria();
                    break;
                case 18: case 19: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.ADULTO.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.ADULTO.getNomeCategoria();
                    break;
                case 30: case 31: case 32: case 33: case 34: case 35:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MASTER_1.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MASTER_1.getNomeCategoria();
                    break;
                case 36: case 37: case 38: case 39: case 40:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MASTER_2.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MASTER_2.getNomeCategoria();
                    break;
                case 41: case 42: case 43: case 44: case 45:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MASTER_3.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MASTER_3.getNomeCategoria();
                    break;
                case 46: case 47: case 48: case 49: case 50:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MASTER_4.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MASTER_4.getNomeCategoria();
                    break;
                case 51: case 52: case 53: case 54: case 55:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MASTER_5.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MASTER_5.getNomeCategoria();
                    break;
                default:
                    codigo = CategoriaPorIdadeEnum.getCodigoByCategoria(CategoriaPorIdadeEnum.MASTER_6.getNomeCategoria());
                    nome = CategoriaPorIdadeEnum.MASTER_6.getNomeCategoria();
                    break;
            }
        } else {
            return  new CategoriaPorIdade(nome, codigo);
        }
        return new CategoriaPorIdade(nome, codigo);
    }

    public static String getTempoDeLuta(String codigoCategoriaFaixa){
        return TempoDeLuta.getTempo(codigoCategoriaFaixa);
    }

    public static String getCodigoFaixa(String faixa){
        String codigo = null;
        switch (faixa.trim().toUpperCase()){
            case "BRANCA":
            case "CINZA":
            case "AMARELA":
            case "LARANJA":
            case "VERDE":
            case "AZUL":
            case "ROXA":
            case "MARROM":
            case "PRETA":
                codigo = FaixaEnum.getCodigoByFaixa(faixa);
                break;
            default:
                break;
        }
        return codigo.toUpperCase();
    }
}
