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
public class c_dashboard {
    v_dashboard view;
    
     public c_dashboard(v_dashboard view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.keluar(new tbkeluar());
       
       
    }

    private  class tbkeluar implements ActionListener {

//        public tbkeluar() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_login login = new controller.c_login(new v_login());
            view.setVisible(false);
        }
    }
}
