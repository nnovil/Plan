/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan;

/**
 *
 * @author Noville
 */
public class Stream implements IPlan{
    
    String name = "Stream";
    float cost;
    
    @Override
    public float getCost() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.cost;
    }

    @Override
    public void setCost(float cost) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.cost = cost;
    }
    
    @Override
    public String getName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.name;
    }
    
    @Override
    public String toString(){
        return "Stream "+this.cost;
    }
     @Override
    public boolean equals(Object obj){
        boolean retVar = false;
        if(obj!=null && obj instanceof Stream){
            retVar = true;        
        }
        return retVar;
    }
}
