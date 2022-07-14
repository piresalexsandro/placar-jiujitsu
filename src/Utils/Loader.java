package Utils;

import java.util.HashMap;
import java.util.Map;

public class Loader {
    public static Map<String, String> carregaFaixa() {
        Map<String, String> fx = new HashMap<>();
        fx.put("BRANCA", "B");
        fx.put("CINZA", "C");
        fx.put("AMARELA", "A");
        fx.put("LARANJA", "L");
        fx.put("VERDE", "V");
        fx.put("AZUL", "A");
        fx.put("ROXA", "R");
        fx.put("MARROM", "M");
        fx.put("PRETA", "P");
        return fx;
    }

    public static Map<String, Map<String, String>> carregaCategoriaIdade() {
        Map<String, String> categoria = new HashMap<>();
        Map<String, Map<String, String>> principal = new HashMap<>();

        categoria.put("Pre Mirim", "P");
        categoria.put("Mirim", "M");
        categoria.put("Infantil A", "IA");
        categoria.put("Infantil B", "IB");
        categoria.put("Infanto Juvenil A", "IJA");
        categoria.put("Infanto Juvenil B", "IJB");
        categoria.put("Juvenil", "J");
        categoria.put("Adulto", "A");
        categoria.put("Master 1", "M1");
        categoria.put("Master 2", "M2");
        categoria.put("Master 3", "M3");
        categoria.put("Master 4", "M4");
        categoria.put("Master 5", "M5");
        categoria.put("Master 6", "M6");

        principal.put("Pre Mirim", categoria);
        principal.put("Mirim", categoria);
        principal.put("Infantil A", categoria);
        principal.put("Infantil B", categoria);
        principal.put("Infanto Juvenil A", categoria);
        principal.put("Infanto Juvenil B", categoria);
        principal.put("Juvenil", categoria);
        principal.put("Adulto", categoria);
        principal.put("Master", categoria);

        return principal;
    }

    public static Map<String, String> carregarCategoriaTempo(){
        Map<String, String> categoriaTempo = new HashMap<>();
        categoriaTempo.put("PMB", "2:00");
        categoriaTempo.put("PMC", "2:00");
        categoriaTempo.put("PMA", "2:00");
        categoriaTempo.put("PML", "2:00");
        categoriaTempo.put("PMV", "2:00");
        categoriaTempo.put("MB", "2:00");
        categoriaTempo.put("MC", "2:00");
        categoriaTempo.put("MA", "2:00");
        categoriaTempo.put("ML", "2:00");
        categoriaTempo.put("MV", "2:00");
        categoriaTempo.put("IAB", "3:00");
        categoriaTempo.put("IAC", "3:00");
        categoriaTempo.put("IAA", "3:00");
        categoriaTempo.put("MIAL", "3:00");
        categoriaTempo.put("IAV", "3:00");
        categoriaTempo.put("IBB", "3:00");
        categoriaTempo.put("IBC", "3:00");
        categoriaTempo.put("IBA", "3:00");
        categoriaTempo.put("IBL", "3:00");
        categoriaTempo.put("IBV", "3:00");

        categoriaTempo.put("IJAB", "3:30");
        categoriaTempo.put("IJAC", "3:30");
        categoriaTempo.put("IJAA", "3:30");
        categoriaTempo.put("IJAL", "3:30");
        categoriaTempo.put("IJAV", "3:30");

        categoriaTempo.put("IJBB", "4:00");
        categoriaTempo.put("IJBC", "4:00");
        categoriaTempo.put("IJBA", "4:00");
        categoriaTempo.put("IJBL", "4:00");
        categoriaTempo.put("IJBV", "4:00");
        categoriaTempo.put("JB", "4:00");
        categoriaTempo.put("M2B", "4:00");
        categoriaTempo.put("M3B", "4:00");
        categoriaTempo.put("M4B", "4:00");
        categoriaTempo.put("M5B", "4:00");
        categoriaTempo.put("M6B", "4:00");

        categoriaTempo.put("JA", "5:00");
        categoriaTempo.put("AB", "5:00");
        categoriaTempo.put("M1B", "5:00");
        categoriaTempo.put("M1A", "5:00");
        categoriaTempo.put("M2A", "5:00");
        categoriaTempo.put("M2R", "5:00");
        categoriaTempo.put("M2M", "5:00");
        categoriaTempo.put("M2P", "5:00");
        categoriaTempo.put("M3A", "5:00");
        categoriaTempo.put("M3R", "5:00");
        categoriaTempo.put("M3M", "5:00");
        categoriaTempo.put("M3P", "5:00");
        categoriaTempo.put("M4A", "5:00");
        categoriaTempo.put("M4R", "5:00");
        categoriaTempo.put("M4M", "5:00");
        categoriaTempo.put("M4P", "5:00");
        categoriaTempo.put("M5A", "5:00");
        categoriaTempo.put("M5R", "5:00");
        categoriaTempo.put("M5M", "5:00");
        categoriaTempo.put("M5P", "5:00");
        categoriaTempo.put("M6A", "5:00");
        categoriaTempo.put("M6R", "5:00");
        categoriaTempo.put("M6M", "5:00");
        categoriaTempo.put("M6P", "5:00");

        categoriaTempo.put("AA", "6:00");
        categoriaTempo.put("M1R", "6:00");
        categoriaTempo.put("M1M", "6:00");
        categoriaTempo.put("M1P", "6:00");

        categoriaTempo.put("AR", "7:00");

        categoriaTempo.put("AM", "8:00");
        categoriaTempo.put("AP", "8:00");

        return categoriaTempo;
    }


