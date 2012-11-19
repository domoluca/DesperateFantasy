
package desperatefantasy;

import java.io.*;

public class Gestore extends Thread{

    public Gestore(){
    super();
    
    
    
    }
    
    public void run(){
    
        //Lettura del nome dell'utente
        BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
            String nome_utente = "player 1";
            System.out.println("Qual'è il tuo nickname??: ");
            try{
              nome_utente = br.readLine();
            } catch(Exception ioe)
            {System.out.println(ioe);}
            System.out.println("il tuo nickname è: "+nome_utente);
            
            SceltaCombattente();
            Scelta_pc();
            
            
    }
    
    //L'utente sarà il thread g1
    public void SceltaCombattente(){
         String personaggio = "";
            
         BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
            System.out.println("Qual'è il personaggioo che vuoi scegliere??"+
                               " puoi sceglere tra mago, guerriero o arciere: ");
            try{
              personaggio = br.readLine();
            } catch(Exception ioe)
            {System.out.println(ioe);}
           
            if (personaggio.equals("mago")){
                Mago g1 = new Mago();
                g1.start();
                System.out.println("hai creato un mago");}
            else if (personaggio.equals("guerriero")){
                Guerriero g1 = new Guerriero();
                g1.start();
                System.out.println("hai creato un guerriero");}
            else if (personaggio.equals("arciere")){
                Arciere g1 = new Arciere();
                g1.start();
                System.out.println("hai creato un' arciere");}
            else System.out.println("scelta illegale"); 
            
    }
    
    //Metodo per creare un combattente in maniera casuale
    // per il computer
    // il thread personaggio del computer sarà sempre g2
    public void Scelta_pc(){
        
        int rndm = (int)(Math.random() * 2);
        if(rndm == 0){
        Mago g2 = new Mago();
        g2.start();
        System.out.println("il PC ha creato un mago");}
        else if(rndm == 1){
        Guerriero g2 = new Guerriero();
        g2.start();
        System.out.println("il PC ha creato un guerriero");}
        else if(rndm == 2){
        Arciere g2 = new Arciere();
        g2.start();
        System.out.println("il PC ha creato un arciere");}
        }
    
    public void Combattimeno(){
        String mossa="";
        BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
            System.out.println("Qual'è la mossa che vuoi eseguire? ");
            try{
              mossa = br.readLine();
            } catch(Exception ioe)
            {System.out.println(ioe);}
       if (mossa.equals("attacco base") && g1.salute > 0){ 
            g1.AttBase();
            }
       else if (mossa.equals("attacco speciale") && g1.salute > 0){
            g1.AttSpeciale();
            }
       else if (mossa.equals("attacco super") && g1.salute > 0){
           g1.AttSuper();
            }
       else if (mossa.equals("fuga")){
           g1.Fuga();
            }
       else System.out.println("mossa non valida");
           
    
    
    }
       
}
    
                


