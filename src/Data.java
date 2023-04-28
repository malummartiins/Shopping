public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia < 1 || dia > 31) {
                valorPadraoMsgDeErro();
            } else if (mes == 2){
                if ((dia <1 || dia >29 && verificaAnoBissexto())|| (dia > 28 && !verificaAnoBissexto())){
                    valorPadraoMsgDeErro();
                } else {
                    if (dia <1 || dia >30) {
                        valorPadraoMsgDeErro();
                    }
                }
            }
        }
    } 
    
    

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    // toString

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto(){
        if (ano % 400 == 0){
            return true;
        }else {
            return false;
        }
    }
    // valor mensagem erro

    private void valorPadraoMsgDeErro(){
        System.out.println("Data inválida! A data foi redefinidada para 01/01/2000\n");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
}
}
