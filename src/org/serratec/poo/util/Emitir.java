package org.serratec.poo.util;

import java.util.List;

import org.serratec.poo.classes.Plano;

public class Emitir {


    public static void relatorioPlanos(List<Plano> planos) {
        if (planos == null) {

            System.out.println("Não existe planos cadastrados.");
            return;
        }
        System.out.println("Relatório de Planos:");
        for (Plano plano : planos) {
            System.out.println("Nome: " + plano.getNome());
            System.out.println("Duração: " + plano.getDuracao());
            System.out.println("Valor: " + plano.getValor());
            System.out.println("Descrição: " + plano.getDescricao());


    }

    }
}