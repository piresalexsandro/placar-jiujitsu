package service;

import Utils.Loader;

public class Faixa {

    public static String getFaixa(String key){
       return Loader.loadBelt().get(key);
    }
}
