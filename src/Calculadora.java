import java.util.Scanner;

public class Calculadora {
    public static void main(String[] michelangelo) {

            Scanner scanner  = new Scanner(System.in);
            int number1 = 0;
            int number2 = 0;
            char operation ='n' ;
            //11:40

            System.out.println("\tCalculator with switch pattern statement ");
            System.out.println("Enter two numbers ");
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();

            System.out.println("Choose the operation you want to do " +
                    " \n+ Addition\n- Subtraction\n* multiplication \n/ division");
            operation = scanner.next().charAt(0);

            switch(operation){
                case '+' -> System.out.println(number1+" + "+number2+" = "+(number1+number2));
                case '-' -> System.out.println(number1+" - "+number2+" = "+(number1-number2));
                case '*' -> System.out.println(number1+" * "+number2+" = "+(number1*number2));
                case '/' -> System.out.println(number1+" / "+number2+" = "+(number1/number2));
                default -> System.out.println("Simbolo  invalido e incorrecto ");
            }
        }


    }

