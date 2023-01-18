
public class PresenterRational {

    View view;

    public PresenterRational(View v) {

        view = v;
    }

    public void buttonClick(View v) {
        System.out.println("Введите первую дробь.");
        Rational f = new Rational(0, 0);
        f.setNumer(v.getValue("Числитель: "));
        f.setDenom(v.getValue("Знаменатель: "));
        System.out.println("Введите вторую дробь.");
        Rational f2 = new Rational(0, 0);
        f2.setNumer(v.getValue("Числитель: "));
        f2.setDenom(v.getValue("Знаменатель: "));
        int action = v.action();

        if (action == 1) {
            System.out.println(f.sum(f2));
        } else if (action == 2) {
            System.out.print(f.sub(f2));
        } else if (action == 3) {
            System.out.print(f.mult(f2));
        } else if (action == 4) {
            System.out.print(f.div(f2));

        }

    }
}