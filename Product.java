public class Product {


        private int productId;
        private String name;
        private double price;
        private String category;
        private int stockQuantity;
        private String description;

        public Product(int productId, String name, double price,
                       String category, int stockQuantity,
                       String description) {

            this.productId = productId;
            this.name = name;
            this.price = price;
            this.category = category;
            this.stockQuantity = stockQuantity;
            this.description = description;
        }
        public int getProductId() {
            return productId;
        }
        public void setProductId(int productId) {
            this.productId = productId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {

            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Price must be greater than 0.");
            }
        }
        public String getCategory() {
            return category;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public int getStockQuantity() {
            return stockQuantity;
        }
        public void setStockQuantity(int stockQuantity) {

            if (stockQuantity >= 0) {
                this.stockQuantity = stockQuantity;
            } else {
                System.out.println("Stock quantity cannot be negative.");
            }
        }
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public void displayProduct() {

            System.out.println("----- Product Information -----");
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Stock Quantity: " + stockQuantity);
            System.out.println("Description: " + description);
        }
    }

