package implementations.FoodDeliveryApp;

public class FoodItem {

    private String name;
    private float price;
    private Cuisine cuisine;
    private FoodCategory category;
    private boolean isVeg;

    public FoodItem(FoodBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.cuisine = builder.cuisine;
        this.category = builder.category;
        this.isVeg = builder.isVeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public FoodCategory getCategory() {
        return category;
    }

    public void setCategory(FoodCategory category) {
        this.category = category;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    static class FoodBuilder {

        private String name;
        private float price;
        private Cuisine cuisine;
        private FoodCategory category;
        private boolean isVeg;

        public FoodBuilder() {}

        public FoodBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public FoodBuilder setPrice(float price) {
            this.price = price;
            return this;
        }

        public FoodBuilder setCuisine(Cuisine cuisine) {
            this.cuisine = cuisine;
            return this;
        }

        public FoodBuilder setCategory(FoodCategory category) {
            this.category = category;
            return this;
        }

        public FoodBuilder setIsVeg(boolean isVeg) {
            this.isVeg = isVeg;
            return this;
        }

        public FoodItem build() {
            return new FoodItem(this);
        }
    }
}
