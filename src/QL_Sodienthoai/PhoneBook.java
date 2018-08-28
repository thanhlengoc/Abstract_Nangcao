/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_Sodienthoai;

/**
 *
 * @author ThanhLe
 */
import QL_Sodienthoai.Phone;
import java.util.*;

public class PhoneBook extends Phone {
    ArrayList<Phone> PhoneList = new ArrayList<Phone>();
    
    public PhoneBook(){}
    
    public PhoneBook(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    public void insertPhone(String name, String phone){
        if(PhoneList.contains(name) == false){
            PhoneBook pb = new PhoneBook(name, phone);
            PhoneList.add(pb);
            System.out.println("after insert: "+pb.name+" "+pb.phone);
        }
        for(Phone p : PhoneList)
            p.Display();
        System.out.println("Size cua PhoneList: "+PhoneList.size()); 
    }
    public void removePhone(String name){
        for(int i=0; i<PhoneList.size(); i++){
            //Object[] arr = PhoneList.toArray();
            Phone p = PhoneList.get(i);
            if(p.name == name){
                PhoneList.remove(p);
            }
        }
        System.out.println("Size cua PhoneList: "+PhoneList.size()); 
    }
    public void updatePhone(String name, String newPhone){
       for(int j=0; j<PhoneList.size(); j++){
            Phone p = PhoneList.get(j);
            if(p.name == name){
                p.phone = newPhone;
            }
            System.out.println("after update: "+p.name+" "+p.phone);
        }
    }
    public void searchPhone(String name){
        for(int z=0; z<PhoneList.size(); z++){
            Phone p1 = PhoneList.get(z);
            if(p1.name == name){
                System.out.println("Result: "+p1.name+" "+p1.phone);
            }          
        }
    }
    public void sort(){
        
    }
    
    public void Display(){
        System.out.println("Name: "+this.name+" phone: "+this.phone);
    }
      
}
