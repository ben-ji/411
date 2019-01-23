/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authenticationserver411_jennings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ben_j
 */
public class Client_411_Jennings {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is a simple echo CLIENT for IST 411");
        
        try {
        System.out.println("Waiting for connection.....");
        InetAddress localAddress = InetAddress.getLocalHost();

        try (Socket clientSocket = new Socket(localAddress, 6000);
                    PrintWriter out = new PrintWriter(
                        clientSocket.getOutputStream(), true);
                    BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                        clientSocket.getInputStream()))) {
            
            System.out.println("Connected to server");
    
            Scanner scanner = new Scanner(System.in);
            while (true) {
            System.out.print("Enter text: ");
            String inputLine = scanner.nextLine();
            if ("quit".equalsIgnoreCase(inputLine)) {
                break;
            }
        out.println(inputLine);
        String response = br.readLine();
        System.out.println("Server response: " + response);
            }
        }
        } catch (IOException ex) {
        // Handle exceptions
    }
}
}
