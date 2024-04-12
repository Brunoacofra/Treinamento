public class TiposPrimitivos {
    public static void main (String[] args){
        //int,double,char,byte,float,short,long e boolean
        int idade = 10;
        double salario = 2000;
        float salariodele = 2500.85f;
        char letrinha = 'A';
        boolean verdade = true;
        long numero = 1850;
        /**
        * O Byte so cabem 8 bits dentro ou seja até <b>127</b> e <b>-128/b>
        * */
        byte numerinho = 127;

        // Fazendo casting de variaveis

        int maximo = (int) 10000000000L; // L de marcação Long
        byte teste = (byte) 128;
        long teste2 = (long) 127.908D; // D de Marcação double
        System.out.println("Minha idade é "+idade);
        System.out.println("Minha Int é "+maximo);
        System.out.println("Minha Byte é "+teste);
        System.out.println("Minha long é "+teste2);

        // Novo tipo de declarção no Java sem Tipo evidente 
        var nome = "legal";
    }
}
