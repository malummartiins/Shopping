import java.util.Arrays;
import java.util.List;

import static java.util.Objects.isNull;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    private final int quantidadeMaximaLojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeMaximaLojas = quantidadeMaximaLojas;
        this.lojas = new Loja[this.quantidadeMaximaLojas];
    }

private static Loja[] removeElement(Loja[] arr, Loja item) {
    return Arrays.stream(arr)
            .filter(i -> i != item)
            .toArray(Loja[]::new);
}

public boolean insereLoja(Loja loja) {
        for (int i = 0; i < this.lojas.length; i++) {
        if (isNull(this.lojas[i])) {
            this.lojas[i] = loja;
            return true;
        }
    }

    return false;
}

public boolean removeLoja(String nome) {
    for (Loja loja : this.lojas) {
        if (loja.getNome().equals(nome)) {
            this.lojas = removeElement(this.lojas, loja);
            return true;
        }
    }

    return false;
}

public int quantidadeLojasPorTipo(String tipo) {
    List<Loja> _lojas = Arrays.stream(this.lojas).toList();

    return switch (tipo) {
        case "Informática" -> contaLojas(_lojas, Informatica.class);
        case "Alimentação" -> contaLojas(_lojas, Alimentacao.class);
        case "Bijuteria" -> contaLojas(_lojas, Bijuteria.class);
        case "Vestuário" -> contaLojas(_lojas, Vestuario.class);
        case "Cosmético" -> contaLojas(_lojas, Cosmetico.class);
        default -> -1;
    };
}

public Loja[] getLojas() {
    return lojas;
}

public void setLojas(Loja[] lojas) {
    this.lojas = lojas;
}

private int contaLojas(List<Loja> lojas, Class<? extends Loja> tipoClasse) {
    return lojas.stream()
            .filter(tipoClasse::isInstance)
            .toList().size();
}

public Informatica lojaSeguroMaisCaro() { // faculdade que crime
    Informatica acumulador = null;

    for (Loja _loja : this.lojas) {
        if (_loja instanceof Informatica atual) {

            if (isNull(acumulador)) {
                acumulador = atual;
            }

            if (atual.getSeguroEletronicos() > acumulador.getSeguroEletronicos()) {
                acumulador = atual;
            }
        }
    }

    return acumulador;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Endereco getEndereco() {
    return endereco;
}

public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}

@Override
public String toString() {
    return " Shopping " +
            "Nome : '" + nome + '\'' +
            ", Endereço = " + endereco +
            ", Lojas =" + Arrays.toString(lojas);
}
}
