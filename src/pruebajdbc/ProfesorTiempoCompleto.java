/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajdbc;

/**
 *
 * @author OrixStranger
 */
public class ProfesorTiempoCompleto extends Profesor {
    int HORAS_SEMANALES = 40;

    public ProfesorTiempoCompleto(String cedula, String nombre, String apellido, int horasClase, String carrera, int horasTrabajo) {
        super(cedula, nombre, apellido, horasClase, carrera, horasTrabajo);
    }

    
    
    @Override
    public int horasComplementarias() {
        return HORAS_SEMANALES - getHorasClase();
    }

    @Override
    public String toString() {
        return super.toString() + HORAS_SEMANALES + horasComplementarias();
    }

    
}