public class ValidadorEtapa4 {

	public static void main(String[] args){
		System.out.println("[Laboratório I]\n Desafio: Validador - Etapa 04\n");

		//// Verificação da classe Endereco
		//instância
		Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		System.out.println("\n[OK] Classe Endereco identificada");
		
		//public void setNomeDaRua(String nomeDaRua);
		e1.setNomeDaRua("Bla");
		System.out.println("[OK] Método Endereco.setNomeDaRua()");
		
		//public String getNomeDaRua()
		System.out.println(e1.getNomeDaRua().equals("Bla") ? "[OK] Método Endereco.getNomeDaRua()" : "[NOK] Método Endereco.getNomeDaRua()");
		
		//public void setCidade(String cidde);
		e1.setCidade("São Leopoldo");
		System.out.println("[OK] Método Endereco.setCidade()");
		
		//public String getCidade();
		System.out.println(e1.getCidade().equals("São Leopoldo") ? "[OK] Método Endereco.getCidade()" : "[NOK] Método Endereco.getCidade()");
		
		//public void setEstado(String estado);
		e1.setEstado("RS");
		System.out.println("[OK] Método Endereco.setEstado()");
		
		//public String getEstado();
		System.out.println(e1.getEstado().equals("RS") ? "[OK] Método Endereco.getEstado()" : "[NOK] Método Endereco.getEstado()");		
		
		//public void setPais(String pais);
		e1.setPais("Brasil");
		System.out.println("[OK] Método Endereco.setPais()");
		
		//public String getPais();
		System.out.println(e1.getPais().equals("Brasil") ? "[OK] Método Endereco.getPais()" : "[NOK] Método Endereco.getPais()");
		
		//public void setCep(String cep);
		e1.setCep("99999-000");
		System.out.println("[OK] Método Endereco.setCep()");
		
		//public String getCep();
		System.out.println(e1.getCep().equals("99999-000") ? "[OK] Método Endereco.getCep()" : "[NOK] Método Endereco.getCep()");		
		
		//public void setNumero(String numero);
		e1.setNumero("50");
		System.out.println("[OK] Método Endereco.setNumero()");
		
		//public String getNumero();
		System.out.println(e1.getNumero().equals("50") ? "[OK] Método Endereco.getNumero()" : "[NOK] Método Endereco.getNumero()");
		
		//public void setComplemento(String complemento);
		e1.setComplemento("apto 502");
		System.out.println("[OK] Método Endereco.setComplemento()");
		
		//public String getComplemento();
		System.out.println(e1.getComplemento().equals("apto 502") ? "[OK] Método Endereco.getComplemento()" : "[NOK] Método Endereco.getComplemento()");
		
		//public String toString();
		e1.toString();
		System.out.println("[OK] Método Endereco.toString()");
		
		
		//// Verificação da classe Data
		//instância
		Data d1 = new Data(10, 3, 2023);
		System.out.println("\n[OK] Classe Data identificada");
				
		//public void setDia(int dia);
		d1.setDia(15);
		System.out.println("[OK] Método Dia.setDia()");
		
		//public int getDia();
		System.out.println(d1.getDia() == 15 ? "[OK] Método Dia.getDia()" : "[NOK] Método Dia.getDia()");
		
		//public void setMes(int mes);
		d1.setMes(12);
		System.out.println("[OK] Método Dia.setMes()");
		
		//public int getMes()
		System.out.println(d1.getMes() == 12 ? "[OK] Método Dia.getMes()" : "[NOK] Método Dia.getMes()");
		
		//public void setAno(int ano);
		d1.setAno(2024);
		System.out.println("[OK] Método Dia.setAno()");
			
		//public int getAno();
		System.out.println(d1.getAno() == 2024 ? "[OK] Método Dia.getAno()" : "[NOK] Método Dia.getAno()");
		
		//public String toString();	
		d1.toString();
		System.out.println("[OK] Método Data.toString()");
		
		//public boolean verificaAnoBissexto();
		System.out.println(d1.verificaAnoBissexto() ? "[OK] Método Dia.verificaAnoBissexto()" : "[NOK] Método Dia.verificaAnoBissexto()");


		//// Verificação da classe Produto
		Produto p1 = new Produto("Cubo mágico", 10, d1);
		System.out.println("\n[OK] Classe Produto identificada");
		
		//public void setNome(String nome);
		p1.setNome("Cubo maravilha");
		System.out.println("[OK] Método Produto.setNome()");
	
		//public String getNome();
		System.out.println(p1.getNome().equals("Cubo maravilha") ? "[OK] Método Produto.getNome()" : "[NOK] Método Produto.getNome()");

		//public void setPreco(double preco);		
		p1.setPreco(20);
		System.out.println("[OK] Método Produto.setPreco()");
		
		//public double getPreco();
		System.out.println(p1.getPreco() == 20 ? "[OK] Método Produto.getPreco()" : "[NOK] Método Produto.getPreco()");
		
		//public String toString();
		p1.toString();
		System.out.println("[OK] Método Produto.toString()");

		//public void setDataValidade(Data dataValidade);
		p1.setDataDeValidade(new Data(10, 4, 2023));
		System.out.println("[OK] Método Produto.setDataValidade()");
		
		//public double getDataValidade();
		System.out.println(p1.getDataDeValidade() != null ? "[OK] Método Produto.getDataDeValidade()" : "[NOK] Método Produto.getDataDeValidade()");
		
		//public boolean estaVencido(Data data);
		System.out.println(p1.estaVencido(new Data(20, 4, 2023)) ? "[OK] Método Produto.estaVencido()" : "[NOK] Método Produto.estaVencido()");

		
		//// Verificação da classe Loja
		Loja loja1 = new Loja ("E3", 5, e1, d1, 5);
		System.out.println("\n[OK] Classe Loja identificada (construtor com cinco parâmetros)");
		
		Loja loja2 = new Loja ("E7", 20, 2000, e1, d1, 2);
		System.out.println("[OK] Classe Loja identificada (construtor com seis parâmetros)");
		
		//public String getNome();
		System.out.println(loja1.getNome() == "E3" ? "[OK] Método Loja.getNome()" : "[NOK] Método Loja.getNome()");
		
		//public void setNome(String nome);
		loja1.setNome("E10");
		System.out.println("[OK] Método Loja.setNome()");
		
		//public int getQuantidadeFuncionarios();
		System.out.println(loja1.getQuantidadedeFuncionarios() == 5 ? "[OK] Método Loja.getQuantidadeFuncionarios()" : "[NOK] Método Loja.getQuantidadeFuncionarios()");

		//public void setQuantidadeFuncionarios(int quantidadeFuncionarios);
		loja1.setQuantidadedeFuncionarios(3);
		System.out.println("[OK] Método Loja.setQuantidadeFuncionarios()");

		//public double getSalarioBaseFuncionario();
		System.out.println(loja1.getSalarioBaseFuncionario() == -1 ? "[OK] Método Loja.getSalarioBaseFuncionario()" : "[NOK] Método Loja.getSalarioBaseFuncionario()");

		//public void setSalarioBaseFuncionario(double salarioBaseFuncionario);
		loja1.setSalarioBaseFuncionario(3000);
		System.out.println("[OK] Método Loja.setSalarioBaseFuncionario()");
		
		//public Endereco getEndereco();
		System.out.println(loja1.getEndereco() != null ? "[OK] Método Loja.getEndereco()" : "[NOK] Método Loja.getEndereco()");
		
		//public void setEndereco(Endereco endereco);
		loja1.setEndereco(new Endereco("Rua Tainhas", "Porto Feliz", "SP", "Brasil", "88.000-100", "67", "Sala 91"));
		System.out.println("[OK] Método Loja.setEndereco()");
		
		//public Data getDataFundacao();
		System.out.println(loja1.getDataDeFundacao() != null ? "[OK] Método Loja.getDataDeFundacao()" : "[NOK] Método Loja.getDataDeFundacao()");
		
		//public void setDataFundacao(Data dataFundacao);
		loja1.setDataDeFundacao(new Data(10, 8, 2020));
		System.out.println("[OK] Método Loja.setDataFundacao()");
		
		//public Produto[] getEstoqueProdutos();
		System.out.println(loja1.getEstoqueProdutos().length == 5 ? "[OK] Método Loja.getEstoqueProdutos()" : "[NOK] Método Loja.getEstoqueProdutos()");
						
		//public String toString();
		System.out.println(loja1.toString() != null ? "[OK] Método Loja.toString()" : "[NOK] Método Loja.toString()");
		
		//public double gastosComSalario();
		System.out.println(loja1.gastosComSalario() == 9000 ? "[OK] Método Loja.gastosComSalario()" : "[NOK] Método Loja.gastosComSalario()");
		
		//public String tamanhoDaLoja();
		System.out.println(loja1.tamanhoDaLoja() == "P" ? "[OK] Método Loja.tamanhoDaLoja()" : "[NOK] Método Loja.tamanhoDaLoja()");
		
		//public void imprimeProdutos();
		loja1.imprimeProdutos();
		System.out.println("[OK] Método Loja.imprimeProdutos()");
		
		//public boolean insereProduto(Produto p);
		boolean prod1 = loja2.insereProduto(new Produto("Pipoca doce", 5, new Data(10,5,2023)));
		System.out.println(prod1 ? "[OK] Método Loja.insereProduto() - inclusão de um produto" : "[NOK] Método Loja.insereProduto() - não deixou incluir um produto");

		System.out.println(loja2.getEstoqueProdutos()[1] == null ? "[OK] Método Loja.insereProduto() - restante do array permanece vazio" : "[NOK] Método Loja.insereProduto() - ao incluir um produto, mexeu nas demais posições do array");

		boolean prod2 = loja2.insereProduto(new Produto("Pipoca salgada", 4, new Data(15,5,2023)));
		System.out.println((prod1 && prod2) ? "[OK] Método Loja.insereProduto() - inclusão de dois produtos" : "[NOK] Método Loja.insereProduto() - não deixou incluir dois produtos");

		boolean prod3 = loja2.insereProduto(new Produto("Pipoca caramelo", 5, new Data(12,5,2023)));
		System.out.println(!prod3 ? "[OK] Método Loja.insereProduto() - não permitiu inclusão de item quando array cheio" : "[NOK] Método Loja.insereProduto() - permitiu inclusão de item quando array cheio");
		
		//public boolean removeProduto(String nomeProduto)
		boolean rem1 = loja2.removeProduto("Pipoca salgada");
		System.out.println(rem1 ? "[OK] Método Loja.removeProduto()" : "[NOK] Método Loja.removeProduto()");
		
		boolean rem2 = loja2.removeProduto("Pipoc caramelo");
		System.out.println(!rem2 ? "[OK] Método Loja.removeProduto() - não encontrou produto corretamente" : "[NOK] Método Loja.removeProduto() - removeu produto que não existe");

		//// Verificação da classe Cosmetico
		//Criação da instância
		Cosmetico lojaCosmetico = new Cosmetico("Loja Cosmético", 10, 2100, e1, d1, 20, 10);
		System.out.println("\n[OK] Classe Cosmetico identificada");
		
		//public void setTaxaComercializacao(double taxaComercializacao)
		lojaCosmetico.setTaxaComercializacao(50);
		System.out.println("[OK] Método Cosmetico.setTaxaComercializacao()");
		
		//public double getTaxaComercializacao()
		System.out.println(lojaCosmetico.getTaxaComercializacao() == 50 ? "[OK] Método Cosmetico.getTaxaComercializacao()" : "[NOK] Método Cosmetico.getTaxaComercializacao()");
		
		//public String toString()
		System.out.println(lojaCosmetico.toString() != null ? "[OK] Método Cosmetico.toString()" : "[NOK] Método Cosmetico.toString()");

		
		//// Verificação da classe Vestuario
		//Criação da instância
		Vestuario lojaVestuario = new Vestuario("Loja Vestuário", 10, 2100, e1, d1, false, 10);
		System.out.println("\n[OK] Classe Vestuario identificada");
		
		//public void setProdutosImportados(boolean produtosImportados)
		lojaVestuario.setProdutosImportados(true);
		System.out.println("[OK] Método Vestuario.setProdutosImportados()");
		
		//public boolean getProdutosImportados()
		System.out.println(lojaVestuario.getProdutosImportados() ? "[OK] Método Vestuario.getProdutosImportados()" : "[NOK] Método Vestuario.getProdutosImportados()");
		
		//public String toString()
		System.out.println(lojaVestuario.toString() !=  null ? "[OK] Método Vestuario.toString()" : "[NOK] Método Vestuario.toString()");
		
		
		//// Verificação da classe Bijuteria
		//Criação da instância
		Bijuteria lojaBijuteria = new Bijuteria("Loja Bijuteria", 10, 2100, e1, d1, 5000, 10);
		System.out.println("\n[OK] Classe Bijuteria identificada");
		
		//public void setMetaVendas(double metaVendas)
		lojaBijuteria.setMetaVendas(4000);
		System.out.println("[OK] Método Bijuteria.setMetaVendas()");
		
		//public double getMetaVendas()
		System.out.println(lojaBijuteria.getMetaVendas() == 4000 ? "[OK] Método Bijuteria.getMetaVendas()" : "[NOK] Método Bijuteria.getMetaVendas()");
		
		//public String toString()
		System.out.println(lojaBijuteria.toString() != null ? "[OK] Método Bijuteria.toString()" : "[NOK] Método Bijuteria.toString()");
		
		
		//// Verificação da classe Alimentacao
		//Criação da instância
		Alimentacao lojaAlimentacao = new Alimentacao("Loja Alimentação", 10, 2100, e1, d1, d1, 10);
		System.out.println("\n[OK] Classe Alimentacao identificada");

		//public void setDataAlvara(Data dataAlvara)
		lojaAlimentacao.setDataAlvara(new Data(20, 4, 2023));
		System.out.println("[OK] Método Alimentacao.setDataAlvara()");
		
		//public Data getDataAlvara()
		System.out.println(lojaAlimentacao.getDataAlvara() != null ? "[OK] Método Alimentacao.getDataAlvara()" : "[NOK] Método Alimentacao.getDataAlvara()");
		
		//public String toString()
		System.out.println(lojaAlimentacao.toString() != null ? "[OK] Método Alimentacao.toString()" : "[NOK] Método Alimentacao.toString()");

		
		//// Verificação da classe Informatica
		//Criação da instância
		Informatica lojaInformatica = new Informatica("Loja Informática", 10, 2100, e1, d1, 300, 10);
		System.out.println("\n[OK] Classe Informatica identificada");
		
		//public void setSeguroEletronicos(double seguroEletronicos)
		lojaInformatica.setSeguroEletronicos(500);
		System.out.println("[OK] Método Informatica.setSeguroEletronicos()");
		
		//public double getSeguroEletronicos()
		System.out.println(lojaInformatica.getSeguroEletronicos() == 500 ? "[OK] Método Informatica.getSeguroEletronicos()" : "[NOK] Método Informatica.getSeguroEletronicos()");

		//public String toString()
		System.out.println(lojaInformatica.toString() != null ? "[OK] Método Informatica.toString()" : "[NOK] Método Informatica.toString()");
		
		
		//// Verificação da classe Shopping
		Shopping shopping = new Shopping("Shopping Real", e1, 2);
		System.out.println("\n[OK] Classe Shopping idetificada");

		//public void setNome(String nome)
		shopping.setNome("Park Shopping");
		System.out.println("[OK] Método Shopping.setNome()");

		//public String getNome()
		System.out.println(shopping.getNome().equals("Park Shopping") ? "[OK] Método Shopping.getNome()" : "[NOK] Método Shopping.getNome()");

		//public void setEndereco(Endereco endereco)
		Endereco e2 = new Endereco("Rua das Flores", "Porto Alegre","RS", "Brasil", "91000-100", "15", null);
		shopping.setEndereco(e2);
		System.out.println("[OK] Método Shopping.setEndereco()");

		//public Endereco getEndereco()
		System.out.println(shopping.getEndereco().getNumero().equals("15") ? "[OK] Método Shopping.getEndereco()" : "[NOK] Método Shopping.getEndereco()");

		//public Loja[] getLojas()
		System.out.println(shopping.getLojas().length == 2 ? "[OK] Método Shopping.getLojas()" : "[NOK] Método Shopping.getLojas()");

		//public boolean insereLoja(Loja loja)
		boolean criaLoja1 = shopping.insereLoja(lojaInformatica);
		System.out.println(criaLoja1 ? "[OK] Método Shopping.insereLoja() - inclusão de uma loja" : "[NOK] Método Shopping.insereLoja() - não deixou inserir a primeira loja");

		System.out.println(shopping.getLojas()[1] == null ? "[OK] Método Shopping.insereLoja() - restante do array permanece vazio" : "[NOK] Método Shopping.insereLoja() - ao incluir uma loja, mexeu nas demais posições do array");
		
		boolean criaLoja2 = shopping.insereLoja(lojaBijuteria);
		System.out.println((criaLoja1 && criaLoja2) ? "[OK] Método Shopping.insereLoja() - inclusão de duas lojas" : "[NOK] Método Shopping.insereLoja() - não deixou incluir duas lojas");
		
		boolean criaLoja3 = shopping.insereLoja(lojaCosmetico);
		System.out.println(!criaLoja3 ? "[OK] Método Shopping.insereLoja() - não permitiu inclusão de item quando array cheio" : "[NOK] Método Shopping.insereLoja() - permitiu inclusão de item quando array cheio");

		//public int quantidadeLojasPorTipo(String tipoLoja)
		int total = shopping.quantidadeLojasPorTipo("Bijuteria");
		System.out.println(total == 1 ? "[OK] Método Shopping.quantidadeLojasPorTipo() - localizou uma loja" : "[NOK] Método Shopping.quantidadeLojasPorTipo() - não conseguiu localizar uma loja");

		//public boolean removeLoja(String nomeLoja)
		boolean removeLoja1 = shopping.removeLoja("Loja Bijuteria");
		System.out.println(removeLoja1 ? "[OK] Método Shopping.removeLoja() - removeu corretamente uma loja" : "[NOK] Método Shopping.removeLoja() - não conseguiu remover a loja");

		boolean removeLoja2 = shopping.removeLoja("Loja Bijuteria");
		System.out.println(!removeLoja2 ? "[OK] Método Shopping.removeLoja() - loja não existe para remover" : "[NOK] Método Shopping.removeLoja() - removeu uma loja que não existe");

		lojaInformatica.setSeguroEletronicos(800);
		shopping.insereLoja(lojaInformatica);
		total = shopping.quantidadeLojasPorTipo("Informática");
		System.out.println(total == 2 ? "[OK] Método Shopping.quantidadeLojasPorTipo() - localizou duas lojas" : "[NOK] Método Shopping.quantidadeLojasPorTipo() - não conseguiu localizar as lojas");

		//public Informatica lojaSeguroMaisCaro()
		Informatica maisCaro = shopping.lojaSeguroMaisCaro();
		System.out.println(maisCaro.getSeguroEletronicos() == 800 ? "[OK] Método Shopping.lojaSeguroMaisCaro()" : "[NOK] Método Shopping.lojaSeguroMaisCaro");

	}
}
