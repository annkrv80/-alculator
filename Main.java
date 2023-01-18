import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1 для рациональных чисел или 2 для комплекстныч чисел");
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        if (start == 1) {
            PresenterRational r = new PresenterRational(new View());
            r.buttonClick(new View());
        } else if (start == 2) {
            PresenterComplex c = new PresenterComplex(new View());
            c.buttonClick(new View());
        } else {
            System.out.println("Ошибка введите 1 или 2");
        }
        in.close();
    }
}