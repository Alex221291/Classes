package task5;
public class DecimalCounter {
    int minValue;
    int maxValue;
    int presentValue;

    public DecimalCounter() {
        this.minValue = -10;
        this.maxValue = 10;
        this.presentValue = 0;
    }

    public DecimalCounter( int minV, int maxV, int presentV) {

        if((presentV >= minV) && (presentV <= maxV)){
            this.minValue = minV;
            this.maxValue = maxV;
            this.presentValue = presentV;
        }else{
            this.minValue = -10;
            this.maxValue = 10;
            this.presentValue = 0;
        }
    }

    public void increment() {
        if (this.presentValue < this.maxValue) {
            this.presentValue++;
        }
        else {
            this.presentValue = this.minValue;
        }
    }

    public  void decrement() {
        if (this.presentValue > this.minValue) {
            this.presentValue--;
        }
        else {
            this.presentValue = this.maxValue;
        }
    }

    public  void print() {
        System.out.println("Current counter value: " + this.presentValue);
    }
}
