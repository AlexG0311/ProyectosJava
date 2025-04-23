
public class Arrays {
    public static void main(String[] args) {

        // PRIMERA FORMA
int[] numeros = new int[10];

numeros[0] = 0;
numeros[1] = 1;
numeros[2] = 2;
numeros[3] = 3;
numeros[4] = 4;
numeros[5] = 0;
numeros[6] = 1;
numeros[7] = 2;
numeros[8] = 3;
numeros[9] = 4;

// SEGUNDA FORMA
int[] numero = {2,3,4,5};

// ITERAR CON FOR
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero es: "+  numeros[i] + " con indice: " + i);
        }
// ITERACION CON FOR EACH
        System.out.println("----------------- con foreach--------------------------");
        int indice = 0;
        for(int num : numeros){
            System.out.println(num + " con indice: " + indice);
            indice++;

        }
    }
}
