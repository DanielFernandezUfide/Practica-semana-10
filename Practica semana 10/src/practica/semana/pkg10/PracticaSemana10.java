/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.semana.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class PracticaSemana10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu = "======Competencia de cocineros mundial======";
        menu += "\n Seleccione una de las siguientes opciones";
        menu += "\n 1- Agregar Participantes";
        menu += "\n 2- Mostrar Participantes";
        menu += "\n 3- Editar Participante";
        menu += "\n 4- Final de la competencia";
        menu += "\n 5- Salir";
        while (true){
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (seleccion){
                case 1:
                    
            }
        }
    }
    public void AgregarParticipantes (){
        Competencia participante = new Competencia(5);
        for (int i = 0; i < 5; i++) {
            
            
            
        }
    }
}
