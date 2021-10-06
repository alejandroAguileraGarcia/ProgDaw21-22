public class Ejercicio6AreaTriangulo {
    public static void main(String[] args) {
        
        double base, altura, area;

        System.out.println("Introduzca la base del triangulo");
        base=Double.parseDouble(System.console().readLine());

        System.out.println("Introduzca la altura del triangulo");
        altura=Double.parseDouble(System.console().readLine());

        area=base*altura/2;
        
        System.out.printf("%.2f", area);
    }
}