package day07;

import java.util.ArrayList;
import java.util.List;

public class M05_List {
    /*
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");

        System.out.println(list1);

        List<String> list2=new ArrayList<>();

        for (String a:list1) {
            if (!a.toLowerCase().contains("a")){
                list2.add(a);
            }

        }
        System.out.println(list2);
    }

}
