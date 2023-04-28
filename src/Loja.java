public class Loja {
    private String nome;
    private int quantidadedeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    
     //criar dois contrutores um recebe parametros e outro apenas valores (-1 no salario base)


    public Loja(String nome, int quantidadedeFuncionarios, double salarioBaseFuncionario,Endereco endereco, Data dataDeFundacao) {
        this.nome = nome;
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        
    }
    // criar segundo construtor 
    public Loja (){
        this.nome = nome;
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
        this.salarioBaseFuncionario = -1;
        // tenho que add endereco  e data de fundação aqui tbm?
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
   

//  toString
   @Override
public String toString() {
    return "Loja Nome: " + nome + ", Quantidade de Funcionários: " + quantidadedeFuncionarios + ", Salário base dos funcionários: "
            + salarioBaseFuncionario;
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
}
    

