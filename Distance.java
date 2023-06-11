// 9.  A java programe to create a  -distancel class with methods where distance is computed in terms of feet and inches ,
 how creates objects of a class and to see the use of this pointer.//



public class Distance {
    private int feet;
    private int inches;

    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void displayDistance() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public Distance addDistance(Distance other) {
        Distance sum = new Distance();
        sum.feet = this.feet + other.feet;
        sum.inches = this.inches + other.inches;

        if (sum.inches >= 12) {
            sum.feet += sum.inches / 12;
            sum.inches = sum.inches % 12;
        }

        return sum;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 10);

        Distance d3 = d1.addDistance(d2);

        d1.displayDistance();
        d2.displayDistance();
        d3.displayDistance();
    }
}
