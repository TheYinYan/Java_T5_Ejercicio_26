public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int d1 = Integer.parseInt(System.console().readLine("Introduzca un dígito: "));
        int aux = num;
        int invertido = 0;
        int longitud = 0;

        while (aux != 0) {
            invertido = (invertido * 10) + aux % 10;
            aux /= 10;
            longitud++;
        }
        System.out.printf("Contando de izquierda a derecha el %d aparece dentro de %d en las siguientes posciciones: ",
                d1, num);

        for (int i = 1; i <= longitud; i++) {
            int d2 = invertido % 10;
            if (d2 == d1) {
                System.out.print(i + " ");
            }
            invertido /= 10;
        }

    }
}