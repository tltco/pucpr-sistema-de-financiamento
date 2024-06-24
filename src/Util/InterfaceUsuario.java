package Util;
import java.util.Scanner;

public class InterfaceUsuario {
    //Métodos
    public InterfaceUsuario(){}

    public double solicitarValorImovel() {
        System.out.println("Informe o valor do imóvel: ");
        Scanner in = new Scanner(System.in);
        double inputValor = 0;
        try{
            inputValor = in.nextDouble();
        }
        catch(Exception e) {
            System.out.println("Valor inválido, por favor tente novamente!");
            solicitarValorImovel();
        }

        if(inputValor<0){
            System.out.println("O valor deve ser postivo");
            solicitarValorImovel();
        }
        return inputValor;
    }

    public int solicitarPrazoFinanciamento() {
        System.out.println("Informe o prazo do financiamento em anos: ");
        Scanner in = new Scanner(System.in);
        int inputPrazo = 0;
        try{
            inputPrazo = in.nextInt();
        }
        catch(Exception e) {
            System.out.println("Valor inválido, por favor tente novamente!");
            solicitarPrazoFinanciamento();
        }
        if(inputPrazo<0){
            System.out.println("O valor deve ser postivo");
            solicitarPrazoFinanciamento();
        }
        return inputPrazo;
    }

    public double solicitarTaxaJuros() {
        System.out.println("Informe a taxa de juros: ");
        Scanner in = new Scanner(System.in);
        double inputJuros = 0;
        try{
            inputJuros = in.nextDouble();
        }
        catch(Exception e) {
            System.out.println("Valor inválido, por favor tente novamente!");
            solicitarTaxaJuros();
        }
        if(inputJuros<0){
            System.out.println("O valor deve ser postivo");
            solicitarTaxaJuros();
        }
        return inputJuros;
    }
}
