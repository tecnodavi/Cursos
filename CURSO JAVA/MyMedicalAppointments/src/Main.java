import static ui.Uimenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("David Perez", "Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.especiality);

        int i = 0;
        int b= 2;
        b = i;
        String name = "Ann";

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "aleja@.com");
        Patient patient2 = new Patient("david", "david@.com");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
       /* patient.setWeight(54.6);
        System.out.println(patient.getweight());
        patient.setPhoneNumber("1231541541654154");*/


       // showMenu();
    }

}
