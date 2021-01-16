package Task_05;

//Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы (зеркальное значение равно оригинальному).
//Длина последовательности N вводится вручную и не должна превышать 100.


import java.util.LinkedList;
import java.util.Scanner;

public class Task_05 {

     static int[] arrPalindromeNum = new int[0];

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное число последовательности: ");
        int maxNum = scanner.nextInt();
        if(maxNum > 100) throw new Exception("Пожалуйста, введите число от 0 до 100");
        System.out.println("Числа палиндромы - " + searchPalindrome(maxNum));
    }

    //Нахождение палиндромов
    public static LinkedList searchPalindrome(int numberMax){
        LinkedList<Integer> numPalindrome = new LinkedList<>();
        int countArr = 0;
        for(int i = 0; i <= numberMax; i++){
            if(i == reverseNum(i)){
                numPalindrome.add(i);
            }
        }
        return numPalindrome;
    }

    //Нахождение реверсивного числа для последующего сравнивания
    public static int reverseNum(int num){
        int reverseNumber = 0;
        if(num < 10){
            return num;
        }else{
            for(int i = num; i != 0; i /= 10){
                reverseNumber = reverseNumber * 10 + i % 10;
            }
            return reverseNumber;
        }
    }

}
