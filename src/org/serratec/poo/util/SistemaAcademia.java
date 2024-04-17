package org.serratec.poo.util;

import java.util.List;
import org.serratec.poo.classes.Avaliacao;

public class SistemaAcademia {

   
    public void visualizarListaPersonalTrainers(List<Avaliacao> avaliacao) {
        for (Avaliacao pt: avaliacao) {
        
        System.out.println(pt.getAgendamento() + "\n" + pt.getDescricao());
             
        }
    }
    
}