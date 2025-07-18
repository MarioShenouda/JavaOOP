package at.fhj.msd;

public class Hall {
    public int rows;
    public int seatsPerRow;

    public Hall(int raws,int seatsPerRow){
        this.rows=raws;
        this.seatsPerRow=seatsPerRow;
    }

    public int getTotalSeats(){
        return this.rows*this.seatsPerRow;

    }
    
}
