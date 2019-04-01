/**
  Implement a list of integer elements, including
  both data and operations.

  Adapted using code from Solution to Holmes List_inArraySlots
  Calls upon methods in List_inArraySlots
  The methods were mostly similar except for the add method
 */

public class OrderedList_inArraySlots {

    private List_inArraySlots list;
    /**
      Construct an empty list with a small initial capacity.
     */
    public OrderedList_inArraySlots() {
        list = new List_inArraySlots();
        // filledElements has been initialized to the desired value, 0
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return list.size();
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        return list.toString();
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         // expand if necessary
         return list.add(value);
}


    /**
      expand method not necessary in ordered list. Assumes it will be implemented in List_inArraySlots
	  Double the capacity of the List_inArraySlots,
      preserving existing data.
     */


    // --------- end of "code that worked in v0" ---------


    /**
      accessor
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
        // E-Z! pass through the request to the array object
        return list.get(index);
    }


    /**
      o set method 

     */
 /*    public int set( int index, int newValue ) {
        int saveForReturn = get( index);
        elements[ index] = newValue;
        return saveForReturn;
    } */


    /**
      Insert @value at position @index in this list.

      Shift the element currently at that position (if any)
      and any subsequent elements to the right
      (that is, increase the index associated with each).
     */

     //not a valid method in OrderedList_inArraySlots

     // public void add( int index, int value) {
        // if( index == filledElements) // adding at end of list
            // add( value);
        // else {// need space
             // // open up space, expanding if necessary
             // add( elements[ filledElements-1]);

             // // move the hole left / shift "subsequent elements" right
             // for( int hole = filledElements-1; hole > index; hole--)
                 // elements[ hole] = elements[ hole-1];

            // elements[ index] = value; // store new value
        // }
     // }
	 
	 //no addAtHead method
     // public void addAtHead( int value) {
        // add (0, value); //adds at beginning of the list
        
     // }
     /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
     public int remove( int index) {
        return list.remove(index);
     }
}