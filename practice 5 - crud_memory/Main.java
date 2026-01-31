import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Eric", "celeiroericwork@gmail.com"));
        usuarios.add(new Usuario("Eugenia", "eugenia@gmail.com"));
        usuarios.add(new Usuario("Sergio", "sergio@gmail.com"));
        usuarios.add(new Usuario("Raul", "raul@gmail.com"));
        usuarios.add(new Usuario("Roberto", "roberto@hotmail.com"));
        usuarios.add(new Usuario("Alberto", "alberto@hotmail.com"));
        System.out.println("Bienvenido al menu CRUD (CREATE, READ, UPDATE, DELETE");
        int opcion = 0;
        while(opcion!=5){
            System.out.println("1.Crear usuario");
            System.out.println("2.Listar usuarios");
            System.out.println("3.Actualizar un usuario");
            System.out.println("4.Eliminar un usuario");
            System.out.println("5.Salir del programa");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                //INSERT
                case 1:
                    System.out.println("Introduzca el nombre del usuario:");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduzca el email del usuario:");
                    String email = scanner.nextLine();
                    usuarios.add(new Usuario(nombre,email));
                    System.out.println("Usuario creado correctamente:");
                    break;
                //READ
                case 2:
                    usuarios.forEach(System.out::println);
                    break;
                //UPDATE
                case 3:
                    System.out.println("Introduzca el nombre del usuario:");
                    String nombreBuscar = scanner.nextLine();
                    for(Usuario usuario : usuarios){
                        if(usuario.getNombre().equals(nombreBuscar)){
                            System.out.println("Introduzca el nuevo nombre del usuario:");
                            String nuevoNombre = scanner.nextLine();
                            usuario.setNombre(nuevoNombre);
                            System.out.println("Introduzca el nuevo email del usuario: ");
                            String nuevoEmail = scanner.nextLine();
                            usuario.setEmail(nuevoEmail);
                            System.out.println("La informacion del usuario ha sido actualizada correctamente");
                            System.out.println("Nuevos datos del usuario: " + usuario);
                        }
                    }
                    break;
                //DELETE
                case 4:
                    System.out.println("Introduzca el nombre del usuario que quiere eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    Usuario usuarioEliminar = null;
                    for(Usuario usuario : usuarios){
                        if(usuario.getNombre().equals(nombreEliminar)){
                            usuarioEliminar = usuario;
                        }
                    }
                    if(usuarioEliminar != null){
                        usuarios.remove(usuarioEliminar);
                    }
                    break;
            }
        }
    }
}