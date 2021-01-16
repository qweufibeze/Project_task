package Task_04;

//Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
//Текст и слово вводится вручную.

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.println("Введите искомое слово: ");
        String word = scanner.nextLine();
        System.out.println("Количество слов в тексте - " + searchWord(text,word));
    }

    // Подсчет количества упортребления слова в тексте
    public static int searchWord(String text, String word){
        text = text.toLowerCase();
        word = word.toLowerCase();
        int i = text.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = text.indexOf(word, i + 1);
        }
        return count;
    }
}
