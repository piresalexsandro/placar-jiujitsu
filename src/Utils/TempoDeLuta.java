package Utils;

import java.util.HashMap;
import java.util.Map;

public class TempoDeLuta {

    private static Map<String, String> carregarCategoriaTempo(){
        Map<String, String> mapCategoriaTempo = new HashMap<>();
        mapCategoriaTempo.put("PMB", "2:00");
        mapCategoriaTempo.put("PMC", "2:00");
        mapCategoriaTempo.put("PMA", "2:00");
        mapCategoriaTempo.put("PML", "2:00");
        mapCategoriaTempo.put("PMV", "2:00");
        mapCategoriaTempo.put("MB", "2:00");
        mapCategoriaTempo.put("MC", "2:00");
        mapCategoriaTempo.put("MA", "2:00");
        mapCategoriaTempo.put("ML", "2:00");
        mapCategoriaTempo.put("MV", "2:00");
        mapCategoriaTempo.put("IAB", "3:00");
        mapCategoriaTempo.put("IAC", "3:00");
        mapCategoriaTempo.put("IAA", "3:00");
        mapCategoriaTempo.put("MIAL", "3:00");
        mapCategoriaTempo.put("IAV", "3:00");
        mapCategoriaTempo.put("IBB", "3:00");
        mapCategoriaTempo.put("IBC", "3:00");
        mapCategoriaTempo.put("IBA", "3:00");
        mapCategoriaTempo.put("IBL", "3:00");
        mapCategoriaTempo.put("IBV", "3:00");

        mapCategoriaTempo.put("IJAB", "3:30");
        mapCategoriaTempo.put("IJAC", "3:30");
        mapCategoriaTempo.put("IJAA", "3:30");
        mapCategoriaTempo.put("IJAL", "3:30");
        mapCategoriaTempo.put("IJAV", "3:30");

        mapCategoriaTempo.put("IJBB", "4:00");
        mapCategoriaTempo.put("IJBC", "4:00");
        mapCategoriaTempo.put("IJBA", "4:00");
        mapCategoriaTempo.put("IJBL", "4:00");
        mapCategoriaTempo.put("IJBV", "4:00");
        mapCategoriaTempo.put("JB", "4:00");
        mapCategoriaTempo.put("M2B", "4:00");
        mapCategoriaTempo.put("M3B", "4:00");
        mapCategoriaTempo.put("M4B", "4:00");
        mapCategoriaTempo.put("M5B", "4:00");
        mapCategoriaTempo.put("M6B", "4:00");

        mapCategoriaTempo.put("JA", "5:00");
        mapCategoriaTempo.put("AB", "5:00");
        mapCategoriaTempo.put("M1B", "5:00");
        mapCategoriaTempo.put("M1A", "5:00");
        mapCategoriaTempo.put("M2A", "5:00");
        mapCategoriaTempo.put("M2R", "5:00");
        mapCategoriaTempo.put("M2M", "5:00");
        mapCategoriaTempo.put("M2P", "5:00");
        mapCategoriaTempo.put("M3A", "5:00");
        mapCategoriaTempo.put("M3R", "5:00");
        mapCategoriaTempo.put("M3M", "5:00");
        mapCategoriaTempo.put("M3P", "5:00");
        mapCategoriaTempo.put("M4A", "5:00");
        mapCategoriaTempo.put("M4R", "5:00");
        mapCategoriaTempo.put("M4M", "5:00");
        mapCategoriaTempo.put("M4P", "5:00");
        mapCategoriaTempo.put("M5A", "5:00");
        mapCategoriaTempo.put("M5R", "5:00");
        mapCategoriaTempo.put("M5M", "5:00");
        mapCategoriaTempo.put("M5P", "5:00");
        mapCategoriaTempo.put("M6A", "5:00");
        mapCategoriaTempo.put("M6R", "5:00");
        mapCategoriaTempo.put("M6M", "5:00");
        mapCategoriaTempo.put("M6P", "5:00");

        mapCategoriaTempo.put("AA", "6:00");
        mapCategoriaTempo.put("M1R", "6:00");
        mapCategoriaTempo.put("M1M", "6:00");
        mapCategoriaTempo.put("M1P", "6:00");

        mapCategoriaTempo.put("AR", "7:00");

        mapCategoriaTempo.put("AM", "8:00");
        mapCategoriaTempo.put("AP", "8:00");

        return mapCategoriaTempo;
    }

    public static String getTime(String codigoCategoria){
        Map<String, String> map = carregarCategoriaTempo();
        var tempo = map.get(codigoCategoria);
        return tempo;
    }
}
