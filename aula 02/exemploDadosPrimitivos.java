public class exemploDadosPrimitivos{
    public static void main(String[] args){

        //numeros inteiros
        byte valorByte = 127; //-128 a 127
        short valorShort = 32767; //-32768 a 32767
        int valorInt = 214783647; //-214783647 a 214783647
        long valorLong= 9223372036854775807L; //-9223372036854775807L a 9223372036854775807L

        //numeros flutuantes
        float valorFloat = 3.14f;
        double valorDouble = 3.14159265359;

        //tipos caracter
        char caracter = 'A'; //sempre utilizar 'aspas simples' e apenas um caracter

        //tipo booleano
        boolean verdadeiro = true; 
        boolean falso = false ;
        
        System.out.println(valorByte);
        System.out.println(valorShort);
        System.out.println(valorInt);
        System.out.println(valorLong);
        System.out.println(valorFloat);
        System.out.println(valorDouble);
        System.out.println(caracter);
        System.out.println(verdadeiro);
        System.out.println(falso);

    }
}