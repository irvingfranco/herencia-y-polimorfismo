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
public class natacion extends deportes {
    String nadadores;
    String alberca;
    public natacion(String cancha,String arbitros, String nadadores, String alberca){
        super(cancha, arbitros);
        this.nadadores = nadadores;
        this.alberca = alberca;
    }
    public void setnadadores(String nadadores){
        this.nadadores = nadadores;
    }
    public void setalberca(String alebrca){
        this.alberca = alberca;
    }
        public String getnadadores(){
        return this.nadadores;
                }
        public String getalberca(){
            return this.alberca;
        }
}
