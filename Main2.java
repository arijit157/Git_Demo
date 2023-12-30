import java.util.Scanner;

class Player{
	private String name;
	private int age;
	private String country;

	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getCountry(){
		return country;
	}
}

public class Main2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player p=new Player();

		System.out.println("Enter Name:");
		String name=sc.nextLine();
		p.setName(name);

        System.out.println("Enter Country:");
		String country=sc.nextLine();   //this line is not executing
		p.setCountry(country);

		System.out.println("Enter Age:");
		int age=sc.nextInt();
		p.setAge(age);

		// System.out.println("Enter Country:");
		// String country=sc.nextLine();   //this line is not executing
		// p.setCountry(country);

		System.out.println("Player Details:");
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Country:"+p.getCountry());

		sc.close();
	}

}
