import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }
}
abstract class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    public Pessoa (String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
abstract class Politico extends Pessoa {
    private int numeroPartido;
    private int numeroCandidato;
    private int quantVotosRecebidos;
    public Politico (String nome, String cpf, String dataNascimento, int numeroPartido, int numeroCandidato, int quantVotosRecebidos) {
        super(nome, cpf, dataNascimento);
        this.numeroPartido = numeroPartido;
        this.numeroCandidato = numeroCandidato;
        this.quantVotosRecebidos = quantVotosRecebidos;
    }
    public int getNumeroPartido() {
        return numeroPartido;
    }
    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroCandidato;
    }
    public int getNumeroCandidato() {
        return numeroCandidato;
    }
    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }
    public int getQuantVotosRecebidos() {
        return quantVotosRecebidos;
    }
    public void setQuantVotosRecebidos(int quantVotosRecebidos) {
        this.quantVotosRecebidos = quantVotosRecebidos;
    }
}
class Eleitor extends Pessoa {
    private boolean apto;
    private String zonaEleitoral;
    public Eleitor(String nome, String cpf, String dataNascimento, boolean apto, String zonaEleitoral) {
        super(nome, cpf, dataNascimento);
        this.apto = apto;
        this.zonaEleitoral = zonaEleitoral;
    }
    public boolean getApto() {
        return apto;
    }
    public void setApto(boolean apto) {
        this.apto = apto;
    }
    public String getZonaEleitoral() {
        return zonaEleitoral;
    }
    public void setZonaEleitoral(String zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }
}
class Prefeito extends Politico{
    private int numMandato; //Pode no máximo dois mandatos seguidos
    public Prefeito(String nome, String cpf, String dataNascimento, int numeroPartido, int numeroCandidato, int quantVotosRecebidos, int numMandato) {
        super(nome, cpf, dataNascimento, numeroPartido, numeroCandidato, quantVotosRecebidos);
        this.numMandato = numMandato;
    }
    public int getNumMandato() {
        return numMandato;
    }
    public void setNumMandato(int numMandato) {
        this.numMandato = numMandato;
    }
}
class Vereador extends Politico {
    private String especialidade;   //Em qual área de atuação ele é melhor
    public Vereador(String nome, String cpf, String dataNascimento, int numeroPartido, int numeroCandidato, int quantVotosRecebidos, String especialidade) {
        super(nome, cpf, dataNascimento, numeroPartido, numeroCandidato, quantVotosRecebidos);
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
class SecaoEleitoral {
    private int numeroSecao;
    public SecaoEleitoral(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }
    public int getNumeroSecao() {
        return numeroSecao;
    }
    public void setNumeroSecao(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }
}
class ZonaEleitoral {
    private int numeroZona;
    public ZonaEleitoral(int numeroZona) {
        this.numeroZona = numeroZona;
    }
    public int getNumeroZona() {
        return numeroZona;
    }
    public void setNumeroZona(int numeroZona) {
        this.numeroZona = numeroZona;
    }
}
interface Notificavel {
    //Enviar notificações para o usuário: voto concluido, fim das eleições etc.
    void enviarNotificacao();
}
interface Estatisticas {
    //estatísticas específicas: votos por seção, votos por candidatos, % de comparecimento, votos nulos e brancos

}
interface Relatorio {
    //Gerar relatório por zona eleitoral
    void gerarRelatorio();
}
interface Votavel {
    //Eleitor está apto ou não a votar
    //Horário de votação está adequado ou não
}