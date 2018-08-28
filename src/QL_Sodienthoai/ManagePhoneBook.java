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
import QL_Sodienthoai.PhoneBook;
import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Phone ph = new PhoneBook();
        boolean cont = true;     
        do {
            System.out.print("Nhap 1-InsertPhone,2-removePhone,3-update,4-search,5-sort,6-exit: ");
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    ph.insertPhone("thanhle","01659293504");
                    break;
                case 2:
                    ph.removePhone("thanhle");                  
                    break;
                case 3:
                    ph.updatePhone("thanhle", "01769617737");
                    break;
                case 4:
                    ph.searchPhone("thanhle");
                    break;
                default:
                    System.out.println("Exit");
                    cont = false;
                    break;
            }
        } while (cont);
        
        
    }
}
