
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alessandrostein
 */
public class TestCopyMachine {

    /**
     * @param args the command line arguments
     * @throws java.awt.datatransfer.UnsupportedFlavorException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws UnsupportedFlavorException, IOException {
        // TODO code application logic here
        Read r = new Read();
        
        Clipboard cp = r.read();
        Transferable ps = cp.getContents(null);

        Write w1 = new Write();
        Write w2 = new Write();
        
        Write my = new Write();
        my.addWrite(w1);
        my.addWrite(w2);
        my.write((String) ps.getTransferData(DataFlavor.stringFlavor));
        
        
    }
    
}
