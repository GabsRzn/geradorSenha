import java.util.Scanner;

public class Email {
    private String primeiroNome;
    private String ultimoNome;
    private String senha;
    private String departamento;
    private String email;
    private int capacidadeCaixaEmail = 500;
    private int tamanhoDeSenhaPadrao = 10;
    private String emailAlternativo;
    private String enderecoEmpresa = "fitcompany.com";


    public Email(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.departamento = setDepartment();
        this.senha = senhaAleatoria(tamanhoDeSenhaPadrao);

        //Email
        email = primeiroNome.toLowerCase() + "." + ultimoNome.toLowerCase() + "@" + departamento.toLowerCase() + "."
                + enderecoEmpresa;
    }

    // Departamento
    private String setDepartment() {
        System.out.println(
                "Códigos de Departamento:\n1 para Vendas\n2 para Desenvolvimento\n3 para Contabilidade\n0 para Nenhum\nEntre com o código do seu departamento:");
        try (Scanner in = new Scanner(System.in)) {
            int escolhaDep = in.nextInt();
            if (escolhaDep == 1) {
                return "Vendas";
            } else if (escolhaDep == 2) {
                return "Desenvolvimento";
            } else if (escolhaDep == 3) {
                return "Contabilidade";
            } else {
                return "";
            }
        }
    }

    // Gerador de Senha Aleatória
    private String senhaAleatoria(int length) {
        String geradorSenha = "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789@!#$";
        char[] senha = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * geradorSenha.length());
            senha[i] = geradorSenha.charAt(rand);
        }
        return new String(senha);
    }

    // Capacidade da Caixa de Email
    public void escolherCapacidadeEmail(int capacidade) {
        this.capacidadeCaixaEmail = capacidade;
    }

    // Email Alternativo
    public void escolherEmailAlternativo(String altEmail) {
        this.emailAlternativo = altEmail;
    }

    // Mudar a senha
    public void mudarSenha(String senha) {
        this.senha = senha;
    }

    public int caixaDeEmail() {return capacidadeCaixaEmail;}
    public String emailAlternativo() {return emailAlternativo;}
    public String senhaConta() {return senha;}

    public String mostrarInfo(){
        return "DISPLAY: " + primeiroNome + " " + ultimoNome +
                "\nSua senha é: " + senha +
                "\nEmail Corporativo: " + email +
                "\nCapacidade do Email: " + capacidadeCaixaEmail + "mb";
    }
}