    public static Map<String, String> carregaPesoGalo() {
        Map<String, String> galo = new HashMap<>();
        galo.put("Pre Mirim", "Galo");
        galo.put("Mirim", "Galo");
        galo.put("Infantil A", "Galo");
        galo.put("Infantil B", "Galo");
        galo.put("Infanto Juvenil A", "Galo");
        galo.put("Infanto Juvenil B", "Galo");
        galo.put("Juvenil", "Galo");
        galo.put("Adulto", "Galo");
        galo.put("Master 1", "Galo");
        galo.put("Master 2", "Galo");
        galo.put("Master 3", "Galo");
        galo.put("Master 4", "Galo");
        galo.put("Master 5", "Galo");
        galo.put("Master 6", "Galo");
        return galo;
    }

    public static Map<String, String> carregaPluma() {
        Map<String, String> pluma = new HashMap<>();
        pluma.put("Mirim", "Pluma");
        pluma.put("Infantil A", "Pluma");
        pluma.put("Infantil B", "Pluma");
        pluma.put("Infanto Juvenil A", "Pluma");
        pluma.put("Infanto Juvenil B", "Pluma");
        pluma.put("Juvenil", "Pluma");
        pluma.put("Adulto", "Pluma");
        pluma.put("Master 1", "Pluma");
        pluma.put("Master 2", "Pluma");
        pluma.put("Master 3", "Pluma");
        pluma.put("Master 4", "Pluma");
        pluma.put("Master 5", "Pluma");
        pluma.put("Master 6", "Pluma");
        return pluma;
    }
    public static Map<String, String> carregaPena() {
        Map<String, String> pena = new HashMap<>();
        pena.put("Mirim", "Pena");
        pena.put("Infantil A", "Pena");
        pena.put("Infantil B", "Pena");
        pena.put("Infanto Juvenil A", "Pena");
        pena.put("Infanto Juvenil B", "Pena");
        pena.put("Juvenil", "Pena");
        pena.put("Adulto", "Pena");
        pena.put("Master 1", "Pena");
        pena.put("Master 2", "Pena");
        pena.put("Master 3", "Pena");
        pena.put("Master 4", "Pena");
        pena.put("Master 5", "Pena");
        pena.put("Master 6", "Pena");
        return pena;
    }
    public static Map<String, String> carregaLeve() {
        Map<String, String> leve = new HashMap<>();
        leve.put("Pre Mirim", "Leve");
        leve.put("Mirim", "Leve");
        leve.put("Infantil A", "Leve");
        leve.put("Infantil B", "Leve");
        leve.put("Infanto Juvenil A", "Leve");
        leve.put("Infanto Juvenil B", "Leve");
        leve.put("Juvenil", "Leve");
        leve.put("Adulto", "Leve");
        leve.put("Master 1", "Leve");
        leve.put("Master 2", "Leve");
        leve.put("Master 3", "Leve");
        leve.put("Master 4", "Leve");
        leve.put("Master 5", "Leve");
        leve.put("Master 6", "Leve");
        return leve;
    }
    public static Map<String, String> carregaMedio() {
        Map<String, String> medio = new HashMap<>();

        medio.put("Pre Mirim", "Medio");
        medio.put("Mirim", "Medio");
        medio.put("Infantil A", "Medio");
        medio.put("Infantil B", "Medio");
        medio.put("Infanto Juvenil A", "Medio");
        medio.put("Infanto Juvenil B", "Medio");
        medio.put("Juvenil", "Medio");
        medio.put("Adulto", "Medio");
        medio.put("Master 1", "Medio");
        medio.put("Master 2", "Medio");
        medio.put("Master 3", "Medio");
        medio.put("Master 4", "Medio");
        medio.put("Master 5", "Medio");
        medio.put("Master 6", "Medio");
        return medio;
    }

