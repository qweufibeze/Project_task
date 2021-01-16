package Task_02;

//Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
//Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_02{

    static int var1;
    static int var2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите два целых числа через пробел: ");

        //Проверка на введение целого числа
        try {
            var1 = scanner.nextInt();
            var2 = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ошибка: Пожалуйста, введите целое число");
            return;
        }
        System.out.println("НОК чисел - " + findLCM(var1, var2));
        System.out.println("НОД чисел - " + findGCM(var1, var2));
    }


    //нахождение НОК
    static int findLCM(int var1, int var2){
        int numLCM = Math.max(var1, var2);
        while(true) {
            if (numLCM % var1 == 0 && numLCM % var2 == 0) {
                break;
            }else{
                numLCM +=1;
            }
        }
        return numLCM;
    }


    //нахождение НОД
    static int findGCM(int var1, int var2){
        int maxNum = Math.max(var1, var2);
        int numGCM = 0;
        for(int i = 1; i < maxNum; i++){
            if(var1 % i == 0 && var2 % i ==0){
                numGCM = i;
            }
        }
        return numGCM;
    }

}
