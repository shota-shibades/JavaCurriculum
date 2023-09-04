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
	
	// 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	public void buy(Car car) {
		// 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		car.setOwner(this.name);
		// 問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// 問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
		}
	}
