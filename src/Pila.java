/**
 * Created by Marc on 19/9/2016.
 */
public interface Pila<E> {

    public void push(E e) throws CuaPlena;
    public E pop() throws CuaBuida;
    public int size();
    public int cont();

}
