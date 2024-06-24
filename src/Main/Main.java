package Main;

import Util.InterfaceUsuario;
import Model.Financiamento;

import java.util.ArrayList;

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
        ArrayList<Financiamento> colecao= new ArrayList<Financiamento>();

        for(int i = 0; i<4; i++){
            double taxaJuros = interfaceUsuario.solicitarTaxaJuros();
            int prazoFinanciamentoAnos = interfaceUsuario.solicitarPrazoFinanciamento();
            double valorImovel = interfaceUsuario.solicitarValorImovel();
            colecao.add(new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJuros));
        }

        //Imprimir dados do financiamento
        colecao.forEach(Financiamento::imprimirDadosFinanciamento);
    }
}