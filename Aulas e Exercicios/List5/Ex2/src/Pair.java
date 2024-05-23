public class Pair<E extends Comparable<E>>{ 
    
    private E elm1;
    private E elm2;

    public Pair(E elm1, E elm2){
        this.elm1 = elm1;
        this.elm2 = elm2;
    }

    public E getFirst() {
        return elm1;
    }


    public E getSecond() {
        return elm2;
    }


    public E Min() {

        if(elm1.compareTo(elm2) < 0){
            return elm1;
        }
        else{
            return elm2;
        }
    
    }

    public E Max() {

        if (elm1.compareTo(elm2) > 0){
            return elm1;
        }else{
            return elm2;
        }
    
    }

}
