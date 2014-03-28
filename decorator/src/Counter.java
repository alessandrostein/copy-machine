/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alessandrostein
 */
public class Counter extends DecoratorWrite{
    
    static int count = 0;

    public Counter(AbstractWrite abswrite) {
        super(abswrite);
    }

    @Override
    public void write(String msg) {
        System.out.println(msg);
        count ++;
        System.out.println("Impressões: " + count);
        
    }
    
}
