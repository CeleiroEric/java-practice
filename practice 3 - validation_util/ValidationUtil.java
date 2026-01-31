import java.util.Scanner;

public class ValidationUtil {
    public static boolean esEmailValido(String email){
        return email.contains("@");
    }


    public static boolean esNumero(String numero){
        try{
            Double.parseDouble(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }


    public static String leerStringNoVacio(String mensaje,Scanner scanner){
        String input = "";
        do{
            System.out.println(mensaje);
            input = scanner.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("No puede estar vacio, intentalo otra vez");
            }
        }while(input.isEmpty());
        return input;
    }
}
