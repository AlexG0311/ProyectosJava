import java.util.Arrays;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        int intentosMaximos = 7;
        String palabraSecreta = "cristiano";
        boolean isWordCorrecta = false;
/////////////////////////////////////////////////////////
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraSecreta.length(); i++) {
            letrasAdivinadas[i] = '_';
        }

        while(!isWordCorrecta && intentos < intentosMaximos){
            System.out.println("Adivina " + palabraSecreta.length() + " palabras:  " + String.valueOf(letrasAdivinadas));
            System.out.println("Digite una letra: ");
            char letra = teclado.next().charAt(0);

            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length() ; i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta te quedan " + (intentosMaximos - intentos));
            }
            if(String.valueOf(isWordCorrecta).equals(letrasAdivinadas)){
                isWordCorrecta = true;
                System.out.println("Has ganadooo yujuuuuu");
            }

        }
        if(!isWordCorrecta){
            System.out.println("Has perdido TONTO");
        }
        teclado.close();





    }
}