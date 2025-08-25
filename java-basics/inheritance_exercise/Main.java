package inheritance_exercise;

public class Main {
    public static void main(String[] args) {

        Analyst analyst = new Analyst("Jill", 25, 50500);
        System.out.println(String.format("""
                %s
                %d
                %f
                """, analyst.getName(), analyst.getAge(), analyst.getSalary()));
        System.out.println(analyst.getAnnualBonus());

        analyst.raiseSalary();
        System.out.println(analyst.getSalary());
    }
}
