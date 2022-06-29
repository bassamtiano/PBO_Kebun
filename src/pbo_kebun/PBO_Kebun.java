/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_kebun;

import pbo_kebun.gui.TanamanGUI;

/**
 *
 * @author bassamtiano
 */
public class PBO_Kebun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            TanamanGUI menugui = new TanamanGUI();
            menugui.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
