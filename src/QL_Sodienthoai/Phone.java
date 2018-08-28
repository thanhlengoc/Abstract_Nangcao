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
public abstract class Phone {
    protected String name;
    protected String phone;
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();
    abstract void Display();
}
