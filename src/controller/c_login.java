/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_login;
import view.v_dashboard;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_login {
    v_login view;
    
    public c_login(v_login view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.masuk(new tbmasuk());
        
    }

    private class tbmasuk implements ActionListener {

//        public tbmasuk() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_dashboard dashboard = new controller.c_dashboard(new v_dashboard());
            view.setVisible(false);
        }
    }
}
