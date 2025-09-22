import java.util.Scanner;

class Pila {
    private String[] elementos;
    private int tope;

    public Pila(int capacidad) {
        elementos = new String[capacidad];
        tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public void push(String dato) {
        if (tope < elementos.length - 1) {
            tope++;
            elementos[tope] = dato;
        } else {
            System.out.println("La pila está llena.");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String dato = elementos[tope];
            tope--;
            return dato;
        } else {
            return null;
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return elementos[tope];
        } else {
            return null;
        }
    }
}

class EditorTextoBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pila pilaPrincipal = new Pila(100); // pila para textos
        Pila pilaRehacer = new Pila(100);   // pila para rehacer

        int opcion = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {
                System.out.print("Ingrese el texto: ");
                String texto = sc.nextLine();
                pilaPrincipal.push(texto);
                pilaRehacer = new Pila(100); // limpiar pila de rehacer
            }
            else if (opcion == 2) {
                String deshecho = pilaPrincipal.pop();
                if (deshecho == null) {
                    System.out.println("No hay nada para deshacer.");
                } else {
                    pilaRehacer.push(deshecho);
                    System.out.println("Se deshizo: " + deshecho);
                }
            }
            else if (opcion == 3) {
                String refeito = pilaRehacer.pop();
                if (refeito == null) {
                    System.out.println("No hay nada para rehacer.");
                } else {
                    pilaPrincipal.push(refeito);
                    System.out.println("Se rehizo: " + refeito);
                }
            }
            else if (opcion == 4) {
                String actual = pilaPrincipal.peek();
                if (actual == null) {
                    System.out.println("Texto vacío.");
                } else {
                    System.out.println("Texto actual: " + actual);
                }
            }
            else if (opcion == 5) {
                System.out.println("Saliendo...");
            }
            else {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
