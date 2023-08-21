/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionCuatro.dto;

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

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "login")
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByCodiAlu", query = "SELECT l FROM Login l WHERE l.codiAlu = :codiAlu"),
    @NamedQuery(name = "Login.findByLogiAlu", query = "SELECT l FROM Login l WHERE l.logiAlu = :logiAlu"),
    @NamedQuery(name = "Login.validar", query = "SELECT l FROM Login l WHERE l.logiAlu = :logiAlu AND l.passAlu = :passAlu"),
    @NamedQuery(name = "Login.findByPassAlu", query = "SELECT l FROM Login l WHERE l.passAlu = :passAlu")})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codiAlu")
    private Integer codiAlu;
    @Basic(optional = false)
    @Column(name = "logiAlu")
    private String logiAlu;
    @Basic(optional = false)
    @Column(name = "passAlu")
    private String passAlu;

    public Login() {
    }

    public Login(Integer codiAlu) {
        this.codiAlu = codiAlu;
    }

    public Login(Integer codiAlu, String logiAlu, String passAlu) {
        this.codiAlu = codiAlu;
        this.logiAlu = logiAlu;
        this.passAlu = passAlu;
    }

    public Integer getCodiAlu() {
        return codiAlu;
    }

    public void setCodiAlu(Integer codiAlu) {
        this.codiAlu = codiAlu;
    }

    public String getLogiAlu() {
        return logiAlu;
    }

    public void setLogiAlu(String logiAlu) {
        this.logiAlu = logiAlu;
    }

    public String getPassAlu() {
        return passAlu;
    }

    public void setPassAlu(String passAlu) {
        this.passAlu = passAlu;
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
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.codiAlu == null && other.codiAlu != null) || (this.codiAlu != null && !this.codiAlu.equals(other.codiAlu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Login[ codiAlu=" + codiAlu + " ]";
    }
    
}
