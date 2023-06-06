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

public boolean removeLoja(String nomeLoja) {
    for (int i = 0; i < lojas.length; i++) {
        Loja loja = lojas[i];
        if (loja != null && loja.getNome().equalsIgnoreCase(nomeLoja)) {
            lojas[i] = null;
            return true; 
        }
    }
    return false; 
}


public int quantidadeLojasPorTipo(String tipoLoja) {
    int quantidade = 0;

    if (tipoLoja.equalsIgnoreCase("Cosmético")) {
        for (Loja loja : lojas) {
            if (loja instanceof Cosmetico) {
                quantidade++;
            }
        }
    } else if (tipoLoja.equalsIgnoreCase("Vestuário")) {
        for (Loja loja : lojas) {
            if (loja instanceof Vestuario) {
                quantidade++;
            }
        }
    } else if (tipoLoja.equalsIgnoreCase("Bijuteria")) {
        for (Loja loja : lojas) {
            if (loja instanceof Bijuteria) {
                quantidade++;
            }
        }
    } else if (tipoLoja.equalsIgnoreCase("Alimentação")) {
        for (Loja loja : lojas) {
            if (loja instanceof Alimentacao) {
                quantidade++;
            }
        }
    } else if (tipoLoja.equalsIgnoreCase("Informática")) {
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                quantidade++;
            }
        }
    } else {
        return -1; // Tipo de loja inválido
    }

    return quantidade;
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

public Informatica lojaSeguroMaisCaro() { 
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
