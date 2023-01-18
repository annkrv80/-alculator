public class PresenterComplex {
    View view;

    public PresenterComplex(View v) {

        view = v;
    }

    public void buttonClick(View v) {
        System.out.println("Введите первое число.");
        Complex c = new Complex(0, 0);
        c.setReal(v.getValue("Реальная часть: "));
        c.setImage(v.getValue("Мнимая часть: "));
        System.out.println(c);
        System.out.println("Введите второе число.");
        Complex c2 = new Complex(0, 0);
        c2.setReal(v.getValue("Реальная часть: "));
        c2.setImage(v.getValue("Мнимая часть: "));
        System.out.println(c2);

        int action = v.action();
        if (action == 1) {
            System.out.println(c.sum(c2));
        } else if (action == 2) {
            System.out.print(c.sub(c2));
        } else if (action == 3) {
            System.out.print(c.mult(c2));
        } else if (action == 4) {
            System.out.print(c.div(c2));

        }

    }
}

