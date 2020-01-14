/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author tomal
 */
public class IDConverter {
    private Id IDStrategy ;

    public IDConverter(Id strategy) {
        IDStrategy = strategy;
    }
    
    public String getNextID(String type){
        String output;
        output = IDStrategy.getNewID(type);
        return output;
    }
    

}
