import java.util.Scanner;
import java.lang.Thread;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    
    int valor;
     System.out.println("Como funciona o método 4-7-8?\r\n\n" + //
                 "O método 4-7-8 não requer nenhum equipamento ou configuração específica, mas quando você está aprendendo o exercício inicialmente, deve sentar-se com as costas retas, de acordo com Weil. Praticar em um lugar calmo e tranquilo pode ajudar, disse Rebecca. Depois de pegar o jeito, você pode usar a técnica enquanto está deitado na cama.\r\n" + //
                 "\r\n" + //
                 "Durante toda a prática, coloque a ponta da língua contra a crista de tecido atrás dos dentes superiores da frente, enquanto você expira pela boca ao redor da língua. Em seguida, siga estes passos, de acordo com Weil:\r\n" + //
                 "\r\n" + //
                 "1-Expire completamente pela boca, fazendo um som de whoosh\r\n" + //
                 "2-Feche a boca e inspire silenciosamente pelo nariz até uma contagem mental de quatro\r\n" + //
                 "3-Prenda a respiração contando até sete\r\n" + //
                 "4-Expire pela boca, fazendo um som de whoosh contando até oito\r\n" + //
                 "5-Repita o processo mais três vezes para um total de quatro ciclos respiratórios\r\n" + //
                 "6-Manter a proporção de quatro, depois sete e oito contagens é mais importante do que o tempo que você gasta em cada fase, de acordo com Weil \n");


    System.out.println("Vamos começar? \n Digite: \n 1- sim \n 2-não");
    valor= entrada.nextInt();
    
    
    for(int b = 1;b<=4;b++){

      if(valor == 1){

      System.out.println("Expire completamente pela boca, fazendo um som de whoosh");
  try { Thread.sleep(4000); } catch (InterruptedException e1) { }
    


  System.out.println("Feche a boca e inspire silenciosamente pelo nariz com a contagem");
   try { Thread.sleep(4000); } catch (InterruptedException e1) { }




        
          for (int i = 4; i>=0; i--){
        
        
     System.out.println(+i);
        
     try { Thread.sleep(1000); } catch (InterruptedException e1) { }
    }
        
          System.out.println("Pronto!");
    }
 




     try { Thread.sleep(3000); } catch (InterruptedException e1) { }

    System.out.println("Prenda a respiração até acabar a contagem de 7 segundos");

   try { Thread.sleep(3000); } catch (InterruptedException e1) { }








          for (int h = 7; h>=0; h--){
        
        
     System.out.println(+h);
        
     try { Thread.sleep(1000); } catch (InterruptedException e1) { }
    
        
    }



     System.out.println("Pronto!");
 try { Thread.sleep(4000); } catch (InterruptedException e1) { }





 System.out.println("Expire pela boca, fazendo um som de whoosh pela contagem de 8 segundos");
  try { Thread.sleep(4000); } catch (InterruptedException e1) { }







   for (int i = 8; i>=0; i--){
        
        
     System.out.println(+i);
        
     try { Thread.sleep(1000); } catch (InterruptedException e1) { }
    
      
    }


     System.out.println("Pronto!");
      try { Thread.sleep(4000); } catch (InterruptedException e1) { }


      System.out.println("Sessão " + b +"/4 concluido");

       System.out.println("\n");
    }

    }
 


    
}