
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alessandrostein
 */
public class Read implements IRead {

    @Override
    public Clipboard read() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String text = "Texto lido";
        StringSelection selection = new StringSelection(text);
        clipboard.setContents(selection, null);
        
        return clipboard;
    }

}
