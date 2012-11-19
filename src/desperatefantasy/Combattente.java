
package desperatefantasy;


public class Combattente extends Thread {
     public int salute; 
     public int energia;
     public int armatura; 
     public int att_base_min;
     public int att_base_max;
     public int danno_speciale;
     public int costo_speciale;
     public int danno_super;
     public int costo_super;
     
     public Combattente() {
     super();
     System.out.println("ciao, sono un combattente, la mia salute è: "+salute);
    
     }
}
