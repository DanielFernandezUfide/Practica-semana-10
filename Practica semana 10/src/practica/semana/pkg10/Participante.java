/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg10;

/**
 *
 * @author Laboratorio
 */
public class Participante {
    private String nombre;
    private int edad;
    private int puntos[][];
    private TipoCocinero tipoCocinero;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

        public int[][] getPuntos() {
            return puntos;
        }

        public void setPuntos(int[][] puntos) {
            this.puntos = puntos;
        }

    public TipoCocinero getTipoCocinero() {
        return tipoCocinero;
    }

    public void setTipoCocinero(TipoCocinero tipoCocinero) {
        this.tipoCocinero = tipoCocinero;
    }

        
    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", edad=" + edad + ", puntos=" + puntos + '}';
    }


    
 
    }


    
    
    

