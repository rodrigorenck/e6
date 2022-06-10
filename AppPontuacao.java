package e6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AppPontuacao {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);


        int codigo;
        String nome;

        System.out.println("PRIMEIRO TIME:");
        do{
            System.out.print("Informe o codigo do time: ");
            codigo = sc.nextInt();
        }while(codigo<0);

        do{
            System.out.print("Informe o nome do time: ");
            nome = str.nextLine();
        }while(nome.equalsIgnoreCase("gremio"));

        Pontuacao time1 = new Pontuacao(codigo, nome);


        int golsPro;
        int golsContra;
        do{
            System.out.print("Gols a favor: ");
            golsPro = sc.nextInt();
            System.out.print("Gols contra: ");
            golsContra = sc.nextInt();
        }while(golsPro<0 || golsContra<0);

        time1.setGolsPro(golsPro);
        time1.setGolsContra(golsContra);
        time1.atualiza();

        System.out.println(time1);

        System.out.println();
        System.out.println("SEGUNDO TIME");
        do{
            System.out.print("Informe o codigo do time: ");
            codigo = sc.nextInt();
        }while(codigo<0);

        do{
            System.out.print("Informe o nome do time: ");
            nome = str.nextLine();
        }while(nome.equalsIgnoreCase("gremio"));

        Pontuacao time2 = new Pontuacao(codigo, nome);

        do{
            System.out.print("Gols a favor: ");
            golsPro = sc.nextInt();
            System.out.print("Gols contra: ");
            golsContra = sc.nextInt();
        }while(golsPro<0 || golsContra<0);

        time2.setGolsPro(golsPro);
        time2.setGolsContra(golsContra);
        time2.atualiza();

        System.out.println(time2);






    }
}