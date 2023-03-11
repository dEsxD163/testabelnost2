public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double rost = 1.78; // мой рост =)
        double ves = 66; // мой вес =)
        int bmiIndex = service.calculate(ves, rost);
        System.out.println(bmiIndex);
    }
}