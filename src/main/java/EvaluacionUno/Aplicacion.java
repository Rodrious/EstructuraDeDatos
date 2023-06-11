package EvaluacionUno;

import javax.swing.JOptionPane;

public class Aplicacion {

    Matricula arrayMatricula[] = new Matricula[50];
    Alumno arrayAlumno[] = new Alumno[50];
    int total;

    public void menu() {
        String menu = "===OPERACIONES===\n";
        menu = menu + "[1] Matricular alumno\n";
        menu = menu + "[2] Ver matriculas\n";
        menu = menu + "[3] Ordenar matriculas\n";
        menu = menu + "[9] Finalizar\n";

        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {

                case 1:
                    matricular();
                    break;
                case 2:
                    mostrarInfo();
                    break;
                case 3:
                    ordenarShell();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Finalizar programa");
            }
        } while (opc != 9);
    }

    public void matricular() {
        int rpt = 0, rpt2 = 0;
        do {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de matricula"));
            boolean encontrado = evitarCodiRepetido(codigo);
            if (!encontrado) {
                do {
                    int codigoEstu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del estudiante"));
                    encontrado = evitarCodiRepetido(codigoEstu);
                    if (!encontrado) {
                        String nombresEstu=JOptionPane.showInputDialog("Ingrese nombre completo del estudiante : ");
                        String carrera=JOptionPane.showInputDialog("Ingrese la carrera del estudiante : ");
                        String ciclo=JOptionPane.showInputDialog("Ingrese el ciclo del estudiante : ");
                        String semestreAcademico=JOptionPane.showInputDialog("Ingrese el semestre academico del estudiante : ");
                        Matricula temp = new Matricula(codigo, codigoEstu, carrera, ciclo, semestreAcademico);
                        Alumno temp1 = new Alumno(codigoEstu, nombresEstu);
                        arrayMatricula[total]=temp;
                        arrayAlumno[total]=temp1;
                        total++;
                        rpt2=2;
                    } else {
                        JOptionPane.showMessageDialog(null, "El codigo ingresado ya esta registrado.");
                        rpt2 = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar?\n [1] Si \n [2] No"));
                    }
                } while (rpt2 != 2);
                rpt = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar?\n [1] Si \n [2] No"));
            } else {
                JOptionPane.showMessageDialog(null, "El codigo ingresado ya esta registrado.");
                rpt = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar?\n [1] Si \n [2] No"));
            }
        } while (rpt != 2);

    }
    
    public void mostrarInfo(){
        String info="";
        for (int i = 0; i < total; i++) {
            info = info +"Matricula : "+(i+1)+"\n";
            info = info +"Codigo : "+arrayMatricula[i].getCodigo()+"\n";
            info = info +"Codigo Estudiante : "+arrayMatricula[i].getCodigoEstudiante()+"\n";
            info = info +"Carrera : "+arrayMatricula[i].getCarrera()+"\n";
            info = info +"Ciclo : "+arrayMatricula[i].getCiclo()+"\n";
            info = info +"Semestre: "+arrayMatricula[i].getSemestreAcademico()+"\n";
            info = info +"Nombre Estudiante : "+arrayAlumno[i].getNombreEstudiante()+"\n\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }
    
    public void ordenarShell(){
        int h=total/2;
        int i;
        while(h>0){
            for ( i = h-1; i < total; i++) {
                Matricula B = arrayMatricula[i];
                Alumno D =  arrayAlumno[i];
                int j=i;
                for ( j = i; (j>=h) && (arrayMatricula[j-h].getCodigo()>B.getCodigo()); j-=h) {
                    arrayMatricula[j]=arrayMatricula[j-h];
                    arrayAlumno[j]=arrayAlumno[j-h];
                }
                arrayMatricula[j]=B;
                arrayAlumno[j]=D;
            }
            h=h/2;
        }
    }

    public boolean evitarCodiRepetido(int codigo) {
        for (int i = 0; i < total; i++) {
            if (arrayMatricula[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Aplicacion obj = new Aplicacion();
        obj.menu();
    }
}
