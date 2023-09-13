/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Map;
import java.util.Scanner;
import model.TextView;
import view.menu;

/**
 *
 * @author Bravo
 */
public class TextController extends menu<String> {
    private TextAnalyzer model;
    private TextView view;
    private Scanner sc;

    public TextController() {
        super("Word and Character Count PROGRAM", options);
        model = new TextAnalyzer(""); 
        sc = new Scanner(System.in);
        view = new TextView(sc); 

    }
    static String[] options = {"Word Count and Letter Count", "Exit"};
    

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:
                String inputText = view.getInput();
                model.setText(inputText);
                Map<String, Integer> wordResult = model.Wordcounts();
                Map<Character, Integer> charResult = model.countCharacters();
                view.displayWordResult(wordResult);
                view.displayCharResult(charResult);
                break;
            case 2:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid!");
        }
    }

    
}
