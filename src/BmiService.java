public class BmiService {
    public double calculate(double m, double h) {
        double index = m / Math.pow(h, 2);
        return index;
    }
}
