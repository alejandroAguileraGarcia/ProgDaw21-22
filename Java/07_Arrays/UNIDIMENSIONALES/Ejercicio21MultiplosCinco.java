public class Ejercicio21MultiplosCinco {
  public static void main(String[] args) {
    
    int [] numeros = new int[15];

    for (int i = 0; i < numeros.length; i++) numeros[i] = (int) (Math.random() * 501);
    
    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();

    for (int i = 0; i < numeros.length; i++) while (numeros[i] % 5 != 0) numeros[i]++;

    for (int numero: numeros) System.out.print(numero + " ");
    
  }
}
