
import java.util.Scanner;
import controller.TextAnalyzer;
import controller.TextController;
import model.TextView;
import view.menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bravo
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        TextController Menu =new TextController();
        Menu.run();
    }
}
