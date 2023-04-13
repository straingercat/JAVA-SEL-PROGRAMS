package PRACTICENEW2023;

public class constructoroverload
{
constructoroverload()
{
System.out.println("consrtuctor");
}

constructoroverload(int a)
{
System.out.println(a);
}

public static void main(String[] args) {
		constructoroverload c=new constructoroverload();
		constructoroverload c1=new constructoroverload(100);

	}

}
