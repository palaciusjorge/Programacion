package EJERCICIOS_GITHUB;

import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        // EJERCICIO 5 : Contraseña con intentos limitados

        String password = "Password12";
        int attempts = 3;
        Scanner scanner6 = new Scanner(System.in);
        String introducedPassword;
        for (int i = 0; i < attempts; i++){
            System.out.println("Introduzca la contraseña :");
            introducedPassword = scanner6.nextLine();
            if(introducedPassword.equals(password)){
                System.out.println("Contraseña correcta. Acceso al sistema concedido.");
                break;
            }else{
                attempts --;
                System.out.println("Esa no es la contraseña, te quedan :" + attempts + " intentos");

            }

        }

    }
}
