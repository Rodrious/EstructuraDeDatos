package Semana7.dto;

public class Docente extends Persona{
    private String codiDoce;

    public Docente() {
    }

    public Docente(String codiDoce) {
        this.codiDoce = codiDoce;
    }

    public Docente(String codiDoce, String ndniPers, String appaPers, String apmaPers, String nombPers) {
        super(ndniPers, appaPers, apmaPers, nombPers);
        this.codiDoce = codiDoce;
    }

    public String getCodiDoce() {
        return codiDoce;
    }

    public void setCodiDoce(String codiDoce) {
        this.codiDoce = codiDoce;
    }
    
    
}
