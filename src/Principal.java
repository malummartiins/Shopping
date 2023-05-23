import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto(null, 0, null);
        Loja loja = new Loja(null, 0, 0, null, null);

        System.out.println("""
                (1) criar uma loja
                (2) criar um produto
                (3) sair""");

                Scanner scanner = new Scanner(System.in);

                int selectedOption = scanner.nextInt();
                boolean isInvalidOption = true;
        
                while (isInvalidOption) {
                    if (selectedOption == 1) {
                        loja = novaLoja();
                        isInvalidOption = false;
                    } else if (selectedOption == 2) {
                        produto = novoProduto();
                        isInvalidOption = false;
                    } else if (selectedOption == 3) {
                        System.out.println("Sair");
                        isInvalidOption = false;
                    }
        
                    if (isInvalidOption) {
                        System.out.println("Opção inválida, tente novamente");
                    }
                }
        
                if (produto.estaVencido(new Data(20, 10, 2023))) {
                    System.out.println("Produto vencido");
                }
        
                System.out.println(loja);
            }
            public static Loja novaLoja() {
                Scanner scannerLoja = new Scanner(System.in);
                System.out.println("Digite o nome da loja");
                String nome = scannerLoja.nextLine();
                System.out.println("Digite a quantidade de funcionarios");
                int quantidadeFuncionarios = scannerLoja.nextInt();
                System.out.println("Digite o salario base");
                double salarioBaseFuncionario = scannerLoja.nextDouble();
                Data dataFundacao = novaData("Digite a data de fundação da sua loja");
                Endereco endereco = novoEndereco("Digite as informações referente ao seu endereço");
        
                return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
            }
            public static Produto novoProduto() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o nome da loja");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto");
                double preco = scanner.nextDouble();
        
                return new Produto(nome, preco, novaData("digite a data de validade"));
            }
        
            private static Endereco novoEndereco(String mensagem) {
                Scanner scannerEndereco = new Scanner(System.in);
                System.out.println(mensagem);
        
                System.out.println("Digite o nome da sua rua");
                String nomeDaRua = scannerEndereco.nextLine();
        
                System.out.println("Digite o numero do seu endereço:");
                String numero = scannerEndereco.nextLine();
        
                System.out.println("Digite o nome da sua cidade:");
                String nomeDaCidade = scannerEndereco.nextLine();
        
                System.out.println("Digite o nome do seu país:");
                String pais = scannerEndereco.nextLine();
        
                System.out.println("Digite o nome do seu estado:");
                String estado = scannerEndereco.nextLine();
        
                System.out.println("Digite o numero do seu cep:");
                String cep = scannerEndereco.nextLine();
        
                System.out.println("Digite o complemento do seu endereço:");
                String complemento = scannerEndereco.nextLine();
        
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
        
                return new Data(dia, mes, ano);
            }
        }

