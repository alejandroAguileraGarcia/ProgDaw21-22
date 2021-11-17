package UNIDIMENSIONALES;
public class Ejercicio10ParImparUnArray {
  public static void main(String[] args) {
    
    int[] numeros = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];
    int cantPares = 0;
    int cantImpares = 1;

    for (int i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 101);
      System.out.print(numeros[i] + " ");

      if (numeros[i] % 2 == 0){
        pares[cantPares] = numeros[i];
        cantPares++;
      }else{
        impares[20 - cantImpares] = numeros[i];
        cantImpares++;
      }
    }

    System.out.println();

    for (int i = 0; i < cantPares; i++) numeros[i] = pares[i];
    for (int i = 19; i > 20 - cantImpares; i--) numeros[i] = impares[i];

    for (int x: numeros) System.out.print(x + " ");

  }
}