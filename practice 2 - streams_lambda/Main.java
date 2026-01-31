import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Eric", "celeiroericwork@gmail.com"));
        usuarios.add(new Usuario("Eugenia", "eugenia@gmail.com"));
        usuarios.add(new Usuario("Sergio", "sergio@gmail.com"));
        usuarios.add(new Usuario("Raul", "raul@gmail.com"));
        usuarios.add(new Usuario("Roberto", "roberto@hotmail.com"));

        System.out.println("Bienvenido al menu:");
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1.Filtrar usuarios que contengan una letra.");
            System.out.println("2.Filtrar usuarios que contengan un dominio especifico de email");
            System.out.println("3.Salir del programa");
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            }catch(InputMismatchException exception){
                System.out.println("Introduzca un numero.");
                scanner.nextLine();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la letra por la que quiere filtrar usuarios");
                    String letra = scanner.nextLine();
                    List<Usuario> usuariosFiltrados = usuarios.stream().filter(usuario -> usuario.getNombre().toLowerCase().contains(letra)).toList();
                    usuariosFiltrados.forEach(System.out::println);
                    break;

                case 2:
                    System.out.println("Introduzca el dominio (Ejemplo: @gmail.com)");
                    String email = scanner.nextLine();
                    List<Usuario>emailsFiltrados = usuarios.stream().filter(usuario->usuario.getEmail().toLowerCase().contains(email)).toList();
                    emailsFiltrados.forEach(System.out::println);
                    break;
            }
        }
    }
}

