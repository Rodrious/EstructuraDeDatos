package Semana7.dto;

public class Persona {
    private String ndniPers;
    private String appaPers;
    private String apmaPers;
    private String nombPers;

    public Persona() {
    }

    public Persona(String ndniPers, String appaPers, String apmaPers, String nombPers) {
        this.ndniPers = ndniPers;
        this.appaPers = appaPers;
        this.apmaPers = apmaPers;
        this.nombPers = nombPers;
    }

    public String getNdniPers() {
        return ndniPers;
    }

    public void setNdniPers(String ndniPers) {
        this.ndniPers = ndniPers;
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
    
}
