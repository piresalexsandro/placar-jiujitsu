package Utils;

import java.util.HashMap;
import java.util.Map;

public class Loader {

    public static Map<String, String> loadBelt() {
        Map<String, String> belt = new HashMap<>();
        belt.put("BRANCA", "B");
        belt.put("CINZA", "C");
        belt.put("AMARELA", "A");
        belt.put("LARANJA", "L");
        belt.put("VERDE", "V");
        belt.put("AZUL", "A");
        belt.put("ROXA", "R");
        belt.put("MARROM", "M");
        belt.put("PRETA", "P");
        return belt;
    }

    public static Map<String, String> loadCategoryByAge() {
        Map<String, String> categoria = new HashMap<>();

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

        return categoria;
    }

    public static Map<String, String> loadTimeByCategory(){
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


    public static Map<String, String> loadCategoryGalo() {
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

    public static Map<String, String> loadCategoryPluma() {
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
    public static Map<String, String> loadCategoryPena() {
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
    public static Map<String, String> loadCategoryLeve() {
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
    public static Map<String, String> loadCategoryMedio() {
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

    public static Map<String, String> loadCategoryMeioPesado() {
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

    public static Map<String, String> loadCategoryPesado() {
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

    public static Map<String, String> loadCategorySuperPesado() {
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

    public static Map<String, String> loadCategoryPesadissimo() {
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
    public static Map<String, String> loadCategoryExtraPesadissimo() {
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
}
