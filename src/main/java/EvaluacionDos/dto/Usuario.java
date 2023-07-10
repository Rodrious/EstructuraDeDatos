package EvaluacionDos.dto;

public class Usuario {
    private int codiUsua;
    private String usuaUsua;
    private String clavUsua;

    public Usuario() {
    }

    public Usuario(int codiUsua, String usuaUsua, String clavUsua) {
        this.codiUsua = codiUsua;
        this.usuaUsua = usuaUsua;
        this.clavUsua = clavUsua;
    }

    public int getCodiUsua() {
        return codiUsua;
    }

    public void setCodiUsua(int codiUsua) {
        this.codiUsua = codiUsua;
    }

    public String getUsuaUsua() {
        return usuaUsua;
    }

    public void setUsuaUsua(String usuaUsua) {
        this.usuaUsua = usuaUsua;
    }

    public String getClavUsua() {
        return clavUsua;
    }

    public void setClavUsua(String clavUsua) {
        this.clavUsua = clavUsua;
    }
    
}
