/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaypolimorfism;

/**
 *
 * @author casa
 */
public class Herenciaypolimorfism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        futbol fut = new futbol("","","","","");
        fut.setcancha("futbol");
        fut.setfutbolistas("messi");
        fut.setestadio("camp nou");
        fut.setarbitros("pierluigi collina");
        fut.setbalondefutbol("nike");
        
        System.out.println();
        System.out.println("los datos de futbol son: ");
        System.out.println("la cancha es de " + fut.getcancha());
        System.out.println("el futbolista es " + fut.getfutbolistas() );
        System.out.println("el estadio es " + fut.getestadio());
        System.out.println("el arbitro es " + fut.getarbitros());
        System.out.println("el balon de futbol es " +fut.getbalondefutbol());
        
        basketball basket = new basketball(""," ","","","");
        basket.setcancha("basketball");
        basket.setbasketbolista("curry");
        basket.setestadio("oracle arena");
        basket.setarbitros("steve javie");
        basket.setbalondebasket("spalding");
        
        System.out.println();
        System.out.println("los datos de basketball son: ");
        System.out.println("la cancha es de " + basket.getcancha());
        System.out.println("el basketbolista es "+basket.getbasketbolista());
        System.out.println("el estadio es " + basket.getestadio());
        System.out.println("el arbitro es " + basket.getarbitros());
        System.out.println("el balon es " + basket.getbalondebasket());
        
        
        natacion nat = new natacion("","", "", "");
        nat.setcancha("alberca");
        nat.setnadadores("michael phelps");
        nat.setarbitros("alberto cano");
        nat.setalberca(" alberca olimpica de atenas");
      
        
        System.out.println();
        System.out.println("los datos de natacion son :");
        System.out.println("la cancha es una " + nat.getcancha());
        System.out.println("el nadador es "+nat.getnadadores());
        System.out.println("la alberca es " + nat.getalberca());
        System.out.println("el arbitro es " + nat.getarbitros());
        
        
        
        // TODO code application logic here
        
    }
    
}
