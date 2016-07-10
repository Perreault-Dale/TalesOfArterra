/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.view.StartMenuView;
import java.io.*;
/*
got to crazy!
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
*/
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dale
 */
public class TalesofArterra {
    
    private static Game game = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            TalesofArterra.inFile = new BufferedReader(new InputStreamReader(System.in));
            TalesofArterra.outFile = new PrintWriter(System.out, true);
            String filePath = "log.txt";
            TalesofArterra.logFile = new PrintWriter(filePath);
            StartMenuView startItUp = new StartMenuView();
            startItUp.display();
        } catch (Throwable te) {
            System.out.println("Exception: " + te.toString() + 
                    "\nCause: " + te.getCause() + 
                    "\nMessage: " + te.getMessage());
            te.printStackTrace();
        } 
        
        finally {
            try {
               
                if (TalesofArterra.inFile != null)
                    TalesofArterra.inFile.close();
           
                if (TalesofArterra.outFile != null)
                    TalesofArterra.outFile.close();
                
                if (TalesofArterra.logFile != null)
                    TalesofArterra.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
       }       
       
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        TalesofArterra.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TalesofArterra.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TalesofArterra.outFile = outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TalesofArterra.logFile = logFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TalesofArterra.inFile = inFile;
    }
    
}
