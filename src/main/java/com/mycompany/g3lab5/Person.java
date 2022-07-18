/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3lab5;

/**
 *
 * @author Spay
 */
public class Person {
    
    //Instance variables
    private String name;
    private String address;
    
//Constructor - กำหนดค่าให้กับ Object ในตอนที่สร้าง Object
    
    public Person (String name,String address){
        
        this.name = name;
        this.address = address;
        
    }
    //Accessor Method - เข้าถึงข้อมูล
    public String getName () {
            return name;
    }
    public String  getAddress () {
        return address;
    }
    //Mutator Method -เข้าถึงและเปลี่ยนแปลง
    public void setAddress (String address){
        this.address = address;
    }
    public String toString() {

        return String.format("Person[name=%s, address=%s]", name, address);
    }
}
