package desperatefantasy;

public class Arciere extends Combattente{
static Arciere g1;
static Combattente g2;
    
 public Arciere(){
 int salute = 80;
   int energia = 60;
   int armatura = 5; 
   int att_base_min = 8;
   int att_base_max = 12;
   int danno_spec_min = 10;
   int danno_spec_max = 30;
   int costo_speciale = 20;
   int danno_super = 0;
   int costo_super = 0;
   int danno_speciale_min = 10;
   int danno_speciale_max = 30;
 
 
 }
    
  static void AttBase(){
    int val_att_base = 8 + (int)(Math.random()* 20);
    g2.salute = g2.salute - val_att_base + g2.armatura;
    }
    
    static void AttSpeciale(){
    int val_att_spec = 10 + (int)(Math.random()*40);
    g2.salute = g2.salute - val_att_spec + g2.armatura;
    g1.energia = g1.energia - g1.costo_speciale;
    }
    
    static void AttSuper(){
    g1.energia = g1.energia + 15;    
    g2.salute = g2.salute;
    g1.energia = g1.energia;
    }
    
    static void Fuga(){
     g1.salute = 0;
     g1.energia = 0;
    }
    
}
