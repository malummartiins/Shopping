import java.util.Arrays;
import static java.util.Objects.isNull;

public class Loja {
    private String nome;
    private int quantidadedeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    
    private Produto[] estoqueProdutos;


    public Loja(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public Loja(String nome, int quantidadedeFuncionarios, double salarioBaseFuncionario,Data dataDeFundacao, Endereco endereco, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
        
    }
    
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2, Endereco endereco2, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
    public Loja() {
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2, Data dataFundacao,
			Endereco endereco2) {
	}
	public Loja(String string, int i, Endereco e1, Data d1, int j) {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadedeFuncionarios() {
        return quantidadedeFuncionarios;
    }
    public void setQuantidadedeFuncionarios(int quantidadedeFuncionarios) {
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
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

    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }
   
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    


public double gastosComSalario(){
    if (salarioBaseFuncionario == -1){
        return -1;
    } else {
        return quantidadedeFuncionarios * salarioBaseFuncionario;
    }
   }

public String tamanhoDaLoja(){
   if (quantidadedeFuncionarios < 10){
        return "P";
   } else if (quantidadedeFuncionarios >= 10 && quantidadedeFuncionarios <= 30) {
    return "M";
   } else {
    return "G";
   }
   }
   
   public void imprimeProdutos() {

    for (Produto produto : this.estoqueProdutos) {

        if (isNull(produto)) {
            continue;
        }

        System.out.println(produto);
    }
}


public boolean insereProduto(Produto produto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] == null) {
            estoqueProdutos[i] = produto;
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
            ", quantidadeFuncionarios=" + quantidadedeFuncionarios +
            ", salarioBaseFuncionario=" + salarioBaseFuncionario +
            ", dataFundacao=" + dataDeFundacao +
            ", endereco=" + endereco +
            ", estoqueProdutos=" + this.estoqueProdutos +
            '}';
}
}
    

