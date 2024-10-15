class Park
{
    String name;
    Attraction[] attractions;

    public Park(String name, Attraction[] attractions)
    {
        this.name = name;
        this.attractions = attractions;
    }

    public void displayParkInfo() {
        System.out.println("Park name: " + name);
        System.out.println("Attractions:");
        for (Attraction attraction : attractions)
        {
            attraction.displayAttractionInfo();
        }
    }

    static class Attraction
    {
        private String name;
        private String workingHours;
        private double price;

        Attraction(String name, String workingHours, double price)
        {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        void displayAttractionInfo()
        {
            System.out.println("- Name: " + name);
            System.out.println("  Working hours: " + workingHours);
            System.out.println("  Price: " + price + " USD");
        }
    }


}
