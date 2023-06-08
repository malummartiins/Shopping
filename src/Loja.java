import java.util.Arrays;
import static java.util.Objects.isNull;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto [] estoqueProdutos;
    

    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,Data dataFundacao, Endereco endereco, int quantMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantMaxProdutos];
    }
    
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2, Endereco endereco2, Data dataFundacao, int quantMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[quantMaxProdutos];
    }
   
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2, Data dataFundacao,
			Endereco endereco2) {
	}
	public Loja(String string, int i, Endereco e1, Data d1, int j) {
    }

    public Loja() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
   
    public Produto [] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    public void setEstoqueProdutos (Produto [] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

public double gastosComSalario(){
    if (salarioBaseFuncionario == -1){
        return -1;
    } else {
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
   }

public char tamanhoDaLoja(){
   if (quantidadeFuncionarios < 10){
        return 'P';
   } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
    return 'M';
   } else {
    return 'G';
   }
   }
   

public void imprimeProdutos() {
    if (estoqueProdutos.length == 0) {
        System.out.println("Não há produtos no estoque.");
    } else {
        System.out.println("Produtos da loja:");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto.toString());
            }
        }
    }
}


public boolean insereProduto(Produto produto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] == produto) {
            estoqueProdutos[i] = null;
            return true;
        }
    }
    return false;
}

public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        Produto produto = estoqueProdutos[i];
        if (produto != null && produto.getNome().equalsIgnoreCase(nomeProduto)) {
            estoqueProdutos[i] = null;
            return true;
        }
    }
    return false;
}


@Override
public String toString() {
    return "Loja{" +
            "nome='" + nome + '\'' +
            ", quantidadeFuncionarios=" + quantidadeFuncionarios +
            ", salarioBaseFuncionario=" + salarioBaseFuncionario +
            ", dataFundacao=" + dataFundacao +
            ", endereco=" + endereco +
            ", estoqueProdutos=" + estoqueProdutos +
            '}';
}
}
    

