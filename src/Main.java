import java.util.Scanner;

/*
    .................................................................................
    📂 | ATIVIDADE SOMATIVA | Sistema de Simulação de Financiamentos Imobiliários.
    .................................................................................
    Curso: Análise e Desenvolvimento de Sistemas
    Disciplina: Fundamentos da Programação Orientada a Objetos (11100010550_20241_20)
    Aluna: Talita Costa Pereira
    .................................................................................
*/

class Financiamento{
    //Atributos
    double valorImovel;
    int prazoFinanciamento;
    double taxaJuros;

    //Construtor
    Financiamento(double valorDesejavelImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        this.valorImovel= valorDesejavelImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJuros = taxaJurosAnual;
    }

    //Métodos
    double calcularPagamentoMensal(){
        return (this.valorImovel /(this.prazoFinanciamento * 12)) * (1+ (this.taxaJuros / 12));
    }

    double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}

class InterfaceUsuario{
    //Métodos

    double solicitarValorImovel(){
        System.out.println("Informe o valor do imóvel: ");
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    int solicitarPrazoFinanciamento(){
        System.out.println("Informe o prazo do financiamento em anos: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    double solicitarTaxaJuros(){
        System.out.println("Informe a taxa de juros: ");
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        double taxaJuros = interfaceUsuario.solicitarTaxaJuros();
        int prazoFinanciamentoAnos = interfaceUsuario.solicitarPrazoFinanciamento();
        double valorImovel = interfaceUsuario.solicitarValorImovel();

        Financiamento solicitarFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJuros);

        //Calcular pagamento Total
        System.out.println("O total do financiamento anual é de: R$" + solicitarFinanciamento.calcularTotalPagamento());
        System.out.println("O total do financiamento mensal é de: R$" + solicitarFinanciamento.calcularPagamentoMensal());
    }
}