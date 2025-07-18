public class Colors {
    private int red;
    private int green;
    private int blue;

    public void color (int r,int g,int b){
        this.red=r;
        this.green=g;
        this.blue=b;
    }
    public String hexFormat(){
        return String.format("#%02x%02x%02x", this.red, this.green, this.blue).toUpperCase();
    }
    public String rgbFormat(){
        return String.format("rgb(%d, %d, %d)", this.red, this.green, this.blue);
    }
   
   
    public String toString() {
        return  this.rgbFormat() ;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + red;
        result = prime * result + green;
        result = prime * result + blue;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Colors other = (Colors) obj;
        if (red != other.red)
            return false;
        if (green != other.green)
            return false;
        if (blue != other.blue)
            return false;
        return true;
    }
    
    
    
}