    public static Map<String, String> caregaMeioPesado() {
        Map<String, String> meioPesado = new HashMap<>();
        meioPesado.put("Pre Mirim", "Meio Pesado");
        meioPesado.put("Mirim", "Meio Pesado");
        meioPesado.put("Infantil A", "Meio Pesado");
        meioPesado.put("Infantil B", "Meio Pesado");
        meioPesado.put("Infanto Juvenil A", "Meio Pesado");
        meioPesado.put("Infanto Juvenil B", "Meio Pesado");
        meioPesado.put("Juvenil", "Meio Pesado");
        meioPesado.put("Adulto", "Meio Pesado");
        meioPesado.put("Master 1", "Meio Pesado");
        meioPesado.put("Master 2", "Meio Pesado");
        meioPesado.put("Master 3", "Meio Pesado");
        meioPesado.put("Master 4", "Meio Pesado");
        meioPesado.put("Master 5", "Meio Pesado");
        meioPesado.put("Master 6", "Meio Pesado");
        return meioPesado;
    }

    public static Map<String, String> carregaPesado() {
        Map<String, String> pesado = new HashMap<>();
        pesado.put("Pre Mirim", "Pesado");
        pesado.put("Mirim", "Pesado");
        pesado.put("Infantil A", "Pesado");
        pesado.put("Infantil B", "Pesado");
        pesado.put("Infanto Juvenil A", "Pesado");
        pesado.put("Infanto Juvenil B", "Pesado");
        pesado.put("Juvenil", "Pesado");
        pesado.put("Adulto", "Pesado");
        pesado.put("Master 1", "Pesado");
        pesado.put("Master 2", "Pesado");
        pesado.put("Master 3", "Pesado");
        pesado.put("Master 4", "Pesado");
        pesado.put("Master 5", "Pesado");
        pesado.put("Master 6", "Pesado");
        return pesado;
    }

    public static Map<String, String> carregaSuperPesado() {
        Map<String, String> superPesado = new HashMap<>();
        superPesado.put("Pre Mirim", "Super Pesado");
        superPesado.put("Mirim", "Super Pesado");
        superPesado.put("Infantil A", "Super Pesado");
        superPesado.put("Infantil B", "Super Pesado");
        superPesado.put("Infanto Juvenil A", "Super Pesado");
        superPesado.put("Infanto Juvenil B", "Super Pesado");
        superPesado.put("Juvenil", "Super Pesado");
        superPesado.put("Adulto", "Super Pesado");
        superPesado.put("Master 1", "Super Pesado");
        superPesado.put("Master 2", "Super Pesado");
        superPesado.put("Master 3", "Super Pesado");
        superPesado.put("Master 4", "Super Pesado");
        superPesado.put("Master 5", "Super Pesado");
        superPesado.put("Master 6", "Super Pesado");
        return superPesado;
    }

