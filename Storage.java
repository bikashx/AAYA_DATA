package com.collections.com;

import java.util.*;

/**
 * Created by bikash on 8/22/15.
 */
public class Storage {

    public static void main(String args[]) {
        //ArrayList
        List<String> meat = new ArrayList<String>();
        meat.add("Chicken");
        meat.add("Pork");
        meat.add("Buffalo");
        meat.add("Snake");

        for (String delicious : meat) {
            System.out.print(delicious + "  ");
        }
        meat.remove(1);
        System.out.println("");
        System.out.println("This is the removal of item");
        for(String rd:meat){
            System.out.print(rd +"  ");
        }
        System.out.println("");
        System.out.println("");
        //LinkedList
        System.out.println("This is the Linked List");
        List<Integer> list1 =new LinkedList<Integer>();
        list1.add(23);
        list1.add(34);
        list1.add(45);
        list1.add(55);
        for(Integer num:list1){
            System.out.print(num + "  ");
        }
        System.out.println();
        System.out.println("This is the removal of item from linked list");
        list1.remove(0);
        for(Integer rm:list1){
            System.out.print(rm + "  ");
        }
        System.out.println("");
        System.out.println("");
        // Set HashSet
        System.out.println("This is the Hash Set");
        Set<String> set1= new HashSet<String>();
        set1.add("java");
        set1.add("c++");
        set1.add(".net");
        for(String programmingLan:set1){
            System.out.print(programmingLan + "  ");
        }
        System.out.println("");
        System.out.println("This is the removal from HashSet");
        set1.remove("java");    //removing from the Hash set required the String or number object not on index
        for(String pr:set1){
            System.out.print(pr + " ");
        }
        System.out.println("");
        System.out.println(" This is the LinkedHashSet");

        //Set LinkedHashSet
        Set<Integer> set2=new LinkedHashSet<Integer>();
        set2.add(111);
        set2.add(222);
        set2.add(333);
        for(Integer random:set2){

            System.out.print(random +"  ");
        }
        System.out.println();
         System.out.println("This is the removal from LinkedHashSet");
        set2.remove(111);
        for(Integer rmLinked:set2){
            System.out.print(rmLinked + " ");
        }
        System.out.println();
        System.out.println("This is the TreeSet");

        //Set TreeSet
        Set<Integer> set3 = new TreeSet<Integer>();
        set3.add(444);
        set3.add(555);
        set3.add(666);
        for(Integer triple:set3){

            System.out.print(triple + "  ");

        }
        System.out.println();
        System.out.println("---------This is the map interface NewHashMap--------");
        //Map Interface
        Map<Integer, String> list2 = new HashMap<Integer, String>();

        list2.put(1, "Chicken");
        list2.put(  2,"Pork");
        list2.put(  3, "Snake");

        for(Map.Entry m:list2.entrySet())
        {
            System.out.print(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        //Removing an map element
        System.out.println("Removing element form HashMap");
        list2.remove(2);
        for(Map.Entry rm:list2.entrySet())
        {
            System.out.print(rm.getKey() + "  " + rm.getValue());

        }
        System.out.println();
        System.out.println("-----This is the Linked HashMap-------");
        //Map second
        Map<Integer,String> list3 =new LinkedHashMap<Integer,String>();
        list3.put(4,"Donuts");
        list3.put(5,"Traditional");
        list3.put(6,"Bunny");

        for(Map.Entry animal:list3.entrySet())
        {
            System.out.print(animal.getKey()+" "+ animal.getValue());

        }
        System.out.println();
        // Removing the element from Linked HashMap
        System.out.println("Removing the element from Linked HashMap");
        list3.remove(6);
        for(Map.Entry rk:list3.entrySet()){
            System.out.print(rk.getKey() +" " +rk.getValue());
        }
        //This is HashMap
        System.out.println();
        System.out.println("-----This is the HashMap------");
        Map<Integer, String> map1= new HashMap<Integer,String>();
        map1.put(7,"Bikash");
        map1.put(8,"Inu");
        map1.put(9,"Awale");
        for(Map.Entry name:map1.entrySet())
        {
            System.out.print(name.getKey() + "    " +name.getValue());

        }
        //Removing the element from HashMap
        System.out.println();
        System.out.println("This is the Removal from the HashMap");
        map1.remove(8);
        for(Map.Entry ri:map1.entrySet())
        {
            System.out.print(ri.getKey()+ " " + ri.getValue());

        }
        System.out.println();
        //Adding the Treemap on the map list
        System.out.println("-------------This is the TreeMap");

        Map<Integer,String> map3 = new TreeMap<Integer,String>();
        map3.put(10,"pan");
        map3.put(11,"blender");
        map3.put(12,"freezer");
        for(Map.Entry kitchen:map3.entrySet())
        {
            System.out.print(kitchen.getKey()+ "  " +kitchen.getValue());
        }
        System.out.println();
        //Removing item from the TreeMap
        System.out.println("This is the Removal from TreeMap");
        map3.remove(10);
        for(Map.Entry rt:map3.entrySet()){
            System.out.print(rt.getKey()+" " +rt.getValue());
        }
        System.out.println();
        System.out.println("--------This is the Hashtable------------");
                Map<Integer,String>map4 =new Hashtable<Integer, String>();
        map4.put(13,"bed");
        map4.put(14,"lamp");
        map4.put(15,"table");
        for(Map.Entry room:map4.entrySet())
        {
            System.out.println(room.getKey() + " " +room.getValue());
        }
        //Removal from hashtable
        System.out.println("This is the removal from the hastable-----");
        map4.remove(13);
        for(Map.Entry rhT:map4.entrySet()){
            System.out.println(rhT.getKey()+""+rhT.getValue());
        }
    }
}
