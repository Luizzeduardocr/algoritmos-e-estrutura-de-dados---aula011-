public class exemploDadosNaoPrimitivos {
    public static void main(String[] args) {
    
        //tipos caracter PRIMITIVO
        char caracter = 'A';

        //tipo caracteres não primitivo
        String nome = "Luiz";
        nome = "Luiz Eduardo";

        //tipo Enum
        enum DiaDaSemana{
            DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO
        }
        DiaDaSemana dia = DiaDaSemana.DOMINGO;
        
        //tipo array
        int[] numeros = {1,2,3,4,5};

        System.out.println(nome);
        System.out.println(dia);
        System.out.println(numeros[0]);
        System.out.println(caracter);
    }
}