    public static Map<String, String> carregaPesadissimo() {
        Map<String, String> pesadissimo = new HashMap<>();

        pesadissimo.put("Pre Mirim", "Pesadissimo");
        pesadissimo.put("Mirim", "Pesadissimo");
        pesadissimo.put("Infantil A", "Pesadissimo");
        pesadissimo.put("Infantil B", "Pesadissimo");
        pesadissimo.put("Infanto Juvenil A", "Pesadissimo");
        pesadissimo.put("Infanto Juvenil B", "Pesadissimo");
        pesadissimo.put("Juvenil", "Pesadissimo");
        pesadissimo.put("Adulto", "Pesadissimo");
        pesadissimo.put("Master 1", "Pesadissimo");
        pesadissimo.put("Master 2", "Pesadissimo");
        pesadissimo.put("Master 3", "Pesadissimo");
        pesadissimo.put("Master 4", "Pesadissimo");
        pesadissimo.put("Master 5", "Pesadissimo");
        pesadissimo.put("Master 6", "Pesadissimo");
        return pesadissimo;
    }
    public static Map<String, String> carregaExtraPesadissimo() {
        Map<String, String> extraPesadissimo = new HashMap<>();
        extraPesadissimo.put("Pre Mirim", "Extra Pesadissimo");
        extraPesadissimo.put("Mirim", "Extra Pesadissimo");
        extraPesadissimo.put("Infantil A", "Extra Pesadissimo");
        extraPesadissimo.put("Infantil B", "Extra Pesadissimo");
        extraPesadissimo.put("Infanto Juvenil A", "Extra Pesadissimo");
        extraPesadissimo.put("Infanto Juvenil B", "Extra Pesadissimo");
        extraPesadissimo.put("Juvenil", "Extra Pesadissimo");
        extraPesadissimo.put("Adulto", "Extra Pesadissimo");
        extraPesadissimo.put("Master 1", "Extra Pesadissimo");
        extraPesadissimo.put("Master 2", "Extra Pesadissimo");
        extraPesadissimo.put("Master 3", "Extra Pesadissimo");
        extraPesadissimo.put("Master 4", "Extra Pesadissimo");
        extraPesadissimo.put("Master 5", "Extra Pesadissimo");
        extraPesadissimo.put("Master 6", "Extra Pesadissimo");
        return extraPesadissimo;
    }


//    public static Map<String, String> carregaCategoriaPeso() {
//        Map<String, String> peso = new HashMap<>();
//        peso.put("Pre Mirim", "Galo");
//        peso.put("Pre Mirim", "Pluma");
//        peso.put("Pre Mirim", "Pena");
//        peso.put("Pre Mirim", "Leve");
//        peso.put("Pre Mirim", "Medio");
//        peso.put("Pre Mirim", "Meio Pesado");
//        peso.put("Pre Mirim", "Pesado");
//        peso.put("Pre Mirim", "Super Pesado");
//        peso.put("Pre Mirim", "Pesadissimo");
//        peso.put("Pre Mirim", "Extra Pesadissimo");
//
//        peso.put("Mirim", "Galo");
//        peso.put("Mirim", "Pluma");
//        peso.put("Mirim", "Pena");
//        peso.put("Mirim", "Leve");
//        peso.put("Mirim", "Medio");
//        peso.put("Mirim", "Meio Pesado");
//        peso.put("Mirim", "Pesado");
//        peso.put("Mirim", "Super Pesado");
//        peso.put("Mirim", "Pesadissimo");
//        peso.put("Mirim", "Extra Pesadissimo");
//
//        peso.put("Infantil A", "Galo");
//        peso.put("Infantil A", "Pluma");
//        peso.put("Infantil A", "Pena");
//        peso.put("Infantil A", "Leve");
//        peso.put("Infantil A", "Medio");
//        peso.put("Infantil A", "Meio Pesado");
//        peso.put("Infantil A", "Pesado");
//        peso.put("Infantil A", "Super Pesado");
//        peso.put("Infantil A", "Pesadissimo");
//        peso.put("Infantil A", "Extra Pesadissimo");
//
//        peso.put("Infantil B", "Galo");
//        peso.put("Infantil B", "Pluma");
//        peso.put("Infantil B", "Pena");
//        peso.put("Infantil B", "Leve");
//        peso.put("Infantil B", "Medio");
//        peso.put("Infantil B", "Meio Pesado");
//        peso.put("Infantil B", "Pesado");
//        peso.put("Infantil B", "Super Pesado");
//        peso.put("Infantil B", "Pesadissimo");
//        peso.put("Infantil B", "Extra Pesadissimo");
//
//        peso.put("Infanto Juvenil A", "Galo");
//        peso.put("Infanto Juvenil A", "Pluma");
//        peso.put("Infanto Juvenil A", "Pena");
//        peso.put("Infanto Juvenil A", "Leve");
//        peso.put("Infanto Juvenil A", "Medio");
//        peso.put("Infanto Juvenil A", "Meio Pesado");
//        peso.put("Infanto Juvenil A", "Pesado");
//        peso.put("Infanto Juvenil A", "Super Pesado");
//        peso.put("Infanto Juvenil A", "Pesadissimo");
//        peso.put("Infanto Juvenil A", "Extra Pesadissimo");
//
//        peso.put("Infanto Juvenil B", "Galo");
//        peso.put("Infanto Juvenil B", "Pluma");
//        peso.put("Infanto Juvenil B", "Pena");
//        peso.put("Infanto Juvenil B", "Leve");
//        peso.put("Infanto Juvenil B", "Medio");
//        peso.put("Infanto Juvenil B", "Meio Pesado");
//        peso.put("Infanto Juvenil B", "Pesado");
//        peso.put("Infanto Juvenil B", "Super Pesado");
//        peso.put("Infanto Juvenil B", "Pesadissimo");
//        peso.put("Infanto Juvenil B", "Extra Pesadissimo");
//
//
//        peso.put("Juvenil", "Galo");
//        peso.put("Juvenil", "Pluma");
//        peso.put("Juvenil", "Pena");
//        peso.put("Juvenil", "Leve");
//        peso.put("Juvenil", "Medio");
//        peso.put("Juvenil", "Meio Pesado");
//        peso.put("Juvenil", "Pesado");
//        peso.put("Juvenil", "Super Pesado");
//        peso.put("Juvenil", "Pesadissimo");
//        peso.put("Juvenil", "Extra Pesadissimo");
//
//        peso.put("Adulto", "Galo");
//        peso.put("Adulto", "Pluma");
//        peso.put("Adulto", "Pena");
//        peso.put("Adulto", "Leve");
//        peso.put("Adulto", "Medio");
//        peso.put("Adulto", "Meio Pesado");
//        peso.put("Adulto", "Pesado");
//        peso.put("Adulto", "Super Pesado");
//        peso.put("Adulto", "Pesadissimo");
//        peso.put("Adulto", "Extra Pesadissimo");
//
//        peso.put("Master 1", "Galo");
//        peso.put("Master 1", "Pluma");
//        peso.put("Master 1", "Pena");
//        peso.put("Master 1", "Leve");
//        peso.put("Master 1", "Medio");
//        peso.put("Master 1", "Meio Pesado");
//        peso.put("Master 1", "Pesado");
//        peso.put("Master 1", "Super Pesado");
//        peso.put("Master 1", "Pesadissimo");
//        peso.put("Master 1", "Extra Pesadissimo");
//
//        peso.put("Master 2", "Galo");
//        peso.put("Master 2", "Pluma");
//        peso.put("Master 2", "Pena");
//        peso.put("Master 2", "Leve");
//        peso.put("Master 2", "Medio");
//        peso.put("Master 2", "Meio Pesado");
//        peso.put("Master 2", "Pesado");
//        peso.put("Master 2", "Super Pesado");
//        peso.put("Master 2", "Pesadissimo");
//        peso.put("Master 2", "Extra Pesadissimo");
//
//        peso.put("Master 3", "Galo");
//        peso.put("Master 3", "Pluma");
//        peso.put("Master 3", "Pena");
//        peso.put("Master 3", "Leve");
//        peso.put("Master 3", "Medio");
//        peso.put("Master 3", "Meio Pesado");
//        peso.put("Master 3", "Pesado");
//        peso.put("Master 3", "Super Pesado");
//        peso.put("Master 3", "Pesadissimo");
//        peso.put("Master 3", "Extra Pesadissimo");
//
//        peso.put("Master 4", "Galo");
//        peso.put("Master 4", "Pluma");
//        peso.put("Master 4", "Pena");
//        peso.put("Master 4", "Leve");
//        peso.put("Master 4", "Medio");
//        peso.put("Master 4", "Meio Pesado");
//        peso.put("Master 4", "Pesado");
//        peso.put("Master 4", "Super Pesado");
//        peso.put("Master 4", "Pesadissimo");
//        peso.put("Master 4", "Extra Pesadissimo");
//
//        peso.put("Master 5", "Galo");
//        peso.put("Master 5", "Pluma");
//        peso.put("Master 5", "Pena");
//        peso.put("Master 5", "Leve");
//        peso.put("Master 5", "Medio");
//        peso.put("Master 5", "Meio Pesado");
//        peso.put("Master 5", "Pesado");
//        peso.put("Master 5", "Super Pesado");
//        peso.put("Master 5", "Pesadissimo");
//        peso.put("Master 5", "Extra Pesadissimo");
//
//        peso.put("Master 6", "Galo");
//        peso.put("Master 6", "Pluma");
//        peso.put("Master 6", "Pena");
//        peso.put("Master 6", "Leve");
//        peso.put("Master 6", "Medio");
//        peso.put("Master 6", "Meio Pesado");
//        peso.put("Master 6", "Pesado");
//        peso.put("Master 6", "Super Pesado");
//        peso.put("Master 6", "Pesadissimo");
//        peso.put("Master 6", "Extra Pesadissimo");
//
//        return peso;
//    }
}
