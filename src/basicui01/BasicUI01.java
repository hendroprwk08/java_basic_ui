package basicui01;

import javax.swing.UIManager;

public class BasicUI01 {

    public static void main(String[] args) {
        //set style
        try { 
            //Berikut style form JFrame. Aktifkan salah satu
            
            //nimbus
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
            
            //metal
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
            
            //Motif
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); 
            
            //windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
                  
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        
        //menampilkan form
        FLatih01 f = new FLatih01();
        f.setVisible(true);
    }    
}
