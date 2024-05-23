public class worker implements Runnable {
    private int somaParcial;
    private int limi; 
    private int lims;

    public worker(int li, int ls) {
        this.limi = li;
        this.lims = ls;
        this.somaParcial = 0;
    }

    @Override
    public void run(){
        for (int i=limi; i<=lims; i++){
            this.somaParcial +=i;
        }

        
    }

    public int getSoma() {
        return this.somaParcial;
    }
}
