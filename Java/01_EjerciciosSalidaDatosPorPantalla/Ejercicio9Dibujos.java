public class Ejercicio9Dibujos {
    public static void main(String[] args) {

        String b,n;
        n="\033[30m██";
        b="\033[37m██";

        System.out.println(n+n+b+n+n+n+n+n+b+n+n);
        System.out.println(n+n+n+b+n+n+n+b+n+n+n);
        System.out.println(n+n+b+b+b+b+b+b+b+n+n);
        System.out.println(n+b+b+n+b+b+b+n+b+b+n);
        System.out.println(b+b+b+b+b+b+b+b+b+b+b);
        System.out.println(b+n+b+b+b+b+b+b+b+n+b);
        System.out.println(b+n+b+n+n+n+n+n+b+n+b);
        System.out.println(n+n+n+b+b+n+b+b+n+n+n);
        System.out.println("\033[37m");
    }
}
