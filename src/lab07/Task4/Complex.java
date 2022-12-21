package lab07.Task4;

public class Complex {
    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    private double re;
    private double im;

    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return re + (im >= 0 ? (" + " + im) : (" - " + im)) +  "i";
    }
}
