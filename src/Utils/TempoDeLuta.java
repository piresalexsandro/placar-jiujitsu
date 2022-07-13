package Utils;

import java.util.HashMap;
import java.util.Map;

public class TempoDeLuta {

    private static Map<String, String> carregarCategoriaTempo(){
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

    public static String getTempo(String codigoCategoria){
        Map<String, String> categoriaTempo = carregarCategoriaTempo();
        return categoriaTempo.get(codigoCategoria);
    }
}
