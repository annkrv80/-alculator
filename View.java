
import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String titel) {
        System.out.printf("%s", titel);
        return in.nextInt();
    }

    public int action() {
        System.out.println("Выбирите действие. 1-сложение, 2-вычитание, 3- умножение, 4- деление");
        int action = in.nextInt();
        try {
            if (action == 1 & action == 2 & action == 3 & action == 4) {
                return action;
            } else {
                System.out.println("Введите число от 1 до 4");
            }
        } catch (Exception e) {

        }
        return action;
    }
}