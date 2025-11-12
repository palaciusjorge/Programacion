package Sesion9;

public class contador_elementos {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 1, 1};
        boolean[] contado = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!contado[i]) {
                int contador = 1;

                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        contador++;
                        contado[j] = true;
                    }
                }

                System.out.println(array[i] + " aparece " + contador + " " +
                        (contador == 1 ? "vez" : "veces"));
            }
        }
    }
}

