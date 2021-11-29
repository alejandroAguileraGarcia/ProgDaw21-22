import java.util.Scanner;

public class Ejercicio04DiaSemana {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int dia;
    int diaSemana;
    String diaSem;

    int mes;
    int coeficienteMes;

    int anio;
    int coeficientSiglo;
    int coeficienteAnio;
    int coeficienteBisiesto;

    System.out.print("Introduzca una fecha (dd mm aaaa): ");
    dia = s.nextInt();
    mes = s.nextInt();
    anio = s.nextInt();

    s.close();

    switch (anio / 100) {
      case 17:
        coeficientSiglo = 5;
        break;
      case 18:
        coeficientSiglo = 3;
        break;
      case 19:
        coeficientSiglo = 1;
        break;
      case 20:
        coeficientSiglo = 0;
        break;
      case 21:
        coeficientSiglo = -2;
        break;
      case 22:
        coeficientSiglo = -4;
        break;
      default:
        coeficientSiglo = 0;
        break;
    }

    coeficienteAnio = anio % 100 * 5 / 4;

    coeficienteBisiesto = ((anio % 4 == 0 && anio % 100 != 0 && (mes == 1 || mes == 2)) || (anio % 400 == 0 && (mes == 1 || mes == 2))) ? -1 : 0;

    switch (mes) {
      case 1:
      case 10:
        coeficienteMes = 6;
        break;
      case 2:
      case 3:
      case 11:
        coeficienteMes = 2;
        break;
      case 4:
      case 7:
        coeficienteMes = 5;
        break;
      case 5:
        coeficienteMes = 0;
        break;
      case 6:
        coeficienteMes = 3;
        break;
      case 8:
        coeficienteMes = 1;
        break;
      case 9:
      case 12:
        coeficienteMes = 4;
        break;
      default:
        coeficienteMes = 0;
        break;
    }

    diaSemana = (dia + coeficienteMes + coeficienteAnio + coeficienteBisiesto + coeficientSiglo) % 7;

    switch (diaSemana) {
      case 0:
        diaSem = "Domingo";
        break;
      case 1:
        diaSem = "Lunes";
        break;
      case 2:
        diaSem = "Martes";
        break;
      case 3:
        diaSem = "Miercoles";
        break;
      case 4:
        diaSem = "Jueves";
        break;
      case 5:
        diaSem = "Viernes";
        break;
      case 6:
        diaSem = "Sabado";
        break;
      case 7:
        diaSem = "Domingo";
        break;
      default:
        diaSem = "";
        break;
    }

    System.out.println(diaSem);
  }
}
