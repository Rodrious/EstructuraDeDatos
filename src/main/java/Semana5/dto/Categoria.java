package Semana5.dto;

public class Categoria {
    private int codiCate;
    private String nombCate;
    private Categoria sig;

    public Categoria() {
    }

    public Categoria(int codiCate, String nombCate, Categoria sig) {
        this.codiCate = codiCate;
        this.nombCate = nombCate;
        this.sig = sig;
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
