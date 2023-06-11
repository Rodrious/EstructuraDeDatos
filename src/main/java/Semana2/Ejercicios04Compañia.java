package Semana2;

public class Ejercicios04Compañia {
    public static void main(String[] args) {
        Ejercicios04Secretario secre1 = new Ejercicios04Secretario("Rafael", "Montalvan", "73971289", "Av Lukakuj 12", "89521436", 1200, "Despacho N°20", 154896);
        secre1.incremnetarSalario(0.05);
        System.out.println(secre1.toString()+"");
        
        Ejercicios04Vendedor ven1 =  new Ejercicios04Vendedor("Juan", "Medrano", "89410253", "Lumbar 43", "89451236", 1500, "ABJ-841", "VolskWaven", "2021", "896417852", "Plaza", 0.10);
        ven1.incremnetarSalario(0.10);
        System.out.println(ven1.toString()+"");
        
        Ejercicios04Vendedor ven2 =  new Ejercicios04Vendedor("Elias", "Kolpous", "96481214", "Lumbar 46", "89485236", 1500, "ART-102", "VolskWaven", "2026", "896857852", "Hotel", 0.10);
        ven2.incremnetarSalario(0.10);
        System.out.println(ven2.toString()+"");
        
        Ejercicios04JefeDeZona jefe1 =  new Ejercicios04JefeDeZona("Despacho N°73", "OPQ-548", "Tesla", "2028", "Mark", "Xacherber", "80214694", "Av. Kolpar 23", "8451247", 2500);
        jefe1.incremnetarSalario(0.20);
        jefe1.getVendedor(ven1);
        jefe1.getSecretario(secre1);
        System.out.println(jefe1.toString()+"");
    }
}
 