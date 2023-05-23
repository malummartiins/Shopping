public class Informatica extends Loja{
    private double seguroEletronicos;

    /*que representa um seguro que lojas que vendem
aparelhos eletrônicos devem pagar mensalmente. Crie um construtor para a
classe, que receba informações para inicializar todos os atributos. Além disso, crie
os métodos de acesso dos atributos (os métodos que ainda não existem) e
sobrescreva o método toString, incluindo a informação específica da classe.
     */

     public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeFuncionarios);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica seguro de Eletronicos = " + seguroEletronicos ;
    }
    
}
