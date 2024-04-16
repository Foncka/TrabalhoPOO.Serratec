package org.serratec.poo.util;

import java.util.ArrayList;

import org.serratec.poo.classes.PersonalTrainer;


public class SistemaAcademia {
    private ArrayList<PersonalTrainer> personalTrainers;

    public SistemaAcademia() {
        this.personalTrainers = new ArrayList<>();
    }

    public void adicionarPersonalTrainer(PersonalTrainer personalTrainer) {
        personalTrainers.add(personalTrainer);
    }

    public void visualizarListaPersonalTrainers() {
        for (PersonalTrainer pt: personalTrainers) {
        
        System.out.println("Personal Trainer: " + personalTrainers + 
                " Aluno: " + pt.getNome() + 
                " CPF: " + pt.getCpf() +
                " Hora de Atendimento: " + pt.getHoraAtendimento());
        }
    }
    
}