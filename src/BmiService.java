public class BmiService {
    public int calculate(int growth, int bodyMass) {
        int bmi = bodyMass * 10000 / (growth * growth); // 10 000 используется для перевода роста в метры
        return bmi;
    }
}
