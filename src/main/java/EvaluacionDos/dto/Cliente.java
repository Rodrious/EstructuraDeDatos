package EvaluacionDos.dto;

import java.util.Date;

public class Cliente {
    private String ndniClie;
    private String appaClie;
    private String apmaClie;
    private String nombClie;
    private Date fechNaci;

    public Cliente() {
    }

    public Cliente(String ndniClie, String appaClie, String apmaClie, String nombClie, Date fechNaci) {
        this.ndniClie = ndniClie;
        this.appaClie = appaClie;
        this.apmaClie = apmaClie;
        this.nombClie = nombClie;
        this.fechNaci = fechNaci;
    }

    public String getNdniClie() {
        return ndniClie;
    }

    public void setNdniClie(String ndniClie) {
        this.ndniClie = ndniClie;
    }

    public String getAppaClie() {
        return appaClie;
    }

    public void setAppaClie(String appaClie) {
        this.appaClie = appaClie;
    }

    public String getApmaClie() {
        return apmaClie;
    }

    public void setApmaClie(String apmaClie) {
        this.apmaClie = apmaClie;
    }

    public String getNombClie() {
        return nombClie;
    }

    public void setNombClie(String nombClie) {
        this.nombClie = nombClie;
    }

    public Date getFechNaci() {
        return fechNaci;
    }

    public void setFechNaci(Date fechNaci) {
        this.fechNaci = fechNaci;
    }
    
}
