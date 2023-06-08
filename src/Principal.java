import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int menu = 0;
        Loja loja = null;
        Produto produto = null;


        Scanner scannerMenu = new Scanner (System.in);
        while (menu != 3) {
            System.out.println("\u001b[1m\u001b[30m\u001b[43m(1) Criar uma loja\u001b[m");
            System.out.println("\u001b[1m\u001b[30m\u001b[43m(2) Criar um produto\u001b[m");
            System.out.println("\u001b[1m\u001b[30m\u001b[43m(3) Sair\u001b[m");
            
	        System.out.print("\u001b[1m\u001b[30m\u001b[43mDigite a opção desejada:\u001b[m ");
            int Menu = scannerMenu.nextInt();
	

switch (Menu) {
                case 1:
                    loja = novaLoja();
                    System.out.println("Loja criada com sucesso: " + loja);
                    System.out.println(loja.toString());
                    break;
                case 2:
                    produto = novoProduto();
                    System.out.println("Produto criado com sucesso: " + produto);
                    System.out.println(produto.toString());

                    Data dataReferencia = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataReferencia)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                //default:
                 //   System.out.println("Opção inválida");
                 //   break;
            }
        }

    }

            public static Loja novaLoja() {
                Scanner scannerLoja = new Scanner(System.in);
                System.out.println("Digite o nome da loja: ");
                String nome = scannerLoja.nextLine();
                System.out.println("Digite a quantidade de funcionarios: ");
                int quantidadeFuncionarios = scannerLoja.nextInt();
                System.out.println("Digite o salario base: ");
                double salarioBaseFuncionario = scannerLoja.nextDouble();
                System.out.println("Digite a quantidade de produtos:");
                int quantMaxProdutos = scannerLoja.nextInt();
                scannerLoja.close();
                Data dataFundacao = novaData("Digite a data de fundação da sua loja: ");
                Endereco endereco = novoEndereco("Digite as informações referente ao seu endereço: ");
                
                return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco, quantMaxProdutos);
                
            }
            public static Produto novoProduto() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.close();
                return new Produto(nome, preco, novaData("digite a data de validade"));
                
            }
        
            private static Endereco novoEndereco(String mensagem) {
                Scanner scannerEndereco = new Scanner(System.in);
                System.out.println(mensagem);
        
                System.out.println("Dados endereço, rua: ");
                String nomeDaRua = scannerEndereco.nextLine();
        
                System.out.println("Número:");
                String numero = scannerEndereco.nextLine();
        
                System.out.println("Cidade:");
                String nomeDaCidade = scannerEndereco.nextLine();
        
                System.out.println("País:");
                String pais = scannerEndereco.nextLine();
        
                System.out.println("Estado:");
                String estado = scannerEndereco.nextLine();
        
                System.out.println("CEP:");
                String cep = scannerEndereco.nextLine();
        
                System.out.println("Complemento:");
                String complemento = scannerEndereco.nextLine();
                scannerEndereco.close();
        
                return new Endereco(nomeDaRua, nomeDaCidade, estado, pais, cep, numero, complemento);
            }
        
            private static Data novaData(String mensagemInicial) {
                System.out.println(mensagemInicial);
                Scanner scannerData = new Scanner(System.in);
                System.out.println("Digite o dia:");
                int dia = scannerData.nextInt();
                System.out.println("Digite o mes:");
                int mes = scannerData.nextInt();
                System.out.println("Digite o ano:");
                int ano = scannerData.nextInt();
                scannerData.close();
        
                return new Data(dia, mes, ano);
               
            }
        
        }

