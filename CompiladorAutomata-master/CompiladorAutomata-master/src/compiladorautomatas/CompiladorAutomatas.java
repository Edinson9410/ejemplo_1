/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiladorautomatas;

import java.io.File;

/**
 *
 * @author anon
 */
public class CompiladorAutomatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:/Users/User/Downloads/CompiladorAutomata-master/CompiladorAutomata-master/src/compiladorautomatas/Lexer.flex";
        generarLexer(path);    
    }
    
    
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    
    
}
