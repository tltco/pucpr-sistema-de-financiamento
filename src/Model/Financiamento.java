package Model;

/*
iv. Crie um método público para mostrar na tela uma mensagem contendo
os dados do financiamento,
* como o valor total do financiamento e o valor do imóvel.
* */

public class Financiamento {
    //Atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJuros;

    //Getters
    double getValorImovel(){
        return this.valorImovel;
    }
    double getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }
    double getTaxaJuros(){
        return this.taxaJuros;
    }

    //Construtor
    public Financiamento(double valorDesejavelImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejavelImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJuros = taxaJurosAnual;
    }

    //Métodos
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJuros / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void imprimirDadosFinanciamento(){
        System.out.println("..................");
        System.out.println("Valor do Imóvel: R$" + this.valorImovel);
        System.out.println("Taxa de Juros: " + this.taxaJuros);
        System.out.println("O prazo do financiamento em anos: " + this.prazoFinanciamento);
        System.out.println("Valor Mensal: R$" + this.calcularPagamentoMensal());
        System.out.println("Valor Total: R$" + this.calcularTotalPagamento());
        System.out.println("..................");
    }
}
