package com.nsv.jsmbaba.hashtable;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable(){
        hashtable = new StoredEmployee[7];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        if(occupied(hashedKey)){
            System.out.println("Already occupied. Keep looking for other position");

            //Get New hashedKey using Linear Probing
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length-1){
                hashedKey = 0;
            }else{
                hashedKey = hashedKey+1;
            }

            while(occupied(hashedKey) && hashedKey!=stopIndex){
                if(hashedKey == hashtable.length-1){
                    hashedKey = 0;
                }else{
                    hashedKey = hashedKey+1;
                }
            }

            if(!occupied(hashedKey)){
                hashtable[hashedKey] =  new StoredEmployee(employee.getLastName(), employee);
            }else{
                System.out.println("Could not find a index to put employee");
            }

        }else{
            hashtable[hashedKey] =  new StoredEmployee(employee.getLastName(), employee);
        }

    }

    private boolean occupied(int hashedKey) {
        return hashtable[hashedKey] != null;
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);

        hashedKey = findKey(hashedKey, key);

        if(hashedKey != -1){
            return  hashtable[hashedKey].getEmployee();
        }else{
            return null;
        }
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);

        hashedKey = findKey(hashedKey, key);

        if(hashedKey != -1){
            Employee employee = hashtable[hashedKey].getEmployee();
            hashtable[hashedKey] = null;
            return employee ;
        }else{
            return null;
        }
    }

    public int findKey(int hashedKey, String key) {
        if(hashtable[hashedKey].getKey().equals(key)){
            return hashedKey;
        }

        //Get New hashedKey using Linear Probing
        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length-1){
            hashedKey = 0;
        }else{
            hashedKey = hashedKey+1;
        }

        while(hashtable[hashedKey]!=null && ! hashtable[hashedKey].getKey().equals(key) && hashedKey!=stopIndex){
            if(hashedKey == hashtable.length-1){
                hashedKey = 0;
            }else{
                hashedKey = hashedKey+1;
            }
        }

        if(hashtable[hashedKey]!=null && ! hashtable[hashedKey].getKey().equals(key)){
            return hashedKey;
        }else{
            return -1;
        }


    }

    public void print(){
        for (StoredEmployee storedEmpl : hashtable) {
            if(storedEmpl != null){
                System.out.println(storedEmpl.getEmployee());
            }else{
                System.out.println("Empty Employee");
            }
        }
    }


}
