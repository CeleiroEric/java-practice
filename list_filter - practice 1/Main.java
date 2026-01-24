import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Eric","celeiroericwork@gmail.com"));
        usuarios.add(new Usuario("Eugenia","eugenia@gmail.com"));
        usuarios.add(new Usuario("Sergio","sergio@gmail.com"));
        usuarios.add(new Usuario("Raul","raul@gmail.com"));
        usuarios.add(new Usuario("Roberto","roberto@gmail.com"));

        while(true){
            System.out.println("Introduzca la letra para filtrar los usuarios");
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean encontrado=false;
            for(Usuario usuario: usuarios){
                if(usuario.getNombre().startsWith(String.valueOf(letra))){
                    System.out.println(usuario);
                    encontrado=true;
                }
            }
            if(!encontrado){
                System.out.println("No hay usuarios que empiecen con la letra " + letra);
            }
            int respuesta=0;
            while(true){
                System.out.println("Desea buscar otra letra?: 1.Si / 2.No");
                try{
                    respuesta = scanner.nextInt();


                    if(respuesta==1 || respuesta==2){
                        break;
                    }else{
                        System.out.println("Introduzca 1 o 2 por favor.");
                    }
                }catch(InputMismatchException exception){
                    System.out.println("Introduzca 1 o 2 por favor.");
                    scanner.nextLine();
                }
            }
            if(respuesta==2){
                break;
            }
        }
    }
}