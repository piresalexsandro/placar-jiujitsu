public enum CategoriaPorIdadeEnum {

    PRE_MIRIM("Pre Mirim", "P"),
    MIRIM("Mirim", "M"),
    INFANTIL_A("Infantil A", "IA"),
    INFANTIL_B("Infantil B", "IB"),
    INFANTO_JUVENIL_A("Infanto Juvenil A", "IJA"),
    INFANTO_JUVENIL_B("Infanto Juvenil B", "IJB"),
    JUVENIL("Juvenil", "J"),
    ADULTO("Adulto", "A"),
    MASTER_1("Master 1", "M1"),
    MASTER_2("Master 2", "M2"),
    MASTER_3("Master 3", "M3"),
    MASTER_4("Master 4", "M4"),
    MASTER_5("Master 5", "M5"),
    MASTER_6("Master 6", "M6");

    private String nomeCategoria;
    private String codigoCategoria;

    CategoriaPorIdadeEnum(String categoria, String code) {
        this.nomeCategoria = categoria;
        this.codigoCategoria = code;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public static String getCodigoByCategoria(String categoria) {
        String codigo = null;
        for (CategoriaPorIdadeEnum ci : CategoriaPorIdadeEnum.values()) {
            if (categoria.equals(ci.getNomeCategoria())) {
                codigo =  ci.getCodigoCategoria();
                break;
            }
        }
        return codigo;
    }
}
