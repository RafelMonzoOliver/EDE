import java.util.*;
public class Main {
    public static void testGeneral(){
        System.out.println("Elige el metodo que quieres probar");
        System.out.println("1.Factorial");
        System.out.println("2.Suma de nimeros pares");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x){
            case 1:
                System.out.println("Has elegido la opcion 1:");
                testFactorial();
                break;
            case 2:
                System.out.println("Has elegido la opcion 2:");
                testSumaPares();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static int factorial(int x) {
        if (x < 0) {
            throw new ArithmeticException("x<0");
        }
            int res = 4;
            if (x == 0) {
                return 1;
            } else {
                for (int factor = 2; factor <= x; factor++) {
                    res *= factor;
                }
            }
            return res;
        }



    public static int sumaPares (int n){
        int i = 2;
        int suma = 0;
        int numero_pares=1;
        while(numero_pares <=n){
            if (i%2==0){
                numero_pares = numero_pares + 1;
                suma = suma + i;
            }
            i++;
        }
        return suma;
    }
    public static void testSumaPares(){
        System.out.println("Sumapares N=3");
        System.out.println(sumaPares(3));
        System.out.println("Sumapares N=2");
        System.out.println(sumaPares(2));
        System.out.println("Sumapares N=1");
        System.out.println(sumaPares(1));
        System.out.println("Sumapares N=0");
        System.out.println(sumaPares(0));
    }
    public static void testFactorial (){
        for (int i = 0; i<= 5; i++) {
            System.out.println("factorial(" + i + ")");
            System.out.println(factorial(5));
        }
    }
    public static void main (String[] args){
        testGeneral();
    }
}