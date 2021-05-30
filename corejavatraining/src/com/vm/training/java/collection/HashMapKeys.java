package com.vm.training.java.collection;
import java.util.HashMap;
import java.util.Set;
 
public class HashMapKeys {
     
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //adding key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}