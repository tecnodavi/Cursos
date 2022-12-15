public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended =3;
        if (isBluetoothEnable){
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");

        }else {
            System.out.println("Archivo no Enviado");
        }

        //ejercicio de operadores lógicos
        int n1 = 3;
        int n2 = 2;
        if (n1==n2){
            System.out.println("Los numeros son iguales");
        }else {
            System.out.println("los numero no son iguales");
        }

        if (n1!=1) {
            System.out.println("el numero si es diferente");
        }

        if (n1<n2){
            System.out.println("El numero: "+n1+" es menor que: "+n2);
        }else {
            System.out.println("el numero es mayor");
        }
    }

}


