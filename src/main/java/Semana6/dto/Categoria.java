package Semana6.dto;

public class Categoria implements Comparable {

    private String codiCate;
    private String nombCate;

    public Categoria() {
    }

    public Categoria(String codiCate, String nombCate) {
        this.codiCate = codiCate;
        this.nombCate = nombCate;
    }

    public String getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(String codiCate) {
        this.codiCate = codiCate;
    }

    public String getNombCate() {
        return nombCate;
    }

    public void setNombCate(String nombCate) {
        this.nombCate = nombCate;
    }
    
    //Ordenar por codigo
    @Override
    public int compareTo(Object t) {
        String comparecodi = ((Categoria) t).getCodiCate();
        return Integer.parseInt(this.getCodiCate()) - Integer.parseInt(comparecodi);
    }
    
    
    /*
    Ordenar por nombre
    
    @Override
    public int compareTo(Object obj) {
        Categoria otraCategoria = (Categoria) obj;
        return this.nombCate.compareTo(otraCategoria.getNombCate());
    }
    
    */
    @Override
    public String toString() {
        return "Categoria{" + "codiCate=" + codiCate + ", nombCate=" + nombCate + '}';
    }

}
