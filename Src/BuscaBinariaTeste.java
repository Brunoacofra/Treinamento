package Src;
public class BuscaBinariaTeste {
    public static void main (String[] args) {
        int[] minha_lista = new int[7];
        minha_lista[0]= 1;
        minha_lista[1] = 3;
        minha_lista[2] = 4;
        minha_lista[3] = 5;
        minha_lista[4] = 7;
        minha_lista[5] = 9;
        minha_lista[6] = 13;
        System.out.println(Busca(minha_lista,5));
        System.out.println(Busca(minha_lista,0));
        System.out.println(Busca(minha_lista,13));
    }

    public static String Busca(int[] lista, int item) {
        int baixo = 0;
        int alto = (lista.length) -1;
        while(baixo <= alto) {
            int meio = (baixo+alto)/2;
            int chute = lista[meio];
            if (chute == item) {
                return "O numero "+item+" Está na posição "+meio;
            } else if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return "Não contém o numero: "+item;
    }
}
