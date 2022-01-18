package paquetes;

public class Conversor {
  
  public static int BinarioADecimal (int numeroBinario) {
    int numeroDecimal = 0;
    int longitud = paquetes.Ejercicios01_14.digitos(numeroBinario);

    for (int i = 0; i < longitud; i++) {
      if (numeroBinario % 10 == 1) numeroDecimal += paquetes.Ejercicios01_14.potencia(2, i);
      
      numeroBinario /= 10;
    }

    return(numeroDecimal);

  }

  public static String DecimalABinario (int numeroDecimal) {

    String numeroBinario = "";

    while (numeroDecimal > 0) {

      numeroBinario = numeroDecimal % 2 + numeroBinario;

      numeroDecimal /= 2;  
    }

    return numeroBinario;
  }
  
}
