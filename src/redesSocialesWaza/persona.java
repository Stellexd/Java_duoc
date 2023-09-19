package redesSocialesWaza;

import java.util.ArrayList;
import java.util.Scanner;

public class persona {
    String usuario, contrasena;

    public persona(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static void main(String[] args) {
        System.out.println("Elige tu opción: \n 1. Crear usuario \n 2. Ingresar a Twitter \n 3. Ingresar a Instagram\nEs necesario crear un usuario para seguir con el programa");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cuenta = new ArrayList<>();
    }
}
