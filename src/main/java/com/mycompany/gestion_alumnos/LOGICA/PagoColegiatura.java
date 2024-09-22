package com.mycompany.gestion_alumnos.LOGICA;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * Created by Frame-Code, September 2024
 */
@Entity(name = "PAGO_COLEGIATURA")
public class PagoColegiatura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MONTO")
    private Integer monto;

    @Column(name = "MES", length = 15, nullable = false)
    private String mes;

    @Column(name = "ESTADO", nullable = false)
    private Boolean estado;

    public PagoColegiatura() {
    }

    public PagoColegiatura(Long id, Integer monto, String mes, Boolean estado) {
        this.id = id;
        this.monto = monto;
        this.mes = mes;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.monto);
        hash = 79 * hash + Objects.hashCode(this.mes);
        hash = 79 * hash + Objects.hashCode(this.estado);
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
        final PagoColegiatura other = (PagoColegiatura) obj;
        if (!Objects.equals(this.mes, other.mes)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.monto, other.monto)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }

    @Override
    public String toString() {
        return "PagoColegiatura{" + "id=" + id + ", monto=" + monto + ", mes=" + mes + ", estado=" + estado + '}';
    }
}
