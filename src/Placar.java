import model.Atleta;
import service.GetCategoryData;

public class Placar {
    public static void main(String[] args) {

        Atleta atleta = new Atleta();
        atleta.setAnoNascimento(1981);
        atleta.setFaixa("preta ");
        atleta.setNome("Alexsandro Pires");
        atleta.setCpf("1234567809");
        atleta.setPeso(90.0);
        atleta.setGenero("m");

        GetCategoryData getCategoryData = new GetCategoryData();
        System.out.println(getCategoryData.formatDataCategory(atleta).toString());
    }
}
