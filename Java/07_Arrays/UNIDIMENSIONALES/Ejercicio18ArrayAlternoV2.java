public class Ejercicio18ArrayAlternoV2 {
  public static void main(String[] args) {
    
    int [] numeros = new int[10];
    int [] resultado = new int[10];

    int posMen = 0;
    int posMay = 0;

    for (int i = 0; i < 10; i++) numeros[i] = (int) (Math.random() * 201);
    

    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();

    for (int i = 0; i < 10; i++) {

      while (posMen < 10 && numeros[posMen] > 100) posMen++;

      while (posMay < 10 && numeros[posMay] <= 100) posMay++;

      if (i % 2 == 0) {

        if (posMen < 10) resultado[i] = numeros[posMen++];
        else resultado[i] = numeros[posMay++];

      }else{

        if (posMay < 10) resultado[i] = numeros[posMay++];
        else resultado[i] = numeros[posMen++];

      }
    }

    for (int numero: resultado) System.out.print(numero + " ");
  }
}
