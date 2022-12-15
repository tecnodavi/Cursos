public class Doctor {
    static int id=0;//Autoincrementado
    String name;
    String email;
    String especiality;
    Doctor (){
        System.out.println("Construyendo el Objecto Doctor");

    }
    Doctor (String name, String especiality){
        System.out.println("El nombre del Doctor asigando es: ");
        id++;
        this.name = name;
        this.especiality = especiality;
    }
    //Comportamientos
    public void ShowName(){
        System.out.println(name);
    }
    public void showId (){
        System.out.println("ID Doctor: "+id);
    }
}
