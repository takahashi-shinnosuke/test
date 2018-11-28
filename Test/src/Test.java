
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		Person jiro = new Person();
		Person hanako = new Person();
		Robot robo=new Robot();
		Robot asimo=new Robot();
		Robot pepper=new Robot();
		
		taro.name="山田 太郎";
		taro.age=20;
		taro.phoneNum="080-1111";
		taro.add="aaa.softbank";
		
		jiro.name="木村 次郎";
		jiro.age=18;
		jiro.phoneNum="090-2221";
		jiro.add="ccc.softbank";
		
		hanako.name="鈴木　花子";
		hanako.age=16;
		hanako.phoneNum="050-3333";
		hanako.add="vvv.softbank";
		
		robo.name="aibo";
		asimo.name="asimo";
		pepper.name="pepper";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNum);
		System.out.println(taro.add);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNum);
		System.out.println(jiro.add);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNum);
		System.out.println(hanako.add);
		
		taro.talk();
		taro.walk();
		taro.run();
		jiro.talk();
	    jiro.walk();
	    jiro.run();
	    hanako.talk();
	    hanako.walk();
	    hanako.run();
	    robo.talk();
	    robo.walk();
	    robo.run();
	    asimo.talk();
	    asimo.walk();
	    asimo.run();
	    pepper.talk();
	    pepper.walk();
	    pepper.run();
	}

}
