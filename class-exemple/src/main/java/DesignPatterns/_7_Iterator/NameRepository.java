package DesignPatterns._7_Iterator;

import ro.sda.advanced._10_encapsulation.Person;

public class NameRepository implements Container {
    private String names[];

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private  class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
