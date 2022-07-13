import model.Atleta;

public class Placar {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

        Atleta atleta = new Atleta();
        atleta.setAnoNascimento(1981);
        atleta.setFaixa("preta ");
        atleta.setNome("Alexsandro Pires");
        atleta.setCpf("1234567809");
        atleta.setPeso(90.0);

        String dados = ObterDadosDaCategoriaIdade.getCategoriaTempo(atleta.getAnoNascimento(), atleta.getFaixa());
        System.out.println(dados);
    }
}
