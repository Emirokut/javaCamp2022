package classesWithAttributes;

public class Product {
   
	public Product(int id,String name, String description,double price, int srockAmount, String renk) {
		
	System.out.println("Yapıcı blok çalıştı");
	this.id= id;
	this.renk = renk;
	this.name=name;
	this.price=price;
	this.description= description;
	this.stockAmount = stockAmount;
	}
	
    public Product() {
    	
    }
	
	private int id;
      private String name;
     private String description;
     private double price;
     private int stockAmount;
	 private String kod; 
	 private String renk;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getKod() {
		return this.name.substring(0,1)+id;
	}

	
	int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	String getRenk() {
		return renk;
	}

	void setRenk(String renk) {
		this.renk = renk;
	}

}
