package at.fhj.msd;

public class Show {
    private static final double BASE_PRICE =12;


    private Movie movie;
    private Hall hall;
    private int startTime;
    private boolean[][] seats;

    public Show (Movie movie,Hall hall, int startTime){
        this.movie=movie;
        this.hall=hall;
        this.startTime=startTime;

        this.seats =new boolean[this.hall.rows][this.hall.seatsperrow];
    }
s
    public int getFreeSeats(){
        int count =0;
        for (boolean[] row: this.seats){
            for(boolean col:row){
                if (!col){
                    count++;
                }
            }
        }
        return count;
    }
    private int calcTicketPrice (int row){

        double price = Show.BASE_PRICE;
        if (row>4)
            price +=2;
        if (row>8)
            price += 2;
        if (this.hall.getTotalSeats()>75){
            price +=1;
        if (this.hall.getTotalSeats()>120){
            price +=3;
        }
        return price;
        }

    }
    public int buyTicket(int raw,int seat){
        if (!this.seats[row][seats]){
            this.seats[row][seats]=true;

            return 15.0;
        }
        throw new IllegalArgumentException("Seat already taken");
    }
    public void printseatplan(){
        for(int row=0; row<this.seats.length;row++){
            for(int col=0;col<this.seats[row].length;c++){
                if (this.seats[row][col])
                    System.out.println("X ");
                else 
                    System.out.println(". ");                    
            }
        System.out.println();
        }

    }
    
}
