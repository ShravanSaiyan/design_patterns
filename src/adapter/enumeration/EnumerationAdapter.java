package adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator {

    Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
