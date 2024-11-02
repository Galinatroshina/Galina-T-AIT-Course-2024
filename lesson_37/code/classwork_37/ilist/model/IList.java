package classwork_37.ilist.model;

public interface IList<E> extends Iterable<E> {

    int size();
    default boolean isEmpty(){
        return size() == 0;
    };

    void clean(); //очистка памяти

    boolean add(E element);

    default boolean contain(Object o){
        return indexOf(o)>=0;
    }; //есть ли такое объект

    default boolean remove(Object o){
        int index = indexOf(o);
        if(index < 0){
            return false;
        }
        remove(index);
        return true;
    }; //если есть, о удаляем

    boolean add(int index, E element);

    E remove (int index);

    E get(int index);

    E set(int index, E element);

    int indexOf(Object o);

    int lastIndex(Object o);

}
