public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;
    

    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }


    // método estaVencido que recebe uma data por parameto (objeto do tipo data ) e retorna vdd ou falso
    public boolean estaVencido(Data getDataDeValiade){
      if (getDataDeValidade()  ){
        return true;
      } else {
        return false;
      }

        /* EXEMPLO DA PROFESSORA 
        if (dataAtual.getAno() > dataDeValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == dataDeValidade.getAno() && dataAtual.getMes() > dataDeValidade.getMes()) {
            return true;
        } else if (dataAtual.getAno() == dataDeValidade.getAno() && dataAtual.getMes() == dataDeValidade.getMes() && dataAtual.getDia() > dataDeValidade.getDia()) {
            return true;
        } else {
            return false;
        }*/

    }


    // add método toString
    @Override
    public String toString() {
        return "Produto: nome=" + nome + ", preço=" + preco ;
    }

    
    
}
