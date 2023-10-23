/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meilizheng.consoleconversion;

/**
 *
 * @author belle
 */
public class Player {

//Field
    private String _name;
    private int _number;   

//Constructor
public Player(String playerName, int playerNumber)
{   _name = playerName;
    _number = playerNumber;
}

//Property
    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getNumber() {
        return _number;
    }
    
    public void setNumber(int _number) {
        this._number = _number;
    }
    
    public String playerName(){
        return _name;
    }

    @Override
    public String toString() {
        return playerName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    } 
}
