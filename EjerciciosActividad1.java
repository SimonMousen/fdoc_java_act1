public class EjerciciosActividad1 {
    public static void main(String[] args) {


        // DECLARACION DE VARIABLES
        // 1
        int entero = 13;
        System.out.println("El valor INT es: " + entero);

        // 2
        double decim = 15.6;
        System.out.println("El valor decimal es: " + decim);

        // 3
        String texto = "cualquier cosa";
        System.out.println("El texto es: " + texto);


        // IDENTIFICADORES
        // 1
        String textoCamel = "Primer texto con lowerCamelCase";
        String nombreCompleto = "Simón sierra lópez";
        System.out.println("Primer lower: " + textoCamel);
        System.out.println("Segundo lower: " + nombreCompleto);

        // 2
        final double NUMERO_PI = 3.1416;
        System.out.println("Valor del numero pi: " + NUMERO_PI);

        // 3
        String PascalCase = "PascalCase se usa para nombres de clases: cada palabra comienza con mayúscula";
        System.out.println("Que es PascalCase: " + PascalCase);


        // ESTILOS CONVENCIÓN
        // 1
        int dineroAhorrado = 2300000;
        String nombreCarrera = "Analisis y desarrollo de software.";
        System.out.println("Tu dinero ahorrado en el banco es: " + dineroAhorrado);
        System.out.println("El nombre de la carrera que estudias es: " + nombreCarrera);

        // 2
        String apellido_usuario = "Sierra";
        int numero_telefono = 313792848;
        System.out.println("Tu apellido es: " + apellido_usuario);
        System.out.println("Tu numero de celular es: " + numero_telefono);

        // 3
        System.out.println("El kebab-case no es valido en Java ya que el guion medio (-) es un operador de resta.");


        // DATOS PRIMITIVOS
        // 1
        byte valorByte = 127;
        short valorShort = 32000;
        int valorInt = 2147483647;
        long valorLong = 9223372036854775807L;
        float valorFloat = 3.14f;
        double valorDouble = 2.71828;
        boolean valorBoolean = true;
        char valorChar = 'A';
        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);

        // 2
        int a = 15;
        int b = 4;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double) a / b;
        System.out.println("Resultado de operaciones:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Divison: " + division);

        // 3
        boolean numeroMayor = a > b;
        if (numeroMayor) {
            System.out.println(a + " Es mayor que " + b);
        } else {
            System.out.println(b + " Es mayor que " + a);
        }


        // DATOS NO PRIMITIVOS
        // 1
        String mensaje = "El string es un dato no primitivo.";
        System.out.println(mensaje);

        // 2
        int[] numeros = new int[3];
        numeros[0] = 12;
        numeros[1] = 34;
        numeros[2] = 56;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }


        // ARITMETICOS
        // 1
        int x = 17, y = 5;
        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("Multiplicación: " + (x * y));
        System.out.println("División: " + (x / y));
        System.out.println("Módulo: " + (x % y));

        // 2
        System.out.println("División entera: " + (x / y));
        System.out.println("División decimal: " + ((double) x / y));

        // 3
        int contador = 10;
        System.out.println("Valor inicial: " + contador);
        contador++;
        System.out.println("Después de incremento: " + contador);
        contador--;
        System.out.println("Después de decremento: " + contador);
        ++contador;
        System.out.println("Pre-incremento: " + contador);


        //ASIGNACION
        int numero = 20;
        System.out.println("Valor inicial: " + numero);
        numero += 5;
        System.out.println("Después de += 5: " + numero);
        numero -= 3;
        System.out.println("Después de -= 3: " + numero);
        numero *= 2;
        System.out.println("Después de *= 2: " + numero);
        numero /= 4;
        System.out.println("Después de /= 4: " + numero);
        numero %= 7;
        System.out.println("Después de %= 7: " + numero);
        System.out.println("El operador %= asigna la resta de la división");


        //COMPARACION
        int n1 = 15, n2 = 10;
        System.out.println(n1 + " == " + n2 + ": " + (n1 == n2));
        System.out.println(n1 + " != " + n2 + ": " + (n1 != n2));
        System.out.println(n1 + " > " + n2 + ": " + (n1 > n2));
        System.out.println(n1 + " < " + n2 + ": " + (n1 < n2));
        System.out.println(n1 + " >= " + n2 + ": " + (n1 >= n2));
        System.out.println(n1 + " <= " + n2 + ": " + (n1 <= n2));
        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n1 < n2) {
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es igual a " + n2);
        }


        //LOGICOS
        boolean p = true, q = false;

        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));

        System.out.println("!p: " + (!p));
        System.out.println("!q: " + (!q));

        int edad = 25;

        boolean tieneLicencia = true;
        boolean tieneSeguro = false;
        
        boolean puedeConducir = (edad >= 18) && tieneLicencia && (tieneSeguro || edad < 26);
        System.out.println("Puede conducir: " + puedeConducir);
        
        boolean condicionCompleja = (edad > 20 || tieneLicencia) && !tieneSeguro;
        System.out.println("Condición compleja: " + condicionCompleja);


        //IF
        int k = 15, l = 10;

        if (k > l) {
            System.out.println(k + " es mayor que " + l);
        }
        
        int numeroIE = 7;
        if (numeroIE % 2 == 0) {
            System.out.println(numeroIE + " es par");
        } else {
            System.out.println(numeroIE + " es impar");
        }
        
        int puntuacion = 85;
        if (puntuacion >= 90) {
            System.out.println("Excelente");
        } else if (puntuacion >= 70) {
            System.out.println("Bueno");
        } else if (puntuacion >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }


        //TERNARIO
        //1
        int edadM = 20;
        String mensajeEdad = (edadM >= 18) ? "mayor de edad" : "menor de edad";
        System.out.println("Con " + edadM + " años es " + mensajeEdad);
        
        //2
        int cantidadComprada = 15;
        double precio = 100.0;
        double descuento = (cantidadComprada > 10) ? precio * 0.1 : 0;
        System.out.println("Descuento aplicado: $" + descuento);
 
        //3
        int numeroP = 8;
        String tipo = (numeroP % 2 == 0) ? "par" : "impar";
        System.out.println(numeroP + " es " + tipo);


        //SWITCH
        //1
        String dia = "Lunes";
        int numeroDia;
        switch (dia.toLowerCase()) {
            case "lunes": numeroDia = 1; break;
            case "martes": numeroDia = 2; break;
            case "miércoles": numeroDia = 3; break;
            case "jueves": numeroDia = 4; break;
            case "viernes": numeroDia = 5; break;
            case "sábado": numeroDia = 6; break;
            case "domingo": numeroDia = 7; break;
            default: numeroDia = -1;
        }
        System.out.println(dia + " es el día número " + numeroDia);
        
        //2
        int calificacion = 85;
        String textoCalificacion;
        switch (calificacion / 10) {
            case 10:
            case 9: textoCalificacion = "Excelente"; break;
            case 8: textoCalificacion = "Muy Bueno"; break;
            case 7: textoCalificacion = "Bueno"; break;
            case 6: textoCalificacion = "Suficiente"; break;
            default: textoCalificacion = "Insuficiente";
        }
        System.out.println("Calificación " + calificacion + ": " + textoCalificacion);
        
        //3
        int mes = 3;
        String estacion;
        switch (mes) {
            case 12: case 1: case 2: estacion = "Invierno"; break;
            case 3: case 4: case 5: estacion = "Primavera"; break;
            case 6: case 7: case 8: estacion = "Verano"; break;
            case 9: case 10: case 11: estacion = "Otoño"; break;
            default: estacion = "Mes inválido";
        }
        System.out.println("Mes " + mes + ": " + estacion);


        //OTROS
        //1
        int numeroT = -5;
        if (numeroT > 0) {
            System.out.println(numeroT + " es positivo");
        } else if (numeroT < 0) {
            System.out.println(numeroT + " es negativo");
        } else {
            System.out.println("El número es cero");
        }

        //2
        String contraseñaIngresada = "miContraseña123";
        String contraseñaEsperada = "miContraseña1234";
        if (contraseñaIngresada.equals(contraseñaEsperada)) {
            System.out.println("Contraseña correcta. Acceso permitido.");
        } else {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
        }

        //3
        int nota = 78;
        String categoria;
        
        if (nota >= 90) {
            categoria = "A - Excelente";
        } else if (nota >= 80) {
            categoria = "B - Muy Bueno";
        } else if (nota >= 70) {
            categoria = "C - Bueno";
        } else if (nota >= 60) {
            categoria = "D - Regular";
        } else {
            categoria = "F - Reprobado";
        }
        System.out.println("Nota: " + nota + " - Categoría: " + categoria);
    }
}
