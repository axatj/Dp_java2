package com.containment;

class Pen2 {
	private String color;
	private String name;
	private int pen_price;
	private Nib2 nb;

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPen_Price(int pen_price) {
		this.pen_price = pen_price;
	}

	public void setNb(Nib2 nb) {
		this.nb = nb;
	}

	public String getColor() {
		return color;
	}

	public int getPen_Price() {
		return pen_price;
	}

	public Nib2 getNb() {
		return nb;
	}
}

class Nib2 {
	private String material;
	private int price;

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public int getPrice() {
		return price;
	}
}

public class Bag2 {
	private String brand_name;
	private int price;
	private Pen2 p;

	public void setBrand_Name(String brand_name) {
		this.brand_name = brand_name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPen2(Pen2 p) {
		this.p = p;
	}

	public String getBrand_Name() {
		return brand_name;
	}

	public int getPrice() {
		return price;
	}

	public Pen2 getP() {
		return p;
	}

	public static void main(String[] args) {
		Bag2 b2 = new Bag2();
		b2.setBrand_Name("AMerican");
		b2.setPrice(3000);
		b2.setPen2(new Pen2());
		Pen2 p2 = b2.getP();
		p2.setColor("Black");
		p2.setName("Cello");
		p2.setPen_Price(25);
		p2.setNb(new Nib2());
		Nib2 nb2 = p2.getNb();
		nb2.setMaterial("plastic");
		nb2.setPrice(25);

		System.out.println(b2.getBrand_Name());
		System.out.println(b2.getPrice());
		System.out.println(p2.getColor());
		System.out.println(p2.getPen_Price());
		System.out.println(p2.getName());
		System.out.println(nb2.getMaterial());
		System.out.println(nb2.getPrice());
	}

}
