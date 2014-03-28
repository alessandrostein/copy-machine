/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alessandrostein
 */
public abstract class DecoratorWrite extends AbstractWrite{
    
    protected AbstractWrite abswrite;
    
    public DecoratorWrite(AbstractWrite abswrite){
        this.abswrite = abswrite;
    }
    
 
}
