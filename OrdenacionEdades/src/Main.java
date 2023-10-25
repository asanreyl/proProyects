import java.util.Scanner;

public class OrdenacionEdades {
    public static void main(String[] args) {

        int a1, a2, a3;
        String n1, n2, n3;
        int e1, e2, e3;

        String maxName, mediumName, minName;
        int maxAge, mediunAge, minAge;

        int actualYear = 2024;


        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("ORDENACIÓN DE EDADES");

        System.out.println("Por favor, dame nombre 1: ");
        n1 = sc.nextLine();
        System.out.println("Por favor, dame nombre 2: ");
        n2 = sc.nextLine();
        System.out.println("Por favor, dame nombre 3: ");
        n3 = sc.nextLine();

        System.out.println("Ahora años de nacimiento. ");
        System.out.println("Por favor, el año de nacimiento de: " + n1);
        a1 = sc.nextInt();
        System.out.println("Por favor, el año de nacimiento de: " + n2);
        a2 = sc.nextInt();
        System.out.println("Por favor, el año de nacimiento de: " + n3);
        a3 = sc.nextInt();

        // Calculamos las edades:
        e1 = actualYear-a1;
        e2 = actualYear-a2;
        e3 = actualYear-a3;

        // Ordenación de Mayor a menor
        if (e1>=e2) {
            maxAge = e1;
            maxName = n1;

            if (e2>=e3){
                mediunAge = e2;
                mediumName = n2;

                minName = n3;
                minAge  = e3;
            }
            else {
                mediunAge = e3;
                mediumName = n3;

                minName = n2;
                minAge  = e2;
            }

        }
        else {
            maxAge = e2;
            maxName = n2;

            if (e1>=e3){
                mediunAge = e1;
                mediumName = n1;

                minName = n3;
                minAge  = e3;
            }
            else {
                mediunAge = e3;
                mediumName = n3;

                minName = n1;
                minAge  = e1;
            }
        }

        System.out.println(maxName + " con " + maxAge + "años");
        System.out.println(mediumName + " con " + mediunAge + "años");
        System.out.println(minName + " con " + minAge + "años");

    }
}