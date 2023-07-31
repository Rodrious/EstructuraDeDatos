package EvaluacionTres.dao;

import EvaluacionTres.dto.Persona;
import java.util.Stack;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PersonaDAO {

    Stack<Persona> pilaPersona = new Stack();

    public void agregar(Persona per) {
        pilaPersona.add(per);
    }

    public String listar() {
        String lista = "\t\tLISTA DE PERSONAS\n";
        for (Persona persona : pilaPersona) {
            lista += persona + "\n";
        }
        return lista;
    }

    public void ordenarPorGenero() {
        Stack<Persona> pilaTemporal = new Stack<>();
        Stack<Persona> pilaNoBinario = new Stack<>();
        Stack<Persona> pilaFemenino = new Stack<>();
        Stack<Persona> pilaMasculino = new Stack<>();

        while (!pilaPersona.isEmpty()) {
            Persona persona = pilaPersona.pop();
            String genero = persona.getGenePers();

            if (genero.equalsIgnoreCase("NO BINARIO")) {
                pilaNoBinario.push(persona);
            } else if (genero.equalsIgnoreCase("FEMENINO")) {
                pilaFemenino.push(persona);
            } else if (genero.equalsIgnoreCase("MASCULINO")) {
                pilaMasculino.push(persona);
            }
        }

        while (!pilaNoBinario.isEmpty()) {
            pilaTemporal.push(pilaNoBinario.pop());
        }

        while (!pilaFemenino.isEmpty()) {
            pilaTemporal.push(pilaFemenino.pop());
        }

        while (!pilaMasculino.isEmpty()) {
            pilaTemporal.push(pilaMasculino.pop());
        }

        pilaPersona = pilaTemporal;
    }

    public void generarReportePDF(String nombreArchivo) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));

            document.open();

            document.add(new Paragraph("Reporte de personas ordenadas por género:"));
            int index = 1;
            for (Persona persona : pilaPersona) {
                document.add(new Paragraph("      " + index + ". " + persona.toString()));
                index++;
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);;
        } finally {
            document.close();
        }
    }

}
