package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc<E,T> {
//    ArrayList<E> arrayList;
//    Function function;

    public MapFunc(){
//        this.arrayList = arrayList;
//        this.function = function;

    }


    public static <E> ArrayList<E> map(ArrayList<E> arrayList, Function<E,E> function){
        ArrayList<E > newElements = new ArrayList<>();
        for(E e : arrayList){
            newElements.add(function.apply(e));
        }
        return newElements;
    }

}
