package Semana7.dto;

public class Alumno extends Persona{
    private String codiAlum;

    public Alumno() {
    }

    public Alumno(String codiAlum) {
        this.codiAlum = codiAlum;
    }

    public Alumno(String codiAlum, String ndniPers, String appaPers, String apmaPers, String nombPers) {
        super(ndniPers, appaPers, apmaPers, nombPers);
        this.codiAlum = codiAlum;
    }

    public String getCodiAlum() {
        return codiAlum;
    }

    public void setCodiAlum(String codiAlum) {
        this.codiAlum = codiAlum;
    }
    
}
