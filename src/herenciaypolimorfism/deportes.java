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
public abstract class deportes implements ideportes  {
    String cancha;
    String arbitros;
    
    
    public  deportes(String cancha, String arbitros ){
       
    }
    public void setcancha (String cancha){
        this.cancha = cancha;
    }
    
    public void setarbitros (String arbitros){
        this.arbitros = arbitros;
    }
    
    public String getcancha(){
        return this.cancha;
        
    }
    public String getarbitros(){
        return this.arbitros;
    }
   
    @Override
    public void nuevacancha(){
    
    System.out.println("se asiganara una nueva cancha por dificultades en la asignada previamente");        
    }
    @Override
    public void nuevoarbitro(){
        
        System.out.println(" se asiganara un nuevo arbitro");
}
    
}
