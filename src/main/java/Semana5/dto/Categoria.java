package Semana5.dto;

public class Categoria {
    private int codiCate;
    private String nombCate;
    private Categoria sig;
    private Categoria ant;

    public Categoria() {
    }

    public Categoria(int codiCate, String nombCate, Categoria sig, Categoria ant) {
        this.codiCate = codiCate;
        this.nombCate = nombCate;
        this.sig = sig;
        this.ant = ant;
    }

    public Categoria getAnt() {
        return ant;
    }

    public void setAnt(Categoria ant) {
        this.ant = ant;
    }

    public int getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(int codiCate) {
        this.codiCate = codiCate;
    }

    public String getNombCate() {
        return nombCate;
    }

    public void setNombCate(String nombCate) {
        this.nombCate = nombCate;
    }

    public Categoria getSig() {
        return sig;
    }

    public void setSig(Categoria sig) {
        this.sig = sig;
    }
    
    
}
