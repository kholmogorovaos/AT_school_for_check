import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class WordsEquals {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.print("Ввод: ");
            for (int i = 0; i < args.length; i++)
                System.out.print(args[i] + " ");
                System.out.println();
            List<String> uniqueWord = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                String word = args[i];
                if (null == word) {
                    continue;
                }
                for (int j = i + 1; j < args.length; j++) {
                    if (word.equals(args[j])) {
                        args[j] = null;
                    }
                }
            }
               Collections.addAll(uniqueWord, args);
               while (uniqueWord.remove(null)) {}
                System.out.println("Вывод: " + String.join(" ", uniqueWord));
        } else  System.out.println("Запрос пустой, укажите слова");
        System.exit(0);
    }
}
