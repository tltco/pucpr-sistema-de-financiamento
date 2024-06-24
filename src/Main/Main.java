package Main;

import Util.InterfaceUsuario;
import Model.Financiamento;

/*
    .................................................................................
    📂 | ATIVIDADE SOMATIVA | Sistema de Simulação de Financiamentos Imobiliários.
    .................................................................................
    Curso: Análise e Desenvolvimento de Sistemas
    Disciplina: Fundamentos da Programação Orientada a Objetos (11100010550_20241_20)
    Aluna: Talita Costa Pereira
    .................................................................................
*/

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        double taxaJuros = interfaceUsuario.solicitarTaxaJuros();
        int prazoFinanciamentoAnos = interfaceUsuario.solicitarPrazoFinanciamento();
        double valorImovel = interfaceUsuario.solicitarValorImovel();

        Financiamento solicitarFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJuros);

        //Imprimir dados do financiamento
        solicitarFinanciamento.imprimirDadosFinanciamento();
    }
}