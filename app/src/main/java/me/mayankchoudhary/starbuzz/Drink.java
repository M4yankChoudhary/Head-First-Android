package me.mayankchoudhary.starbuzz;

public class Drink {
    // drinks array
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };
    private String name;
    private String description;
    private int imageResID;

    public Drink(String name, String description, int imageResID) {
        this.name = name;
        this.description = description;
        this.imageResID = imageResID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResID() {
        return imageResID;
    }

    public String toString() {
        return this.name;
    }


}
