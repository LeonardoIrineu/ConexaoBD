package dobackaofront.model;

public class Usuario {

    private String nome;

    private int idade;

    private char sexo;

    private String cpf;

    private String cor_da_pele;

    private double peso;

    private double altura;

    public Usuario() {}

    public Usuario(String nome, int idade, char sexo, String cpf, String cor_da_pele,  double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.cor_da_pele = cor_da_pele;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCor_da_pele() {
        return cor_da_pele;
    }

    public void setCor_da_pele(String cor_da_pele) {
        this.cor_da_pele = cor_da_pele;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void apresentar() {
        System.out.println("Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", cpf='" + cpf + '\'' +
                ", cor_da_pele='" + cor_da_pele + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}');
    }
}
