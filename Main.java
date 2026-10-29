import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 1. Объявить переменную типа данных String, название которой состоит из нескольких слов
        String myMultiWordVariable;

        // 2. Создать константу “NUM” типа данных int и задать ей любое значение
        final int NUM = 10;

        // 3. Создать переменную “word” типа данных String с любым значением
        String word = "score";

        // 4. Задать значение переменной, объявленной в самом начале, как конкатенацию NUM и word
        myMultiWordVariable = NUM + " " + word;

        // 5. Вывести на экран значение всех переменных в одну строку (вывод на английском)
        System.out.println("NUM = " + NUM + " | word = " + word + " | Result = " + myMultiWordVariable);

        // 6. Условная конструкция для проверки NUM (вывод на английском)
        if (NUM < 0) {
            System.out.println("You saved a negative number");
        } else if (NUM > 0) {
            System.out.println("You saved a positive number");
        } else {
            System.out.println("You saved zero");
        }

        // --- Задания на сообразительность ---

        Scanner scanner = new Scanner(System.in);

        // 7. Сделать так, чтобы программа выводила в консоль строку (на английском)
        System.out.println("Enter your name:");

        // 8. Затем считывала имя пользователя, введенное с клавиатуры
        String userName = scanner.nextLine();

        // 9. И в конце здоровалась с пользователем по имени (на английском)
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}