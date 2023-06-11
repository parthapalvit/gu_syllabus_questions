// 10. a java programme to modify the -distancel class by creating constructor for assigning values (feet and inches) to the distance object . 
create another object and assign second object as  reference variable . further create a third object which is clone of the first object. 


public class Distance implements Cloneable {
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

    public Distance(Distance other) {
        this.feet = other.feet;
        this.inches = other.inches;
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
        Distance d2 = new Distance(d1); // Assigning d1 as a reference variable to d2

        Distance d3 = null;
        try {
            d3 = (Distance) d1.clone(); // Creating a clone of d1
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        d1.displayDistance();
        d2.displayDistance();
        d3.displayDistance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
