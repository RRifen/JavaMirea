package lab07.Task4;

import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable {

    public double findCircumference(double radius) {
        return radius * 2 * PI;
    }

    @Override
    public int pow(int a, int b) {
        int result = 1;
        for(int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    @Override
    public double absComplex(Complex a) {
        return sqrt(a.getRe() * a.getRe() + a.getIm() * a.getIm());
    }
}
