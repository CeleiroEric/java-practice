import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Eric", "celeiroericwork@gmail.com"));
        usuarios.add(new Usuario("Eugenia", "eugenia@gmail.com"));
        usuarios.add(new Usuario("Sergio", "sergio@gmail.com"));
        usuarios.add(new Usuario("Raul", "raul@gmail.com"));
        usuarios.add(new Usuario("Roberto", "roberto@hotmail.com"));
        usuarios.add(new Usuario("Alberto", "alberto@hotmail.com"));

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Bienvenido al menu SQL");
            System.out.println("1.SELECT - Filtrar por dominio de email");
            System.out.println("2.ORDER BY - Ordenar por nombre");
            System.out.println("3.GROUP BY - Agrupar usuarios por dominio de email");
            System.out.println("4.Salir del programa");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    //SIMULANDO SELECT
                    System.out.println("Introduzca el dominio de email para filtrar");
                    String dominio = scanner.nextLine();
                    List<Usuario> emailsFiltrados = usuarios.stream().filter(usuario -> usuario.getEmail().contains(dominio)).toList();
                    emailsFiltrados.forEach(System.out::println);
                    break;

                case 2:
                    //SIMULANDO ORDER BY
                    List<Usuario>usuariosOrdenados = usuarios.stream().sorted(Comparator.comparing(Usuario::getNombre)).toList();
                    usuariosOrdenados.forEach(System.out::println);
                    break;

                case 3:
                    //SIMULANDO GROUP BY
                    Map<String, List<Usuario>> mapUsuarios = new HashMap<>();
                    for(Usuario usuario : usuarios){
                        String dominioEmail = usuario.getEmail().split("@")[1];
                        mapUsuarios.computeIfAbsent(dominioEmail, clave -> new ArrayList<>()).add(usuario);
                    }
                    for(String dominioMapa : mapUsuarios.keySet()){
                        System.out.println("Dominio: " + dominioMapa);
                        mapUsuarios.get(dominioMapa).forEach(System.out::println);
                        System.out.println();
                    }
            }
        }
    }
}













