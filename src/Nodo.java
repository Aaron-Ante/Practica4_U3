/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Nodo {
     char valor;
    Nodo sig;
    Nodo ant;
    int prio;
    
    public  Nodo(char v, int p){
        valor = v;
        sig = null;
        ant = null;
       prio= p;
    }
    
    
    
}
