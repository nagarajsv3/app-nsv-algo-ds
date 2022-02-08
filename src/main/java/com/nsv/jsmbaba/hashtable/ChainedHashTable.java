package com.nsv.jsmbaba.hashtable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];

        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashCode(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedKey = hashCode(key);

        LinkedList<StoredEmployee> storedEmployees = hashTable[hashedKey];

        if(!storedEmployees.isEmpty()){
            ListIterator<StoredEmployee> iter = storedEmployees.listIterator();
            while(iter.hasNext()){
                StoredEmployee emp = iter.next();
                if(emp.getKey().equals(key)){
                    return emp.getEmployee();
                }
            }

        }

        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashCode(key);

        LinkedList<StoredEmployee> storedEmployees = hashTable[hashedKey];

        if(!storedEmployees.isEmpty()){
            ListIterator<StoredEmployee> iter = storedEmployees.listIterator();
            while(iter.hasNext()){
                StoredEmployee emp = iter.next();
                if(emp.getKey().equals(key)){
                    iter.remove();
                    return emp.getEmployee();
                }
            }

        }

        return null;
    }

    public int hashCode(String key){
        return key.length() % hashTable.length;
    }

    public void print(){
        for (int i = 0; i < hashTable.length; i++) {
            LinkedList<StoredEmployee> storedEmployees = hashTable[i];
            if(storedEmployees.isEmpty()){
                System.out.println("Position "+i+" : empty");
            }else{
                System.out.println("Position "+i+" : ");
                Iterator<StoredEmployee> iterator = storedEmployees.iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        }
    }

}
