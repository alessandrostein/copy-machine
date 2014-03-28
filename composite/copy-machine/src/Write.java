
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alessandrostein
 */
public class Write extends AbstractWrite{
    
    protected ArrayList<AbstractWrite> writes;

    public Write(){
        writes = new ArrayList<AbstractWrite>();
    }
    
    @Override
    public void write(String msg) {
        System.out.println(msg);
        for (AbstractWrite arq: writes){
            arq.write(msg);
        }
    }
    
    public void addWrite(AbstractWrite arq){
        this.writes.add(arq);
    }
    
}
