/**
 * Created by Marc on 19/9/2016.
 */
public class main  {
    public static void main(String[] arcs) {

        PilaImpls<Integer> st1 = new PilaImpls<Integer>(10);
        try {
            st1.push(1);
            st1.push(2);
            st1.push(3);
            st1.push(4);
            st1.push(5);
            st1.push(6);
            st1.push(7);
            st1.push(8);
            st1.push(9);
            st1.push(10);


            try {
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();
                st1.pop();


            }
            catch (CuaBuida e){
                System.out.println(e.getMessage());
            }
            st1.push(11);
            System.out.println(st1.size());
            System.out.println(st1.cont());
        }
        catch (CuaPlena e){
            System.out.println(e.getMessage());
        }


    }
    }
