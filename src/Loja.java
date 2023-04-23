public class Loja {
    private String nome;
    private int quantidadedeFuncionarios;
    private double salarioBaseFuncionario;
    
     //criar dois contrutores um recebe parametros e outro apenas valores (-1 no salario base)


    public Loja(String nome, int quantidadedeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    // criar segundo construtor 
    public Loja (){
        this.nome = nome;
        this.quantidadedeFuncionarios = quantidadedeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
   

//  toString
   @Override
public String toString() {
    return "Loja [nome=" + nome + ", quantidadedeFuncionarios=" + quantidadedeFuncionarios + ", salarioBaseFuncionario="
            + salarioBaseFuncionario + "]";
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
    

