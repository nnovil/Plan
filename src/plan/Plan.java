/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Noville
 */
public class Plan {

    /**
     * @param args the command line arguments
     */
    
    //List<User> users = new ArrayList();
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<User> users = new ArrayList();
        List<IPlan> plan;
        IPlan p;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("\n\n\nTo exit, enter an invalid choice.");
            int i;
            System.out.println("Choose a user");
            for(i=0; i<users.size(); i++){
                System.out.println(i+" "+users.get(i).getName());
            }
            System.out.println(i+" Add new user");
            
            i = sc.nextInt();
            if(i < users.size()){
                int userTracker = i;
                do{
                    System.out.println("\n\n\nTo exit, enter an invalid choice.");
                    System.out.println(users.get(userTracker));
                    System.out.println("Current plans");
                    plan = users.get(userTracker).getPlans();
                    for(int j=0; j<plan.size(); j++){
                        System.out.println(plan.get(j));
                    }
                    System.out.println("Choose an action");
                    System.out.println("1. Add Plan");
                    System.out.println("2. Delete Plan");
                    i = sc.nextInt();
                    
                    int tempInt;
                    
                    System.out.println("Choose a plan");
                    System.out.println("1. Text");
                    System.out.println("2. Voice Call");
                    System.out.println("3. Stream");
                    System.out.println("4. NBA");
                    tempInt = sc.nextInt();
                    
                    if(i == 1){
                        if(tempInt==1){
                            users.get(userTracker).addPlan(new Text());
                        }
                        else if(tempInt==2){
                            users.get(userTracker).addPlan(new VoiceCall());
                        }
                        else if(tempInt==3){
                            users.get(userTracker).addPlan(new Stream());
                        }
                        else if(tempInt==4){
                            users.get(userTracker).addPlan(new NBA());
                        }
                        else{
                            System.out.println("Enter a valid choice");
                            break;
                        }
                    }
                    else if(i == 2){
                        if(tempInt==1){
                            users.get(userTracker).deletePlan(new Text());
                        }
                        else if(tempInt==2){
                            users.get(userTracker).deletePlan(new VoiceCall());
                        }
                        else if(tempInt==3){
                            users.get(userTracker).deletePlan(new Stream());
                        }
                        else if(tempInt==4){
                            users.get(userTracker).deletePlan(new NBA());
                        }
                        else{
                            System.out.println("Enter a valid choice");
                            break;
                        }
                    }
                    else{
                            System.out.println("Enter a valid choice");
                            break;
                    }
                   
                    
                }while(true); 
               
            }
            else if(i == users.size()){
                System.out.println("What's your name?");
                users.add(new User(sc.next()));
            }
            else{
                System.out.println("Enter a valid choice");
                break;
            }
            
        }while(true);
    }
    
}
