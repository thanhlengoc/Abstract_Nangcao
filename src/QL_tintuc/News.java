/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_tintuc;

/**
 *
 * @author ThanhLe
 */
import QL_tintuc.INews;
import java.io.*;
import java.util.*;

public class News implements INews {
    private int ID;
    private String Title;
    private String PublishDay;
    private String Auth;
    private String Content;
    private float AverageRate;
    int RateList[] = new int[3];
    
    public News() {}
    
    public News(int ID, String title, String publishday, String auth, String content, float averagerate){
        this.ID = ID;
        this.Title = title;
        this.PublishDay = publishday;
        this.Auth = auth;
        this.Content = content;
        this.AverageRate = averagerate;
    } 
    
    @Override
    public void Display(){
        System.out.println("ID: "+getID());
        System.out.println("Title: "+ getTitle());
        System.out.println("PublishDay: "+ getPublishDay());
        System.out.println("Auth: "+ getAuth());
        System.out.println("Content: "+ getContent());
        System.out.println("AvegrageRate: "+ AverageRate());
    }
    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getTitle(){ return this.Title; }
    
    public void setTitle(String Title){ this.Title = Title; }
    
    public void setPublishDay(String PublishDay){ 
        this.PublishDay=PublishDay;
    }
    public String getPublishDay() {
        return this.PublishDay;
    }
    public void setAuth(String Auth){this.Auth=Auth;}
    
    public String getAuth(){return this.Auth;}
    
    public void setContent(String Content){this.Content=Content;}
    
    public String getContent(){ return this.Content; }
    
    public float AverageRate(){
        return this.AverageRate;
    }
    
    public void Calculator(){
        this.AverageRate = (RateList[0]+RateList[1]+RateList[2])/3;
    }
    
    static void Nhap(News ne) throws IOException{
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);
        System.out.print("Nhap Title: ");
        ne.Title = br.readLine();
        System.out.print("Nhap PublishDay: ");
        ne.PublishDay = br.readLine();
        System.out.print("Nhap Author: ");
        ne.Auth = br.readLine();
        System.out.print("Nhap Content: ");
        ne.Content = br.readLine();
        System.out.print("Nhap vao 3 danh gia: ");
        for (int j=0; j<3; j++)
            ne.RateList[j] = br.read();
    }
    
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        ArrayList<News> listNews = new ArrayList<News>();
        do {
            System.out.print("Nhap 1-Insertnews, 2-viewListnews, 3-AverageRate, 4-Exit: ");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("1-Insertnews");
                    News n1 = new News();
                    Nhap(n1);
                    listNews.add(n1); 
                    break;
                case 2:
                    System.out.println("2-viewListnews");
                    for(int i=0; i<listNews.size(); i++){
                        News n2 = listNews.get(i);
                        n2.Display();
                    }
                    break;
                case 3:
                    System.out.println("3-AverageRate");
                    for(int j=0; j<listNews.size(); j++){
                        News n2 = listNews.get(j);
                        n2.Calculator();
                        n2.Display();
                    }
                    break;
                default:
                    System.out.println("Exit");
                    cont = false;
                    break;
            }
        } while (cont);
        System.out.println("Size of listNews: "+listNews.size());
        

    }
}
