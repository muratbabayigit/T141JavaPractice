package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class M05_ArrayLists {

    /*
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {


        ArrayList<String>listIsimler=new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
      //ArrayList<String>listIsimler=new ArrayList<String>(List.of("Ali","Veli","Ayse","Fatma","Omer"));

        ArrayList<String> isimler=new ArrayList<String>();

        System.out.println(listIsimler);

        for (String a: listIsimler) {
            if (!a.toLowerCase().contains("a")){
                isimler.add(a);
            }

        }
        System.out.println(isimler);
    }



}
