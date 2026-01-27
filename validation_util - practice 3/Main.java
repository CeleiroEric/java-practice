import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Eric", "celeiroericwork@gmail.com"));
        usuarios.add(new Usuario("Eugenia", "eugenia@gmail.com"));
        usuarios.add(new Usuario("Roberto", "robertohotmail.com"));

        //Probando la funcion esEmailValido
        for(Usuario usuario: usuarios){
            if(ValidationUtil.esEmailValido(usuario.getEmail())){
                System.out.println(usuario.getNombre() + " tiene email valido: " + usuario.getEmail());
            }
        }

        //Probando la funcion leerStringNoVacio
        String nombre = ValidationUtil.leerStringNoVacio("Introduzca un nombre: ",scanner);
        System.out.println("Nombre introducido: " + nombre);


        //Probando la funcion esNumero
        while(true){
            System.out.println("Introduzca un numero");
            String numero = scanner.nextLine();
            if(ValidationUtil.esNumero(numero)){
                System.out.println("Es un numero");
                break;
            }else{
                System.out.println("No es un numero");
            }
        }
    }
}

