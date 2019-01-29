class Main {

    public static void main(String[] args) {

        MyArrayList munArray = new MyArrayList();

        Object opjekti = new Object();

        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);  //out of bounds exception
        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);
        munArray.add(opjekti);
        if (munArray.isEmpty()) System.out.println("Taulu oli tyhja");
        munArray.add(opjekti);  //out of bounds exception
        System.out.println("Size :" +munArray.size() );
        //munArray.clear();
        if (munArray.isEmpty()) System.out.println("Taulu oli tyhja");
        System.out.println("Size :" +munArray.size() );
        Object opjekti2 = munArray.get(4);
        Object opjecti3 =  munArray.remove(11);
        munArray.remove( opjekti );


    }
}

class MyArrayList implements MyList {

    Object[] data;
    int size;
    int threshold;

    public MyArrayList() {
        size = 0;
        threshold = 5;
        data = new Object[threshold];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < data.length; i++) {
            if (o.equals(data[i]) ) {    //eka objecti kun equals
            //if (o instanceof Object ) {
            //System.out.println("opjekti equals");
                for (int j = i; i < data.length-1; i++) {   //poisto ja liikutus
                    data[i] = data[i + 1];
                }
                size--;
                //System.out.println("opjekti poistettu");
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        Object tmp = data[index];

        for (int i = index; i < data.length-1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        //data[index] = null;
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public void clear() {
        for (int i = 0 ; i < data.length ; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public void add(Object e) {
        if (size == data.length ) {
            System.out.println("taulu tulee täyteen");
            Object[] tmp = new Object[size + threshold];
            data = tmp;
        }
        data[size] = e;
        size++;
    }

}

interface MyList {

    /** Appends the specified element to the end of this list */
    void add(Object e);
    
    /** Removes all of the elements from this list **/
    void clear();
    
    /** Returns the element at the specified position in this list. */
    Object get(int index);
    
    /** Returns true if this list contains no elements. **/
    boolean isEmpty();
    
    /** Removes the element at the specified position in this list. Returns the removed element. */
    Object remove(int index);
    
    /** Removes the first occurrence of the specified element from this list, if it is present (return true) */
    boolean remove(Object o);
    
    /** Returns the number of elements in this list. */
    int size();
}