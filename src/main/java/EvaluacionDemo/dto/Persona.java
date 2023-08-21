package EvaluacionDemo.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByNdniPers", query = "SELECT p FROM Persona p WHERE p.ndniPers = :ndniPers"),
    @NamedQuery(name = "Persona.findByApelPers", query = "SELECT p FROM Persona p WHERE p.apelPers = :apelPers"),
    @NamedQuery(name = "Persona.findByNombPers", query = "SELECT p FROM Persona p WHERE p.nombPers = :nombPers")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ndniPers")
    private String ndniPers;
    @Basic(optional = false)
    @Column(name = "apelPers")
    private String apelPers;
    @Basic(optional = false)
    @Column(name = "nombPers")
    private String nombPers;

    public Persona() {
    }

    public Persona(String ndniPers) {
        this.ndniPers = ndniPers;
    }

    public Persona(String ndniPers, String apelPers, String nombPers) {
        this.ndniPers = ndniPers;
        this.apelPers = apelPers;
        this.nombPers = nombPers;
    }

    public String getNdniPers() {
        return ndniPers;
    }

    public void setNdniPers(String ndniPers) {
        this.ndniPers = ndniPers;
    }

    public String getApelPers() {
        return apelPers;
    }

    public void setApelPers(String apelPers) {
        this.apelPers = apelPers;
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
        hash += (ndniPers != null ? ndniPers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.ndniPers == null && other.ndniPers != null) || (this.ndniPers != null && !this.ndniPers.equals(other.ndniPers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Persona[ ndniPers=" + ndniPers + " ]";
    }
    
}
