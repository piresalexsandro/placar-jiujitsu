//public enum FaixaEnum {
//
//    BRANCA("BRANCA", "B"),
//    CINZA("CINZA", "C"),
//    AMARELA("AMARELA", "A"),
//    LARANJA("LARANJA", "L"),
//    VERDE("VERDE", "V"),
//    AZUL("AZUL", "A"),
//    ROXA("ROXA", "R"),
//    MARROM("MARROM", "M"),
//    PRETA("PRETA", "P");
//
//    private String descricao;
//    private String codigo;
//
//    FaixaEnum(String categoria, String code) {
//        this.descricao = categoria;
//        this.codigo = code;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public String getCodigo() {
//        return codigo;
//    }
//
//    public static String getCodigoByFaixa(String faixa) {
//        String codigo = null;
//        for (FaixaEnum f : FaixaEnum.values()) {
//            if (faixa.trim().toUpperCase().equals(f.getDescricao().trim().toUpperCase())) {
//                codigo = f.getCodigo();
//            }
//        }
//        return codigo;
//    }
//}
