public class BmiService {
    public int calculate(int weight, double height) {
        double result = (int) (weight / (height * height));
        return (int) result;

    }
}
