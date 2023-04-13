public class Main {
    public static void main(String[] args) {
        System.out.println("Switch Pattern");

        int num = 3;
        String result = switch (num) {
            case 1 -> "Uno";
            case 2 -> "Dos";
            case 3, 4 -> "Tres o cuatro";
            default -> "Otro";
        };
        System.out.println(result); // Imprime "Tres o cuatro"


    }
}