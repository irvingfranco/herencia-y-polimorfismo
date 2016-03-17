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
public class futbol extends deportes {
    String futbolistas;
    String estadio;
    String balondefutbol;
    
    public futbol(String cancha,String arbitros, String futbolistas,String estadio, String balondefutbol){
        super(cancha, arbitros);
        this.futbolistas = futbolistas;
        this.estadio= estadio;
        this.balondefutbol = balondefutbol;
                
    } 
    public void setfutbolistas(String futbolistas){
        this.futbolistas = futbolistas;
    }
    public void setestadio(String estadio){
        this.estadio = estadio;
    }
    public void setbalondefutbol( String balondefutbol){
        this.balondefutbol = balondefutbol;
    }
    public String getfutbolistas(){
        return this.futbolistas;
    }
    public String getestadio(){
        return this.estadio;
    }
    public String getbalondefutbol(){
        return this.balondefutbol;
    }
}
