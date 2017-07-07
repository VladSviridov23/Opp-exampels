package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Ключи
        int proKey = 123;
        int expKey = 321;
        int inputKey = -1;

        // BufferedReader для чтения с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input key: ");
        inputKey = Integer.parseInt(br.readLine());

        if (inputKey == proKey) {
            System.out.println("Pro access");
            // Заносим ссылку экземпляра ProDocumentWorker в documentPro приведенного к базовому классу DocumentWorker
            DocumentWorker documentPro = new ProDocumentWorker();
            documentPro.saveDocument();
        } else if (inputKey == expKey) {
            DocumentWorker documentExpert = new ExpertDocumentWorker();
            System.out.println("Exp access");
            documentExpert.saveDocument();
        } else {
            DocumentWorker document = new DocumentWorker();
            System.out.println("Free version");
        }
    }
}
