import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        discriminant();
        parite();
        max();
        egaliteStr();
        factorielle();
        countdown();
        carres();
        tableMultiplication();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Quelle est la valeur de a ?");
        System.out.println("Quelle est la valeur de b ?");
        System.out.println("Quelle est la valeur de c ?");
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        System.out.println("Ce polynome n’a pas de racine reelle");
            if(delta< 0)
        Scanner scanner = new Scanner(System.in);
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Ce chifre est pair" + a);
        } else {
            System.out.println("CE chiffre est impair" + a);
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Le maximum est" + b);
            System.out.println("Le minimum est" + a);
        } else {
            System.out.println("Le maximum est" + a);
            System.out.println("Le minimum est" + b);
        }
    }
    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        String chaine1 = scanner.nextString();
        String chaine2 = scanner.nextString();
        boolean test = chaine1.equals(chaine2);
    }
    public static void factorielle() {
        System.out.println("Saisir un entier positif ou nul");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int facto = 1;
        for (int i = 0; i <= n; i++) {
            facto *= i;
        }
        System.out.println(n + "! = " + facto);
    }
    public static void countdown(){
            int i = 0;
            int nb1 = 0;
            int nb = 10;
            while (nb1<nb){
                1+ == nb1
                i++;
            }
            System.out.println("BOOM!");
    }
    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + a*a);
    }

    public static void tableMultiplication(){

    }
}
