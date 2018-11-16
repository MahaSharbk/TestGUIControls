/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgui;

/**
 *
 * @author ENG Maha
 */
public enum EmpType {
    //Enum Values
    Full_Time(1),
    Part_Time(2);
    
    private  int numVal;
    
    //Constructor
     EmpType(int numVal){
        this.numVal=numVal;
    }
    //Getter
    public int getNumVal(){
        return this.getNumVal();
    }
     
    //Method to get enum val (full_time, part_time,...) by passing numVal
    public static EmpType getValue(int numVal) {
      for (EmpType l : EmpType.values()) {
          if (l.numVal == numVal) return l;
      }
      //if parameter not exists thow exception
      throw new IllegalArgumentException("Leg not found. Amputated?");
   }
}
