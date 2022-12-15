public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        //Para identificar que es un dato LONG se debe poner la letra L al final de la asignación
        long nL = 12345678900L;

        double nD = 123.456;
        float nF = 123.456F;

        // pension 3%
        var salary = 1000;//int
        var pension = salary * 0.03; //double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var empoyeeName = "David perez";
        System.out.println("Empleado " + empoyeeName + " su salario total es: " + totalSalary);
    }
}
