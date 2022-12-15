//Upper Camel Case (es el nombre de la clase cada palabra su primera letra en mayúsculas)
                    //
public class UpdatingVariables {
    public static void main(String[] args) {
        int salary =1000;
        //bono de $200
        //Se le suma con la misma variable ya que puede cambiar la variable principal
        salary = salary+200;
        System.out.println(salary);

        //pension: $50 descuento
        salary = salary-50;
        System.out.println(salary);

        //2 horas extras cada hora $30
        // utilizo un cupon de comida $45
        salary = salary+(2*30)-45;
        System.out.println(salary);

        //actualizando cadenas de texto
        //concatenar con el caracter +
        String employeeme="David Perez";
        employeeme = employeeme + " Miranda";
        System.out.println(employeeme);
        employeeme = "Patricio " + employeeme;
        System.out.println(employeeme);

        //Lower Camel Case (siempre la primera con minúscula y las otras mayúsculas)
        String fullName = "David Patricio Perez Miranda";
        int sizeInCentimeters =26;
    }

}
