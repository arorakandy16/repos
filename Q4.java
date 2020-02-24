package Collections;

//Write a program to sort HashMap by value.

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        ArrayList<String> ls=new ArrayList<String>();
        hm.put(1,"abc");
        hm.put(2,"cde");
        hm.put(3,"bcd");
        hm.put(4,"ccc");
        for(int i=1;i<hm.size()+1;i++){
            ls.add(hm.get(i));
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
}