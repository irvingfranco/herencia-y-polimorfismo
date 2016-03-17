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
public class basketball extends deportes {
    String basketbolista;
    String estadio;
    String balondebasket;
    public basketball(String cancha,String arbitros,String basketbolista, String estadio, String balondebasket){
        super(cancha,arbitros); 
    }
    public void setbasketbolista( String basketbolista){
        this.basketbolista = basketbolista;
    }
    public void setestadio(String estadio){
         this.estadio = estadio;
    }
    public void setbalondebasket(String balondebasket){
         this.balondebasket = balondebasket;
    }
    public String getbasketbolista(){
        return this.basketbolista;
    }
    public String getestadio(){
        return this.estadio;
    }
    public String getbalondebasket(){
        return this.balondebasket;
    }
}
