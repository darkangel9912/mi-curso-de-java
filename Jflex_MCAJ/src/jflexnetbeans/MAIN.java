/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflexnetbeans;

import java.io.File;

/**
 *
 * @author darka
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String path ="C:/Users/darka/Documents/NetBeansProjects/Jflex_MCAJ/src/jflexnetbeans/lexer.flex";
        generarLexer(path);
        */
        interfaz mInterfaz = new interfaz();
        mInterfaz.setVisible(true);
    }
    
    public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
    }
}
