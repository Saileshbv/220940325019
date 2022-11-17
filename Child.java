import java.util.*;
import java.lang.*;
import java.io.*;
class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	GrandParent(String grandFatherName,String grandMotherName)
	{
	this.grandFatherName=grandFatherName;
	this.grandMotherName=grandMotherName;
	System.out.println("The Grand Parents names are:");
	System.out.println(grandFatherName);
	System.out.println(grandMotherName);
	}
}

class Parent extends GrandParent
{
	String fatherName;
	String motherName;
	static String grandFatherName;
	static String grandMotherName;
	Parent(String fatherName,String motherName,String grandFatherName,String grandMotherName)
	{
	super(grandFatherName,grandMotherName);
	this.grandFatherName=grandFatherName;
	this.grandMotherName=grandMotherName;
	this.fatherName=fatherName;
	this.motherName=motherName;
	System.out.println("The Parents names are:");
	System.out.println(fatherName);
	System.out.println(motherName);
	}
	Parent()
	{
	super(grandFatherName,grandMotherName);
	}
		
}
class Child extends Parent
{
	Child(String fatherName,String motherName,String grandFatherName,String grandMotherName)
	{
	super(fatherName,motherName,grandFatherName,grandMotherName);
	}
	public static void main(String args[])
	{
	Child c=new Child("hari","sailaja","suresh","kavita");
	}	

}