/**
  Implement a list of integer elements, including
  both data and operations.

  Adapted using code from Solution to Holmes List_inArraySlots
  Calls upon methods in List_inArraySlots
  The methods were mostly similar except for the add method
 */

public class OrderedList_inArraySlots {
    private list List_inArraySlots;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public OrderedList_inArraySlots() {
        list = new List_inArraySlots;
        // filledElements has been initialized to the desired value, 0
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return list.filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String result = "[";
        for( int elemIndex = 0; elemIndex < list.filledElements; elemIndex++)
            result += list.elements[ elemIndex] + ",";
        return result + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
        return list.add (value);
}


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        list.expand();
     }

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
        return list.get(index)
    }


    /**
      No set method.   

      Set value at @index to @newValue

      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
      

      No add method to an index of a value
    /**
      Insert @value at position @index in this list.

      Shift the element currently at that position (if any)
      and any subsequent elements to the right
      (that is, increase the index associated with each).
     */

     //not a valid method in OrderedList_inArraySlots
     public void add( int index, int value) {
        if( index == filledElements) // adding at end of list
            add( value);
        else {// need space
             // open up space, expanding if necessary
             add( elements[ filledElements-1]);

             // move the hole left / shift "subsequent elements" right
             for( int hole = filledElements-1; hole > index; hole--)
                 elements[ hole] = elements[ hole-1];  

            elements[ index] = value; // store new value
        }
     }
     public void addAtHead( int value) {
        add (0, value); //adds at beginning of the list
        
     }
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