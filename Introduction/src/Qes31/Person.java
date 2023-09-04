package Qes31;

class Person{
	String name;
	int age;
	double height;
	double weight;
	int count;
	
	Person(String name,	int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count ++;
	}
	
	public double bmi(double height,double weight){
		double bmi;
		bmi = weight / height / height;
		return bmi;
	}
	
	public void print(){
		System.out.println("「名前は"+this.name+"です」,「年は"+this.age+"です」「BMIは"+bmi(this.height,this.weight)+"です」");
	}
	
	
	public void printCount() {
		System.out.println("「合計"+ this.count +"人です」");
	}
	
	
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
		}
	}
