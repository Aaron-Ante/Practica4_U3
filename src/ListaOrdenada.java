/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class ListaOrdenada extends ListaDoble{
    public boolean Insertar(char v, int p){
        Nodo temp = new Nodo(v,p);
        if(temp==null){//cola llena
          return false; // si temp continua en null significa que lista llena  
        }
        if(ini == null && fin ==null){ // caso 2 el nuevo nodo es el unico
            ini =fin=temp;
            return true;
        }
       
        
        
         if(temp.valor < ini.valor){// caso 3.1  si en nuevo se enlaza con ini
         ini.ant = temp;
         temp.sig = ini;
         ini = temp;
         return true;
         
         }     
        
         if(temp.valor> fin.valor){//caso 3.1 si el nuevo se enlaza despues de fin 
          temp.ant = fin;
          fin.sig = temp;
          fin = temp;
          return true;
             
         } 
      
         Nodo t2 ;
            for( t2 = fin.ant; temp.valor<t2.valor; t2 =t2.ant){ // caso 4
         //if temp2 se queda  en null se queda en el puntero
            
           
            
        }
       
           t2.sig.ant = temp;
         temp.sig = t2.sig;
         t2.sig = temp;
         temp.ant = t2;
        
        return true;
    }
    
}
