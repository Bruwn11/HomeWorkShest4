public class Task2 {
    public static void main(String[] args) {
        /* В данной задаче для того, чтобы не потерять в точности, считаем в типе данных double,
        а представляем результат в типе данных int - в целых полных рублях.*/
        String name1 = "Таня";
        String name2 = "Андрей";
        String name3 = "Мария";
        int percent = 15;
        int coefficientPercent = 100 + percent;
        int salary1 = 66_660;
        int salary2 = 77_770;
        int salary3 = 88_880;
        double salaryIndex1 = ((double) (salary1 * coefficientPercent) / 100);
        double salaryIndex2 = ((double) (salary2 * coefficientPercent) / 100);
        double salaryIndex3 = ((double) (salary3 * coefficientPercent) / 100);
        double salaryDifference1 = (salaryIndex1 - salary1) * 12;
        double salaryDifference2 = (salaryIndex2 - salary2) * 12;
        double salaryDifference3 = (salaryIndex3 - salary3) * 12;
        System.out.println(name1 + " теперь получает " + (int) salaryIndex1 + " рублей. Годовой доход вырос на " + (int) salaryDifference1 + " рублей.");
        System.out.println(name2 + " теперь получает " + (int) salaryIndex2 + " рублей. Годовой доход вырос на " + (int) salaryDifference2 + " рублей.");
        System.out.print(name3 + " теперь получает " + (int) salaryIndex3 + " рублей. Годовой доход вырос на " + (int) salaryDifference3 + " рублей.");
    }
}
