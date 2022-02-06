public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate();
        System.out.println ("Индекс массы тела составляет: " + bmi);
    }
}
