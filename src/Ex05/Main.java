package Ex05;

import Ex01.*;
import Ex02.*;
import Ex03.*;
import Ex04.*;

import java.util.Scanner;


public class Main {

    public static void TesteExercicio01(){
        Administrativo adm = new Administrativo("Matheus", 5000.00, 123, "noite", 500.00);
        System.out.println(adm.toString());

        Tecnico tec = new Tecnico("Andrezza", 10000.00, 1, 2000.00);
        System.out.println(tec.toString());
    }
    public static void TesteExercicio02(){
        Gato cat = new Gato("Gibbs");
        System.out.println(cat.toString() + " " + cat.mia()+ " " + cat.caminha());

        Cachorro dog = new Cachorro("Lessie");
        System.out.println(dog.toString()+ " " + dog.late()+ " " + dog.caminha());
    }
    public static void TesteExercicio03(){
        Rica ryca = new Rica();
        Pobre trabalhador = new Pobre();
        Miseravel mendigo = new Miseravel();

        System.out.println();
    }
    public static void TesteExercicio04(){
        Ingresso ingresso = new Ingresso(100);
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Ingresso normal, 2 - Ingresso vip");
        int opcao = teclado.nextInt();

        if(opcao == 1){
            System.out.println("Você escolheu o ingresso normal");
            ingresso = new Normal(ingresso.getValor());
            System.out.println("O valor do ingresso será: " + ingresso.imprimeValor());
        } else if(opcao == 2){
            System.out.println("Você escolheu o ingresso VIP");
            System.out.println("1 - Camarote inferior, 2 - Camarote superior");
            opcao = teclado.nextInt();
            if(opcao == 1){
                ingresso = new CamaroteInferior(100, "A5");
                System.out.println("Você escolheu camarote inferior");
                System.out.println("O valor do ingresso será: " + ingresso.imprimeValor());
            } else if(opcao == 2){
                ingresso = new CamaroteSuperior(100,50);
                System.out.println("Você escolheu camarote superior");
                System.out.println("O valor do ingresso será: " + ingresso.imprimeValor());
            }
        }
    }
    public static void TesteExercicio05(){
        Imovel imovel = new Imovel("Avenida Brasil", 100000.00);
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Para imovel novo, 2 - Para imovel velho");
        int opcao = teclado.nextInt();
        if(opcao == 1){
            imovel = new Novo("Rua Chapadão",200000.00, 30.5);
            System.out.println("Você escolheu um imovel novo "+ imovel.toString());
            System.out.println("Valor total: "+ ((Novo) imovel).imprimeValorTotal()); //perguntar sobre erro tirando o casting
        } else if(opcao == 2){
            imovel = new Velho("Rua Dna Cecilia",100000.00, 20);
            System.out.println("Você escolheu um imovel velho "+ imovel.toString());
            System.out.println("Valor total: "+ ((Velho) imovel).imprimeValorTotal());
        }
    }



    public static void main(String[] args) {
        TesteExercicio01();
        TesteExercicio02();
        TesteExercicio03();
//        TesteExercicio04();
        TesteExercicio05();
    }
}
