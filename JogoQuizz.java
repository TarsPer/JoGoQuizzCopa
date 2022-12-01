import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JogoQuizz {
    
    static int Pontos = 0;
    static int ErroPontos = 0;
    static String nome;

    public static void main(String[] args) {
       String entrada;
       nome();
       do{
           entrada = Menu();
           controlador (entrada);
       }while (entrada != "4");
        
       }
 
    
    public static void nome(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Olá,bem Vindo ao Quiz sobre a Copa do Mundo!!");
        System.out.println("Qual seu nome?");
        nome = input.next();
        System.out.println("--------------------------------------");
        
    }
    
    public static String Menu() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nOla " + nome + ","+" bem vindo ao nosso quiz, por favor escolha uma das opções do Menu abaixo!");
        System.out.println(" *---MENU---* ");
        System.out.println("(1) - Jogar ");
        System.out.println("(2) - Instruções ");
        System.out.println("(3) - Creditos ");
        System.out.println("(4) - Sair ");
        System.out.println("--------------------------------------");
        System.out.println("Escolha uma opção");
        String menu = input.next();
        
        return menu;
        
    }
    
    public static void controlador(String menu){
        
        switch (menu) {
            
       
            case "1":
                jogar();
                break;

            case "2":
                intrucoes();
                break;

            case "3":
                credito();
                break;
            case "4":
                System.out.println("Você saiu do Jogo!");
                break;

            default:
                System.out.println("Opção Invalida!");
        } 
    }
        
    

    public static void jogar() {
        
        System.out.println("\n Você sabe sobre Copa do Mundo?");

        Questao1();
        Questao2();
        Questao3();
        Questao4();
        Questao5();
        Questao6();
        Questao7();
        Questao8();
        Questao9();
        Questao10();
       
       
        System.out.println(nome + " você teve um total de Acertos de : " + Pontos);
        System.out.println(nome + " você teve um total de Erros de : " + ErroPontos);
        System.out.println("");
        System.out.println("---- " + nome + " Obrigado pro ter finalizado nosso Quizz ---- ");
        System.out.println("");
    }

    public static void intrucoes() {
        System.out.println("\nEsse é um Quiz sobre as Copas do Mundo!!");
        System.out.println(nome);
        System.out.println("Serão feitas 10 perguntas sobre Copa do Mundo");
        System.out.println("Por fim você irá saber sua pontuação, a cada  resposta correta seram contabilizados 10 pontos, portanto, o máximo de pontos possiveis são 100!");

        System.out.println(""); // quebra de linha
    }

    public static void credito() {
        System.out.println("\nQUIZ produzido por fins estudantis ");
        System.out.println("para faculdade de ADS (Analise e Desenvolvimento de Sistemas).");
        System.out.println("Criadores:");
        System.out.println("Rafael Silva Matos Pereira");
        System.out.println("Miguel Heitor Silva Oliveira");
        System.out.println(""); //quebra de linha
    }
   
    public static void Questao1() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Espanha"); // resposta correta
        alternativas.add("Alemanha");
        alternativas.add("Brasil");
        alternativas.add("Belgica");
        alternativas.add("Russia");
        System.out.println("--------------------------------------");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Qual time foi campeâo da copa do mundo em 2010?");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
            System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Espanha")) {
                        System.out.println("Resposta correta!");
                        System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Espanha!");
                         System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Espanha")) {
                        System.out.println("Resposta correta!");
                         System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Espanha!");
                        System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Espanha")) {
                        System.out.println("Resposta correta!");
                         System.out.println("--------------------------------------");
                        
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Espanha!");
                        System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Espanha")) {
                        System.out.println("Resposta correta!");
                     System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Espanha!");
                        System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Espanha")) {
                        System.out.println("Resposta correta!");
                        System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Espanha!");
                        System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente!");
            }
        } while (acertou);
    }
   
    public static void Questao2() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Klose"); // resposta correta
        alternativas.add("Tomas Muller");
        alternativas.add("Neymar");
        alternativas.add("Messi");
        alternativas.add("Cristiano Ronaldo");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Quem foi o artilheiro da copa do mundo de 2014?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
            System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Klose")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Klose!");
                                System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Klose")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Klose!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Klose")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Klose!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Klose")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Klose!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Klose")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Klose!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao3() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Russia"); // resposta correta
        alternativas.add("Catar");
        alternativas.add("Brasil");
        alternativas.add("Espanha");
        alternativas.add("Mexico");
        
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Qual país foi a sede da copa do mundo de 2018?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
            System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Russia")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Russia!");
                                System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Russia")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Russia!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Russia")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Russia!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Russia")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Russia!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Russia")) {
                        System.out.println("Resposta correta!");
                                System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Russia!");
                                System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao4() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Não foi convocado!"); // resposta correta
        alternativas.add("11");
        alternativas.add("10");
        alternativas.add("4");
        alternativas.add("21");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Qual número Coutinho usou na copa do mundo de 2014? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Não foi convocado!")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Não foi convocado!");
                           System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Não foi convocado!")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Não foi convocado!");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Não foi convocado")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Não foi convocado!");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Não foi convocado")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Não foi convocado!");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Não foi convocado")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Não foi convocado!");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao5() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("32"); // resposta correta
        alternativas.add("22");
        alternativas.add("42");
        alternativas.add("52");
        alternativas.add("12");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Quantos países participam de uma copa do mundo?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("32")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: 32!");
                           System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("32")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                         System.out.println("A resposta correta seria: 32!");
                            System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("32")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: 32!");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("32")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                         System.out.println("A resposta correta seria: 32!");
                            System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("32")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                         System.out.println("A resposta correta seria: 32!");
                            System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao6() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("1970"); // resposta correta
        alternativas.add("1968");
        alternativas.add("1998");
        alternativas.add("2002");
        alternativas.add("1930");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Quando o Brasil ganhou sua terceira copa do mundo? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("1970")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                         System.out.println("A resposta correta seria: 1970! ");
                            System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("1970")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: 1970! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("1970")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: 1970! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("1970")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: 1970! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("1970")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: 1970! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao7() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Catar"); // resposta correta
        alternativas.add("França");
        alternativas.add("Uruguai");
        alternativas.add("Argentina");
        alternativas.add("Inglaterra");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +", Qual país sera sede da proxima copa do mundo? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Catar")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Catar! ");
                           System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Catar")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Catar! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Catar")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Catar! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Catar")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Catar! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Catar")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Catar! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao8() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("1x0"); // resposta correta
        alternativas.add("2x1");
        alternativas.add("3x0");
        alternativas.add("Disputa de penâltis");
        alternativas.add("4x3");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +",Qual foi o resultado da final entra Alemanha e Argentina na copa do mundo de 2014? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("1x0")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                          System.out.println("A resposta correta seria: 1x0! ");
                             System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("1x0")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                            System.out.println("A resposta correta seria: 1x0! ");
                               System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("1x0")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                            System.out.println("A resposta correta seria: 1x0! ");
                               System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("1x0")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                            System.out.println("A resposta correta seria: 1x0! ");
                               System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("1x0")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                            System.out.println("A resposta correta seria: 1x0! ");
                               System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao9() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Brasil"); // resposta correta
        alternativas.add("Argentina");
        alternativas.add("França");
        alternativas.add("Alemanha");
        alternativas.add("Suiça");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +",Qual é o país que mais venceu a copa do mundo? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Brasil")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                            System.out.println("A resposta correta seria: Brasil! ");
                               System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Brasil")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Brasil! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Brasil")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Brasil! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Brasil")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Brasil! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Brasil")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Brasil! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
   
    public static void Questao10() {
        Scanner input = new Scanner(System.in);
        boolean acertou = true;

        List alternativas = new ArrayList();
        alternativas.add("Materazzi"); // resposta correta
        alternativas.add("Ronaldo");
        alternativas.add("Maldini");
        alternativas.add("Cristiano Ronaldo");
        alternativas.add("Sergio Ramos");
       
        do {
            Collections.shuffle(alternativas);
           
            System.out.println(nome +",Qual foi o jogador que recebeu uma cabeçada de Zidane na copa de 2006? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));
              System.out.println("--------------------------------------");
            System.out.print("Escolha uma alternativa: ");
            String resposta = input.next();
           
            resposta = resposta.substring(0, 1).toUpperCase();
           
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Materazzi")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Materazzi! ");
                           System.out.println("--------------------------------------");
                        ErroPontos += 10;
                    }
                    acertou = false;
                    break;
                   
                case "B":
                    if (alternativas.get(1).equals("Materazzi")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Materazzi! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "C":
                    if (alternativas.get(2).equals("Materazzi")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Materazzi! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "D":
                    if (alternativas.get(3).equals("Materazzi")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Materazzi! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                    }
                    acertou = false;
                    break;
               
                case "E":
                    if (alternativas.get(4).equals("Materazzi")) {
                        System.out.println("Resposta correta!");
                           System.out.println("--------------------------------------");
                        Pontos +=10;
                    } else {
                        System.out.println("Resposta incorreta!");
                        System.out.println("A resposta correta seria: Materazzi! ");
                           System.out.println("--------------------------------------");
                        ErroPontos +=10;
                       
                    }
                    acertou = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (acertou);
    }
}

