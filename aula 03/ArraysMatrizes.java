import java.util.Scanner;

public class ArraysMatrizes {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1,2,3};
        int[] numeros2 = new int[5];

        numeros2[0] = 11;
        numeros2[1] = 22;
        numeros2[2] = 33;
        numeros2[3] = 44;
        numeros2[4] = 55;

        System.out.println(numeros [1]) ;
        System.out.println(numeros2[2]);

        //Matriz
        int[][] matriz =  {{1,2,3},{4,5,6},{7,8,9}} ;
        int[][] matriz2 = new int[3][3] ;

        System.out.println(matriz[2][0]);
        System.out.println(matriz2[1][2]);

        System.out.println("digite um numero: ");
        numeros[0] = Integer.parseInt(scanner.nextLine());
        System.out.println(numeros [0]);
    }
    
}
