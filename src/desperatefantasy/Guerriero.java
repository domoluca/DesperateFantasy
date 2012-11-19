package desperatefantasy;


public class Guerriero extends Combattente {
static Guerriero g1;
static Combattente g2;   
    
public Guerriero(){
super();
    int salute = 100;
   int energia = 45;
   int armatura = 8; 
   int att_base_min = 10;
   int att_base_max = 15;
   int danno_speciale = 20;
   int costo_speciale = 15;
   int danno_super = 30;
   int costo_super = 20;
   
    }
  static void AttBase(){
    int val_att_base = 10 + (int)(Math.random()*25);
    g2.salute = g2.salute - val_att_base + g2.armatura;
    }
    
    static void AttSpeciale(){
    g2.salute = g2.salute - g1.danno_speciale + g2.armatura;
    g1.energia = g1.energia - g1.costo_speciale;
    }
    
    static void AttSuper(){
    g2.salute = g2.salute - g1.danno_super + g2.armatura;
    g1.energia = g1.energia - g1.costo_super;
    }
    
    static void Fuga(){
     g1.salute = 0;
     g1.energia = 0;
    }
    
    
    
}
