public class Alimentacao extends Loja{
    private Data dataAlvara;

    /*public Alimentacao(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    } */



public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, Data dataAlvara) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
    this.dataAlvara = dataAlvara;
}

public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeFuncionarios);
    this.dataAlvara = dataAlvara;
}

public Data getDataAlvara() {
    return dataAlvara;
}

public void setDataAlvara(Data dataAlvara) {
    this.dataAlvara = dataAlvara;
}
@Override
public String toString() {
    return "Alimentação, data do Alvará =" + dataAlvara ;
}

}
