import paquetes.FichaDomino;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
        */
        
        FichaDomino[] fichas = new FichaDomino[8];

        fichas[0] = new FichaDomino();

        for (int i = 1; i < 8; i++) {
            FichaDomino aux;
            do {
                aux = new FichaDomino();
            } while (!fichas [i - 1].encajaBien(aux));
            fichas[i] = aux;
        }

        for (int i = 0; i < 8; i++){
            System.out.println(fichas[i]);
        }
    }
}
