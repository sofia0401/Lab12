package Task1;

import static java.lang.StrictMath.pow;

public enum Planet {
    MERCURY(3.3011 * pow(10, 23), 2439.7,"Mercury"),
    VENUS(4.8675 * pow(10, 24), 6051.8,"Venus"),
    EARTH(5.97237 * pow(10, 24), 6371,"Earth"),
    MARS(6.4171 * pow(10, 23), 3389.5,"Mars"),
    JUPITER(1.8982 * pow(10, 27), 69911,"Jupiter"),
    SATURN(5.6834 * pow(10, 26), 58232,"Saturn"),
    URANUS(8.6810 * pow(10, 25), 25362,"Uranus"),
    NEPTUNE(1.02413 * pow(10, 26), 24622,"Neptune");

    private double weight;
    private double radius;
    private String name;

    Planet(double weight, double radius,String name) {
        this.weight = weight;
        this.radius = radius;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() { return name;}

    public double getGravity(){
        return 6.67430*pow(10,-11)*this.getWeight()/(this.getRadius()*this.getRadius()*pow(10,6));
    }
}


