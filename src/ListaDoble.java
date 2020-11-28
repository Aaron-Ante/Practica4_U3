/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class ListaDoble {
    protected Nodo ini = null;
    protected Nodo fin = null;
    
     public boolean Insertar(char v, int p){
        Nodo temp = new Nodo(v,p);
        if(temp==null){//cola llena
          return false; // si temp continua en null significa que lista llena  
        }
        if(ini == null && fin ==null){ // caso 2 el nuevo nodo es el unico
            ini =fin=temp;
            return true;
        }
         if(temp.prio > ini.prio){// caso 3.1  si en nuevo se enlaza con ini
         ini.ant = temp;
         temp.sig = ini;
         ini = temp;
         return true;
         }     
         if(temp.prio<=fin.prio){//caso 3.1 si el nuevo se enlaza despues de fin 
          fin.sig = temp;
          temp.ant = fin;
          fin = temp;
          return true;
             
         }
         Nodo t2=null;
            for( t2 = fin.ant; temp.prio>t2.prio; t2 =t2.ant){ // caso 4
         //if temp2 se queda  en null se queda en el puntero
            
             
            
        }
       
         t2.sig.ant = temp;
         temp.sig = t2.sig;
         t2.sig = temp;
         temp.ant = t2;
        
        return true;
    }
     
    
    public boolean Eliminar(){
        // vacia
        if(ini==null && fin ==null){
            return false;
        }
        //solo hay 1 elemento 
        if(ini ==fin && fin!=null){
            fin=ini=null;
            return true;
        }
        
        Nodo temp = ini.sig;
        temp.ant = null;
        ini.sig = null;
        ini = temp;
        return true;
        
       
    }
    
    
    public boolean eliminar(char valorAEliminar){
        //lista vacia
        if(ini ==null && fin ==null){
        return false;
        }
        //2do caso 1 solo nodo
        if(ini==fin &&ini !=null && ini.valor ==valorAEliminar){
        ini =fin=null;
        return true;
        }
        //valor se encuentre en ini
        if(ini.valor == valorAEliminar){
            return Eliminar();
        }
        if(ini.valor == valorAEliminar){
            Nodo temp = fin.ant;
            temp.sig=null;
            fin.ant = null;
            fin = temp;
            return true;       
        }
        
        // 4to caso el valor a eliminar esta en medio o al final
        for(Nodo temp =ini.sig; temp!=null; temp =temp.sig){
        if(temp.valor == valorAEliminar){
        temp.ant.sig = temp.sig;
        temp.sig.ant = temp.ant;
        temp.ant = null;
        temp.sig = null;
            return true;
        }
       }
        
        
        
        //si llega hasta aqui significa que no se encontro coincidencia 
        return false;
        }
    
    
    
    public String mostrar(){
        if(ini ==  null && fin == null){
            return "ListaVacia";
        }
        String cad="";
        for(Nodo temp = ini; temp!= null; temp = temp.sig){
          cad+=temp.valor+"->";  
        }
        return cad;
    }
     public String Mostrar(Nodo temp){
        if (temp == null){
            return "";
           
        }
        
         return temp.valor +"->"+Mostrar(temp.sig);
         
    }
     
      public Nodo getIni(){
        return ini;
    }
    
    public Nodo getFin(){
        return fin;
    }
    }
