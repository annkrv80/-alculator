public class Rational {
    private int numer;
    private int denom;

    public Rational(int n, int d) {
        this.numer = n;
        this.denom = d;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        if (denom == 0) {
            throw new ArithmeticException("Знаменатель не может быть равен нулю");
        }
        this.denom = denom;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    @Override
    public String toString() {
        return this.numer + "/" + this.denom;
    }

    public Rational sum(Rational f2) {
        Rational result = new Rational((this.numer * f2.denom + f2.numer * this.denom), (this.denom * f2.denom));
        System.out.print("Сумма: ");
        return result;
    }

    public Rational mult(Rational f2) {
        Rational result = new Rational(this.numer * f2.numer, this.denom * f2.denom);
        System.out.print("Произведение: ");
        return result;
    }

    public Rational div(Rational f2) {
        if (f2.numer == 0) {
            throw new ArithmeticException("Делитель равен 0..");
        }
        Rational result = new Rational(this.numer * f2.denom, this.denom * f2.numer);
        System.out.print("Частное: ");
        return result;
    }

    public Rational sub(Rational f2) {
        Rational result = new Rational(((this.numer * f2.denom) - (this.denom * f2.numer)), (this.denom * f2.denom));
        System.out.print("Разность: ");
        return result;
    }

    

}


    

