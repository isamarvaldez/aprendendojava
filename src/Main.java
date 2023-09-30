
public class Main {
    public static void main(String[] args) {
        String[] listadeprofessores = {"alana", "thiago", "samanta", "alexia", "odirlei"};

        for (int contador = 0; contador < listadeprofessores.length; contador++) {
            System.out.println("o indice atual e" + contador);
            if (contador == 0) {
                System.out.println("o numero de indice do(a) professor(a)" + listadeprofessores[contador] + "e zero");

            } else if (contador % 2 == 0) {
                System.out.println("o numero de indice do(a) professor(a)" + listadeprofessores[contador] + "e par");


            } else {
                System.out.println("o numero de indice do(a) professor(a)" + listadeprofessores[contador] + "e impar");

            }
        }
    }
}