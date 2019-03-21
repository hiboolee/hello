public class Hello
{
	String name;
	int age;
	public void setNmae(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public static void main(String[] args)
	{
		Hello h=new Hello();
		h.setNmae("hello");
		
		System.out.println(h.getName());
	}
}