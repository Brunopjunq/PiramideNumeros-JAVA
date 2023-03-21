import java.util.Scanner;

public class PiramideNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        final int number = sc.nextInt();
        sc.close();
        System.out.println("Pirâmide de Numeros");
        for(int i = 1; i<=number; i++) {
            StringBuilder bld = new StringBuilder();
            for (int j = 1; j<=i; j++) {
                bld.append(i);
            }
            String str = bld.toString();
            System.out.println(str);
        }

    }
}
