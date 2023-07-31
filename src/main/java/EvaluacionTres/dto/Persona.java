package EvaluacionTres.dto;

public class Persona {
    private long codiPers;
    private String nombPers;
    private String genePers;

    public Persona() {
    }

    public Persona(long codiPers, String nombPers, String genePers) {
        this.codiPers = codiPers;
        this.nombPers = nombPers;
        this.genePers = genePers;
    }

    public long getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(long codiPers) {
        this.codiPers = codiPers;
    }

    public String getNombPers() {
        return nombPers;
    }

    public void setNombPers(String nombPers) {
        this.nombPers = nombPers;
    }

    public String getGenePers() {
        return genePers;
    }

    public void setGenePers(String genePers) {
        this.genePers = genePers;
    }

    @Override
    public String toString() {
        return "Persona{" + "codiPers=" + codiPers + ", nombPers=" + nombPers + ", genePers=" + genePers + '}';
    }
    
}
