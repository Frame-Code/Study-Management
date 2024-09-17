package com.mycompany.gestion_alumnos.LOGICA;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * Created by Frame-Code, September 2024
 */
public class Matricula {
    private LocalDate fecha_matriculacion;
    private LocalDate fecha_vencimiento;
    private String estado;

    public Matricula() {
    }
    public Matricula(LocalDate fecha_matriculacion, LocalDate fecha_vencimiento, String estado) {
        this.fecha_matriculacion = fecha_matriculacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
    }

    public LocalDate getFecha_matriculacion() {
        return fecha_matriculacion;
    }

    public void setFecha_matriculacion(LocalDate fecha_matriculacion) {
        this.fecha_matriculacion = fecha_matriculacion;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.fecha_matriculacion);
        hash = 89 * hash + Objects.hashCode(this.fecha_vencimiento);
        hash = 89 * hash + Objects.hashCode(this.estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.fecha_matriculacion, other.fecha_matriculacion)) {
            return false;
        }
        return Objects.equals(this.fecha_vencimiento, other.fecha_vencimiento);
    }

    @Override
    public String toString() {
        return "Matricula{" + "fecha_matriculacion=" + fecha_matriculacion + ", fecha_vencimiento=" + fecha_vencimiento + ", estado=" + estado + '}';
    }
    
}
