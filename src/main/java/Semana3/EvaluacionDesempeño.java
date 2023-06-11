package Semana3;

import javax.swing.JOptionPane;

public class EvaluacionDesempeño {

    private int codigo;
    private String apellidos;
    private String nombres;
    private String ciudad;
    EvaluacionDesempeño arrayClientes[] = new EvaluacionDesempeño[50];
    int total = 0;

    public EvaluacionDesempeño() {
    }

    public EvaluacionDesempeño(int codigo, String apellidos, String nombres, String ciudad) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void registrarCliente() {
        int rpt = 0;
        do {
            int codi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo : "));
            boolean evitar = evitarCodigoRepetido(codi);
            if (evitar) {
                JOptionPane.showMessageDialog(null, "El codigo ya esta registrado.");
                rpt = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar? \n Si = 1 \n No = 0"));
            } else {
                String apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos : ");
                String nombres = JOptionPane.showInputDialog("Ingrese sus nombres : ");
                String ciudad = JOptionPane.showInputDialog("Ingrese su ciudad : ");
                EvaluacionDesempeño temp = new EvaluacionDesempeño(codi, apellidos, nombres, ciudad);
                arrayClientes[total] = temp;
                total++;
                rpt = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar? \n Si = 1 \n No = 0"));
            }
        } while (rpt != 0);

    }

    public boolean evitarCodigoRepetido(int codigo) {
        for (int i = 0; i < total; i++) {
            if (arrayClientes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public void mostrarClientes() {
        String clientes = "";
        for (int i = 0; i < total; i++) {
            clientes = clientes + arrayClientes[i].getCodigo() + " - " + arrayClientes[i].getApellidos() + " - " + arrayClientes[i].getNombres() + " - " + arrayClientes[i].getCiudad() + "\n";
        }
        JOptionPane.showMessageDialog(null, clientes);
    }

    public void sort() {
        EvaluacionDesempeño aux = new EvaluacionDesempeño();
        int imin;
        for (int i = 0; i < total; i++) {
            imin = i;
            for (int j = i + 1; j < total; j++) {
                if (arrayClientes[j].getCodigo() < arrayClientes[imin].getCodigo()) {
                    imin = j;
                }
            }
            aux = arrayClientes[i];
            arrayClientes[i] = arrayClientes[imin];
            arrayClientes[imin] = aux;
        }

    }

    public void ordenarClientes() {

    }

    public void menu() {
        String menu = "------OPERACIONES------\n"
                + "1 . Insertar Clientes\n"
                + "2 . Mostrar Cliente\n"
                + "3 . Ordenar Clientes\n"
                + "9 . Finalizar";
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    sort();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
            }
        } while (opc != 9);

    }

    public static void main(String[] args) {
        EvaluacionDesempeño obj = new EvaluacionDesempeño();
        obj.menu();
    }

}
