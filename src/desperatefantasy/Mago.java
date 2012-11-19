package desperatefantasy;

public class Mago extends Combattente{
static Mago g1;
static Combattente g2;
   
public Mago(){
super();
   
   int salute = 60;
   int energia = 80;
   int armatura = 3; 
   int att_base_min = 5;
   int att_base_max = 10;
   int danno_speciale = 30;
   int costo_speciale_min = 10;
   int costo_speciale_max = 25;
   int danno_super = 0;
   int costo_super = 10; 
   
   
   System.out.println("è stato creato un mago");
    }
    
    static void AttBase(){
    int val_att_base = 5 + (int)(Math.random()*10);
    g2.salute = g2.salute - val_att_base + g2.armatura;
    }
    
    static void AttSpeciale(){
    g2.salute = g2.salute - g1.danno_speciale + g2.armatura;
    int costo_att_Spec = 10 + (int)(Math.random()*35);
    g1.energia = g1.energia - costo_att_Spec;
    }
    
    static void AttSuper(){
    g1.salute = g1.salute + 15;
    g1.energia = g1.energia - g1.costo_super;
    g2.salute = g2.salute;        
    }
    
    static void Fuga(){
     g1.salute = 0;
     g1.energia = 0;
    }
}
