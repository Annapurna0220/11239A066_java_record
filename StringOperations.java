import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Concatenation: " + s1 + s2);
        System.out.println("Length of first string: " + s1.length());
        System.out.println("Are both strings equal? " + s1.equals(s2));
        System.out.println("Substring of first (first 3 chars): " + s1.substring(0, Math.min(3, s1.length())));
        System.out.println("Uppercase: " + s1.toUpperCase());
    }
}
