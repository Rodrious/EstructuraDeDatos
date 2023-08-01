package Semana12.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByCodiPers", query = "SELECT p FROM Persona p WHERE p.codiPers = :codiPers"),
    @NamedQuery(name = "Persona.findByAppaPers", query = "SELECT p FROM Persona p WHERE p.appaPers = :appaPers"),
    @NamedQuery(name = "Persona.findByApmaPers", query = "SELECT p FROM Persona p WHERE p.apmaPers = :apmaPers"),
    @NamedQuery(name = "Persona.findByNombPers", query = "SELECT p FROM Persona p WHERE p.nombPers = :nombPers")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codiPers")
    private Integer codiPers;
    @Basic(optional = false)
    @Column(name = "appaPers")
    private String appaPers;
    @Basic(optional = false)
    @Column(name = "apmaPers")
    private String apmaPers;
    @Basic(optional = false)
    @Column(name = "nombPers")
    private String nombPers;

    public Persona() {
    }

    public Persona(Integer codiPers) {
        this.codiPers = codiPers;
    }

    public Persona(Integer codiPers, String appaPers, String apmaPers, String nombPers) {
        this.codiPers = codiPers;
        this.appaPers = appaPers;
        this.apmaPers = apmaPers;
        this.nombPers = nombPers;
    }

    public Integer getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(Integer codiPers) {
        this.codiPers = codiPers;
    }

    public String getAppaPers() {
        return appaPers;
    }

    public void setAppaPers(String appaPers) {
        this.appaPers = appaPers;
    }

    public String getApmaPers() {
        return apmaPers;
    }

    public void setApmaPers(String apmaPers) {
        this.apmaPers = apmaPers;
    }

    public String getNombPers() {
        return nombPers;
    }

    public void setNombPers(String nombPers) {
        this.nombPers = nombPers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiPers != null ? codiPers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.codiPers == null && other.codiPers != null) || (this.codiPers != null && !this.codiPers.equals(other.codiPers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Semana12.dto.Persona[ codiPers=" + codiPers + " ]";
    }
    
}
