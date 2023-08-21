/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionCuatro.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "alumno")
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByCodiAlu", query = "SELECT a FROM Alumno a WHERE a.codiAlu = :codiAlu"),
    @NamedQuery(name = "Alumno.findByApelAlu", query = "SELECT a FROM Alumno a WHERE a.apelAlu = :apelAlu"),
    @NamedQuery(name = "Alumno.findByNombAlu", query = "SELECT a FROM Alumno a WHERE a.nombAlu = :nombAlu"),
    @NamedQuery(name = "Alumno.findByPesoAlu", query = "SELECT a FROM Alumno a WHERE a.pesoAlu = :pesoAlu"),
    @NamedQuery(name = "Alumno.findByFechaNaciAlu", query = "SELECT a FROM Alumno a WHERE a.fechaNaciAlu = :fechaNaciAlu")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codiAlu")
    private Integer codiAlu;
    @Basic(optional = false)
    @Column(name = "apelAlu")
    private String apelAlu;
    @Basic(optional = false)
    @Column(name = "nombAlu")
    private String nombAlu;
    @Basic(optional = false)
    @Column(name = "pesoAlu")
    private double pesoAlu;
    @Basic(optional = false)
    @Column(name = "fechaNaciAlu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNaciAlu;

    public Alumno() {
    }

    public Alumno(Integer codiAlu) {
        this.codiAlu = codiAlu;
    }

    public Alumno(Integer codiAlu, String apelAlu, String nombAlu, double pesoAlu, Date fechaNaciAlu) {
        this.codiAlu = codiAlu;
        this.apelAlu = apelAlu;
        this.nombAlu = nombAlu;
        this.pesoAlu = pesoAlu;
        this.fechaNaciAlu = fechaNaciAlu;
    }

    public Integer getCodiAlu() {
        return codiAlu;
    }

    public void setCodiAlu(Integer codiAlu) {
        this.codiAlu = codiAlu;
    }

    public String getApelAlu() {
        return apelAlu;
    }

    public void setApelAlu(String apelAlu) {
        this.apelAlu = apelAlu;
    }

    public String getNombAlu() {
        return nombAlu;
    }

    public void setNombAlu(String nombAlu) {
        this.nombAlu = nombAlu;
    }

    public double getPesoAlu() {
        return pesoAlu;
    }

    public void setPesoAlu(double pesoAlu) {
        this.pesoAlu = pesoAlu;
    }

    public Date getFechaNaciAlu() {
        return fechaNaciAlu;
    }

    public void setFechaNaciAlu(Date fechaNaciAlu) {
        this.fechaNaciAlu = fechaNaciAlu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiAlu != null ? codiAlu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.codiAlu == null && other.codiAlu != null) || (this.codiAlu != null && !this.codiAlu.equals(other.codiAlu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaluacionCuatro.dto.Alumno[ codiAlu=" + codiAlu + " ]";
    }
    
}
