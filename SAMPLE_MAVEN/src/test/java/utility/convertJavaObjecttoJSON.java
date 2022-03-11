package utility;

import com.google.gson.Gson;
interface bank{
	int x=5; //By default compiler adds public,default and static to all members inside interface
	void display(int h); //Ny default public and abstract to all methods inside interface

}
class convertJavaObjecttoJSON implements bank
{
	String name;
	int no;
	public convertJavaObjecttoJSON(){
		System.out.println("Object created");
	}
	public convertJavaObjecttoJSON(String name,int no){
		this.name=name;
		this.no=no;
		}
	public void display(int g)
	{
		System.out.println(g);

	}

	public static void main(String[] args) {
		convertJavaObjecttoJSON p=new convertJavaObjecttoJSON("Ravi", 100);
		System.out.println(new Gson().toJson(p)); //convert java object to JSON
		bank a=new convertJavaObjecttoJSON();
		a.display(x);
		p.display(20);
	

	}

}
