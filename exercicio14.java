import java.util.Scanner;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

public class exercicio14 {
    public static void main(String[] args) {
        //variaveis
        double peso,excesso,multa;

        Scanner teclado = new Scanner(System.in);

        System.out.println("peso dos peixes ");
        peso = teclado.nextDouble();
        teclado.close();
        
        excesso = peso - 50;
        
        multa = (excesso * 4);

        if(peso<= 50){
            System.out.println("não tem excesso de peso ");}
            else{
                System.out.println("excesso de peso " + excesso);
                System.out.println("a multa por excesso de peso é R$ " + multa);
            }
        
    }
    
}
