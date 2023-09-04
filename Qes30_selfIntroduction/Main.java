package Qes30_selfIntroduction;

class Main {
	public static void main(String[] args) {
		// 問題5：Main.javaの引数にweightの60を入れてください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
		Person person2 = new Person("加藤浩二", 39, 1.5, 65);
		person2.print();
		
		// // 問題10：人数の合計を「合計○人です」と出力してください。
		Person.printCount();
	}
}
