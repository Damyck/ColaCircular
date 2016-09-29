/**
 * Created by Marc on 19/9/2016.
 */
public class PilaImpls<E> implements Pila<E>{

    int size = 0;
    E[] elems;
    int len;
    int cont = 0;
    int tempo = 0;
    int equals = 0;

    public PilaImpls(int len){
        this.elems = (E[]) new Object[len];
        this.len = len;
    }

    @Override
    public void push(E e) throws CuaPlena {
        if (size >= len || tempo == 1)  {
            this.size = 0;
            this.tempo = 1;
            if (cont == size && size == 0){

                this.equals = 1;
            }
            if (cont <= size && equals == 0) throw new CuaPlena();
            else {
                this.elems[size] = e;
            }

            }
        else
        {
            this.elems[size] = e;

        }

        size++;
    }

    @Override
    public E pop() throws CuaBuida {
        if (cont >= len){
            this.cont = 0;
            if (cont >= size || tempo != 1) throw new CuaBuida();
            else {
                return this.elems[++cont];
            }
        }
        else
        {
            if (cont >= size) throw new CuaBuida();
            else {
                return this.elems[cont++];


            }
        }


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int cont() {
        return cont;
    }
}
