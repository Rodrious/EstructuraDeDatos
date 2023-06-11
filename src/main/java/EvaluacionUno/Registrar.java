package EvaluacionUno;

import javax.swing.JOptionPane;

public class Registrar {

    EvaluacionPrimerModulo arrayClientes[] = new EvaluacionPrimerModulo[50];
    int totalClientes = 0;

    public void menu() {
        String menu = "===OPERACIONES===\n";
        menu = menu + "[1] Insertar clientes\n";
        menu = menu + "[2] Mostrar clientes\n";
        menu = menu + "[3] Ordenar clientes\n";
        menu = menu + "[9] Finalizar\n";

        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {

                case 1:
                    insertarClientes();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    ordenarInsercion();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Finalizar programa");
            }
        } while (opc != 9);

    }

    public void insertarClientes() {
        int rpt = 0;
        do {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del cliente:"));
            boolean encontrado = evitarCodiRepetido(codigo);
            if (!encontrado) {
                String apellidoPat = JOptionPane.showInputDialog("Ingrese el apellido paterno");
                String apellidoMat = JOptionPane.showInputDialog("Ingrese el apellido materno");
                String nombres = JOptionPane.showInputDialog("Ingrese sus nombres");
                String ciudad = JOptionPane.showInputDialog("Ingrese sus ciudad");
                EvaluacionPrimerModulo temp = new EvaluacionPrimerModulo(codigo, apellidoPat, apellidoMat, nombres, ciudad);
                arrayClientes[totalClientes] = temp;
                totalClientes++;
                rpt = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar?\n [1] Si \n [2] No"));
            } else {
                JOptionPane.showMessageDialog(null, "El codigo ingresado ya esta registrado.");
                rpt = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar?\n [1] Si \n [2] No"));
            }
        } while (rpt != 2);

    }
    
    public void mostrarClientes(){
        String clientes = "==========LISTA DE CLIENTES\"==========\n";
        for (int i = 0; i < totalClientes; i++) {
            clientes = clientes + arrayClientes[i].getCodigo()+" - "+arrayClientes[i].getApellidoPaterno()+" - "+arrayClientes[i].getApellidoMaterno()+" - "+arrayClientes[i].getNombres()+"\n";
        }
        JOptionPane.showMessageDialog(null, clientes);
    }
    
    public void ordenarInsercion(){
        EvaluacionPrimerModulo aux;
        int izq, der, medio;
        for (int i = 0; i < totalClientes; i++) {
            aux=arrayClientes[i];
            izq=0;
            der=i-1;
            while(izq<=der){
                medio=(izq+der)/2;
                if (aux.getCodigo()<arrayClientes[medio].getCodigo()) {
                    der=medio-1;
                }else{
                    izq=medio+1;
                }
            }
            for (int j = i-1; j >= izq; j--) {
                arrayClientes[j+1]=arrayClientes[j];
            }
            arrayClientes[izq]=aux;
        }
    }

    public boolean evitarCodiRepetido(int codigo) {
        for (int i = 0; i < totalClientes; i++) {
            if (arrayClientes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Registrar obj = new Registrar();
        obj.menu();
    }
}
