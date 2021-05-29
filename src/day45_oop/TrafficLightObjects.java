package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color);  not reccomended, calling directly to the variable

        //call method to access variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        //trafficLight.color = "black";  NOT RECCOMENDED
        trafficLight2.changeColor("brown");
        trafficLight2.showColor();


    }
}
