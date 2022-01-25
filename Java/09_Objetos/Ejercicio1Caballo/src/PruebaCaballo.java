import paquetes.Caballo;

public class PruebaCaballo {
    public static void main(String[] args) throws Exception {
        
        Caballo miPrimerCaballo = new Caballo("Juan", "Maria", "John", 9);

        Caballo miSegundoCaballo = new Caballo("Marta", "Juana", "Carlos", 9);

        System.out.println(miPrimerCaballo);
        System.out.println(miSegundoCaballo);

        Caballo hijo = miSegundoCaballo.tenerHijos(miPrimerCaballo, "Marcos");

        System.out.println(hijo);
    }
}
