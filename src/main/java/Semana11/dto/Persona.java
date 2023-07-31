package Semana11.dto;

public class Persona {
    private int codiPers;
    private String appaPers;
    private String apmaPers;
    private String nombPers;

    public Persona() {
    }

    public Persona(int codiPers, String appaPers, String apmaPers, String nombPers) {
        this.codiPers = codiPers;
        this.appaPers = appaPers;
        this.apmaPers = apmaPers;
        this.nombPers = nombPers;
    }

    public int getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(int codiPers) {
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
    public String toString() {
        return "Persona{" + "codiPers=" + codiPers + ", appaPers=" + appaPers + ", apmaPers=" + apmaPers + ", nombPers=" + nombPers + '}';
    }

}
