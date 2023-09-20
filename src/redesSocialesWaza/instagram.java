package redesSocialesWaza;
import java.util.ArrayList;
import java.util.Scanner;
public class instagram extends persona {
    String historia, titulo, usuario1, contrasena1;
    Scanner sc = new Scanner(System.in);
    public instagram(String usuario, String contrasena) {
        super(usuario, contrasena);
    }
    System.out.println("Ingresa tu usuario: ");
        String getUsuario1 = sc.nextLine();
    System.out.println("Ingresa tu contraseña: ");
        String getContrasena1 = sc.nextLine();
}
