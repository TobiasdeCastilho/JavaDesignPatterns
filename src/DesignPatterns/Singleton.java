package DesignPatterns;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tobias
 */
public class Singleton {
  private static Singleton instance = null;
  
  public static Singleton getInstance(){
    if(instance == null)
      instance = new Singleton();
    return instance;
  }
}
