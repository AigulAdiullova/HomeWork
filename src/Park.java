public class Park {
    private String name;
    public Park(String name) {
        this.name = name;}

    public static void main(String[] args) {
        System.out.println("\nЗадание 3.");
        Park park = new Park("Park");
        Attraction attractionOne = park.new Attraction("Attraction1", "10:00 - 14:00", 20);
        attractionOne.printInfo();}
    
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        public void printInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost + " rub");
        }
    }
}