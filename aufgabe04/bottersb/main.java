/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchaos_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author bottersb
 */
public class CodingChaos_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        double geld = Double.parseDouble(args[0]);
        double preis = Double.parseDouble(args[1]);
        
        int bier = (int) (geld / preis);
        int ebenen = 0;
        if(bier >= 1) {
            ebenen++;
            bier--;
        } else {
            return;
        }
        
        while(bier > 0){
            if(((int) (Math.pow(3, ebenen))) < bier) {
                bier = bier - (int) (Math.pow(3, ebenen));
                ebenen++;
            } else {
                break;
            }
        }
        
        System.out.println(ebenen);
    }
}
