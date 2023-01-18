public class Complex {
    private int real;
    private int image;

    Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        String string = "";
        if (image > 0) {
            string = real + "+" + image + "" + "i";
        }
        if (image < 0) {
            string = real + "" + image + "" + "i";
        }
        return string;
    }

    public Complex sum(Complex c2) {
        Complex result = new Complex(this.real + c2.real, this.image + c2.image);
        System.out.print("Сумма: ");
        return result;
    }

    public Complex sub(Complex c2) {
        Complex result = new Complex(this.real - c2.real, this.image - c2.image);
        System.out.print("Разность: ");
        return result;
    }

    public Complex mult(Complex c2) {
        Complex result = new Complex(this.real * c2.real - this.image * c2.image,
                this.image * c2.real + this.real * c2.image);
        System.out.print("Произведение: ");
        return result;
    }

    public Complex div(Complex c2) {
        Complex result = new Complex(
                (this.real * c2.real + this.image * this.image) / (c2.real * c2.real + c2.image * c2.image),
                (this.image * c2.real - this.real * c2.image) / (c2.real * c2.real + c2.image * c2.image));
        System.out.print("Частное: ");
        return result;
    }

}