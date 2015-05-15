/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noville
 */
public class User {
    
    String name;
    List<IPlan> plan;
    float amountDue;

    public List<IPlan> getPlans(){
        return this.plan;
    }
    
    public User(String name) {
        this.name = name;
        amountDue = 0.0f;
        plan = new ArrayList();
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addPlan(IPlan p){
        boolean retVar = false;
        plan.add(p);
        amountDue += p.getCost();
        retVar = true;
        return retVar;
    }
    
    public float getCost(){
        return this.amountDue;
    }
    
    public boolean deletePlan(IPlan p){
        boolean retVar = false;
        for(int i=0; i<plan.size();i++){
            if(plan.get(i).equals(p)){
                plan.remove(i);
                retVar = true;
                break;
            }
        }
        return retVar;
    }
    
    @Override
    public String toString(){
        return "Hello "+this.name+"! You currently have "+plan.size()+" plans.";
    }
    
}
