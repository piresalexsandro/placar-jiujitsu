package model;

import Utils.Loader;

public class Faixa {

    public static String getFaixa(String key){
       return Loader.carregaFaixa().get(key);
    }
}
