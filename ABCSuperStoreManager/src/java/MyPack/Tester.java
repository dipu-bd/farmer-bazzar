/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

/**
 *
 * @author DELL
 */
public class Tester {
    public static void main(String args[]){
        DatabaseConnector dc = new DatabaseConnector();
        dc.setConnectionWithOracle();
    }
}
