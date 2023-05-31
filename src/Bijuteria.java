public class Bijuteria extends Loja {
    private double metaVendas;

public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double metaVendas) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
    this.metaVendas = metaVendas;
}

public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco, double metaVendas) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
    this.metaVendas = metaVendas;
}

public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeFuncionarios);
    this.metaVendas = metaVendas;
}

public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas) {
    super(nome, quantidadeFuncionarios, metaVendas, dataFundacao, endereco);
    this.metaVendas = metaVendas;
}

public double getMetaVendas() {
    return metaVendas;
}

public void setMetaVendas(double metaVendas) {
    this.metaVendas = metaVendas;
}

@Override
public String toString() {
    return super.toString() + "Bijuteria{" +
            "metaDeVendas=" + metaVendas +
            '}';
}

}
