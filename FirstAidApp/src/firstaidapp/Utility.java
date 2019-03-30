/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstaidapp;

/**
 *
 * @author up839921
 */
public class Utility {

    Settings s = new Settings();
    
    
    public void Deuteranopia() {
        //m.DeuteranopiaColours.setSelected(true);
        Menu.DefaultColoursRadio(false);
        Menu.DeuteranopiaColoursRadio(true);
        Menu.ProtanopiaColoursRadio(false);
        Menu.TritanopiaColoursRadio(false);
    }
    
     public void SettingsVisibility() {   
        s.setVisible(true);
    }   
}
