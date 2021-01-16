package Task_03;

//Создать программу, которая будет:
//подсчитывать количество слов в предложении
//выводить их в отсортированном виде
//делать первую букву каждого слова заглавной.
//Предложение вводится вручную. (Разделитель пробел (“ ”)).

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Task_03{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String inputSentence = scanner.nextLine();
        System.out.println(getNumWord(inputSentence));
        System.out.println(setUpperCase(inputSentence));
        getSortSentence(inputSentence);
    }

    // Подсчет слов в предложении
    public static int getNumWord(String s){
        int num = 0;
        String[] wordsArr = s.split(" ");
        for(String wood : wordsArr){
            num++;
        }
        return num;
    }

    // Делает первую букву каждого слова заглавной
    public static String setUpperCase(String s){
        String[] arrUpperCaseSentence = s.split(" ");
        for(int i = 0; i < arrUpperCaseSentence.length; i++){
            arrUpperCaseSentence[i] = arrUpperCaseSentence[i].substring(0, 1).toUpperCase() + arrUpperCaseSentence[i].substring(1);
        }
        s = String.join(" ", arrUpperCaseSentence);
        return s;
    }

    // Выводит слова в отсортированном виде
    public static void  getSortSentence (String s){
        String[] getArrSentence = s.split(" ");
        Arrays.sort(getArrSentence);
        for(String word : getArrSentence){
            System.out.println(word);
        }
    }
}
