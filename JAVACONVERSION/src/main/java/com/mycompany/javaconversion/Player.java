/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaconversion;

/**
 *
 * @author ednal
 */
public class Player // PUBLIC player class 
{

       //1. Create a class, Player
    //Fields
    //String name
    //int number
    //Make sure to create a constructor and properties
    
    
    String _name; 
    int _number; 

//CONSTRUCTOR 
        public Player(String _name, int _number) {
        this._name = _name;
        this._number = _number;
    }
        
         public void setNumber(int _number) {
          this._number = _number;
    }

        
    //PROPERTIES: // PROPERTIES TO ACCESS THESE CONTENTS . SET & GET 
        
        public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getNumber() {
        return _number;
    }
    
    public void setInt(int _number){
        this._number = _number;
    }
    
    
    
  

    @Override
    public String toString() { // TO STRING TO DISPLAY PLAYER NAME & NUMBER 
        return "Player: " + _name + "#: " + _number; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
             
    }
    
    
}
