public class EjemploSwitch {
    public static void main(String[] args) {
        int numero;

        numero = Utils.leerEntero("Digite un número: ");

        switch (numero) {
            case 1:
                System.out.println("Es uno");
                break;

            case 2:
                System.out.println("Dos");
                break;

            default:
                System.out.println("Cualquier otro");
                break;
        }
    }
}
