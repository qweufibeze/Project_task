package Task_01;

//Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным, простым или составным.
//Если пользователь введёт не целое число, то сообщать ему об ошибке.

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task_01 {

    static int var;

    public static void main(String[] args)  {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        //Проверка на введение целого числа
        try {
            var = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Пожалуйста, введите целое число");
            return;
        }

        if(isNumberIsEven(var)){
            System.out.print(var + " - четное,");
        }else{
            System.out.print(var + " - нечетное,");
        }

        if (isNumberIsSimple(var)) {
            System.out.print(" простое число");
        } else {
            System.out.print(" составное число");
        }
    }

    // проверка на четное или нечетное число
    public static boolean isNumberIsEven(Integer var) {
        return var % 2 == 0;
    }

    // проверка на простое или составное число
    public static boolean isNumberIsSimple(Integer var) {
        for(int i = 2; i < var; i++){
            if(var % i == 0){
                return false;
            }
        }
        return true;
    }
}
