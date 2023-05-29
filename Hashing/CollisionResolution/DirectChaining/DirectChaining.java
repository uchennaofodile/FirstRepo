//Implements the buckets as linked list. Colliding elements are stored in lists
/*
0 ----> ABCD --> EFGH
1
2 ----> IJKLM
3
4
 */

import java.util.ArrayList;
import java.util.LinkedList;

class DirectChaining{
//each element is a linked list
LinkedList<String>[] hashTable;
int maxChainSize = 5;

public DirectChaining(int size){
    hashTable = new LinkedList[size];
}

public int modASCIIHashFunction(String word, int M){
    char ch[];
    ch = word.toCharArray();
    int i, sum;
    for (sum=0, i=0; i<word.length(); i++){
        sum = sum + ch[i]; //adding ASCII values of chars
    }
    return sum% M;
}

public void insertHashTable(String word){
    int newIndex = modASCIIHashFunction(word, hashTable.length);
    if(hashTable[newIndex]==null){
        hashTable[newIndex] = new LinkedList<String>();
        hashTable[newIndex].add(word);
        
    }else{
        hashTable[newIndex].add(word);
    }
}

public void displayHashTable(){
    if(hashTable == null){
        System.out.println("The hashtable doesn't exist");
         return;
        }
       else{
        System.out.println("\n--------------HashTable--------------");
        for(int i =0; i<hashTable.length; i++){
            System.out.println("Index "+ i+ ", key:" + hashTable[i]);
    }
    } 
}


}