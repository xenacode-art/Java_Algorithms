package com.cyberspace;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int [length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int [] newItems = new int [count * 2];

            
            for (int i = 0; i < count; i++)
              newItems [i] = items[i];
            items = newItems;
        }

        items[count++]  = item;   
    }


   public void removeAt(int index) {
       //Validate the index
       if (index < 0 || index >= count)
          throw new IllegalArgumentException();

       //shift the items to the left to fill the hole
       for (int i = index; i < count; i++)
        items[i] = items[i + 1];
        
       count --; 
   }

   public int indexOf(int item){
       //if we find it,return index
       //else , return -1
       for (int i = 0; i < count; i++)
         if (items[i] == item)
           return 1;
        return -1;   
   }

   public void print() {
       for (int i = 0; i < count; i++);
       system.out.println(items[i]);
   }
}