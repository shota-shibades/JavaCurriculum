package Qes31;



class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		//person1.print();
		Person person2 = new Person("加藤浩二", 39, 1.5, 65);
		//person2.print();
		//Person.printCount();

		Car car = new Car();
		Bicycle bicycle = new Bicycle();


		// 問題4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の
		// 所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を
		// 「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
		
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);
		
		// 問題5：セットできたら、ownerをコンソールに出力してください。
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、
		// 「person2」がbicycleを購入するプログラムを作成しましょう。
		person1.buy(car);
		person2.buy(bicycle);
	}
}
