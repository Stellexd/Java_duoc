package redesSocialesWaza;

import java.util.ArrayList;
import java.util.Scanner;

public class persona {
    String usuario, contrasena, opc;

    public persona(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.opc= opc;
    }

    public static void main(String[] args) {
        System.out.println("Elige tu opción: \n 1. Crear usuario \n 2. Ingresar a Twitter \n 3. Ingresar a Instagram\nEs necesario crear un usuario para seguir con el programa");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cuenta = new ArrayList<>();
        String opc = sc.nextLine();
        if (opc.equals("1")){
            System.out.println("Ingresa tu usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingresa tu contraseña: ");
            String contrasena = sc.nextLine();
            persona persona = new persona(usuario, contrasena);
            cuenta.add(usuario);
            cuenta.add(contrasena);

        }
    }
}
