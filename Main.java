import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Дарова!!! Смайлик нужен?) \n");
        System.out.print(" 1. Улыбка \n 2. Грусть \n 3. Слёзы \n 4. Смущение \n 5. Гнев \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите нужную рекцию:");
        int num = in.nextInt();
        in.close();
        switch(num){

            case 1:
                System.out.println("(＾◡＾)");
                break;
            case 2:
                System.out.println("(ಥ﹏ಥ)");
                break;
            case 3:
                System.out.println("(╥﹏╥)");
                break;
            case 4:
                System.out.println("(⁄ ⁄•⁄ω⁄•⁄ ⁄)");
                break;
            case 5:
                System.out.println("(◣_◢)");
                break;

            default:
                System.out.println("Вот те на! Такого смайлика у меня нет(((");
        }


    }
}