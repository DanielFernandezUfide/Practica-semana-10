/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Competencia {

    private Participante[] participante;

    public Competencia(int cantidad) {
        this.participante = new Participante[cantidad];
    }

    public void SetParticipante() {
        for (int i = 0; i < participante.length; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del participante " + i);
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del participante " + i));
            String tipoCocinero = JOptionPane.showInputDialog("Ingrese el tipo de cocinero participante " + i);
            

            participante[i] = new Participante(nombre, edad);
            
            while (true){
                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de cocinero, donde 1- Novato, 2- Amateur 3- Profesional 4- Experto " + i));
                switch (tipo) {
                case 1:
                    participante[i].setTipoCocinero(TipoCocinero.Novato);
                    break;
                case 2:
                    participante[i].setTipoCocinero(TipoCocinero.Amateur);
                    break;
                case 3:
                    participante[i].setTipoCocinero(TipoCocinero.Profesional);
                    break;
                case 4:
                    participante[i].setTipoCocinero(TipoCocinero.Experto);
                    break;
                default:
                    break;
            }
            }
            

        }
    }
}
