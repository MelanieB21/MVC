/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import Controlador.ControladorMDB;
import pkgModelo.MDB;
import vista.FrmUsuarios;

/**
 *
 * @author lgnra
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MDB objModelo=new MDB();
        
        FrmUsuarios objVista=new FrmUsuarios();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
    
}
