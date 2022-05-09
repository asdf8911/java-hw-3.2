public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(54, 1.75);
        System.out.printf("%.2f", bmi);
    }
}