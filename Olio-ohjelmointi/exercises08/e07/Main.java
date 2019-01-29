class Main {

    public static void main(String[] args) {

        MyLinkedList munArray = new MyLinkedList();

        Object opjekti = new Object();
        Object opjekti2 = new Object();

        TestObject a = new TestObject("A1");
        TestObject b = new TestObject("B2");
        TestObject c = new TestObject("C3");
        TestObject d = new TestObject("D4");
        TestObject e = new TestObject("E5");

        munArray.add(a);
        munArray.add(b);
        munArray.add(c);
        munArray.add(d);
        munArray.add(e);

        //TestObject x = (TestObject) munArray.get(4);    //4 = a1
        //System.out.println(x.getTieto());       //B2    3 = b2

        munArray.remove(5);

        for (int i = 0; i < munArray.size; i++) {
            TestObject x = (TestObject) munArray.get(i);
            System.out.println(x.getTieto());
        }

    }
}

class MyLinkedList implements MyList {

    Alkio first;
    Alkio last;
    int size;

    public MyLinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object remove(int index) {       //3     E5   D4     //D4 ollaan postamassa
        Alkio a = first;    //iterointi alkaa

        if (index == 0) {       //jos index 0 siellä ei ole enää getseuraavaa
            for (int i = index; i < size -2; i++) {
                a = a.getSeuraava();
            }
            //TestObject y = (TestObject) a.getElementti();
            //System.out.println("HIT : " +y.getTieto() );
            a.setSeuraava(null);            //elikkäs sen edeltävän alkion seuraava on null
            size--;
        }
        else if (index == size) {   //jos on iteraation eka niin seuraavasta tehdään first
            System.out.println("Index on size");
            a = a.getSeuraava();
            first = a;
            size--;
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object get(int index) {
        Alkio a = first;
        for (int i = index; i < size-1; i++) {
            a = a.getSeuraava();
        }

        return a.getElementti();
    }

    @Override
    public void clear() {
    }

    @Override
    public void add(Object e) {
        
        if (first == null) {
            first = new Alkio();
            first.setSeuraava(null);
            first.setElementti(e);
            size++;
        }
        else {
            Alkio next = new Alkio();
            next.setSeuraava(first);
            next.setElementti(e);
            first = next;
            size++;
        }
    }
}

class Alkio {
    Object elementti;
    Alkio seuraava;

    public void setElementti(Object a) {
        elementti = a;
    }
    public void setSeuraava(Alkio a) {
        seuraava = a;
    }
    public Alkio getSeuraava() {
        return seuraava;
    }
    public Object getElementti() {
        return elementti;
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

class TestObject {
    String tieto;

    public TestObject(String a) {
        tieto = a;
    } 
    public String getTieto() {
        return tieto;
    }

}