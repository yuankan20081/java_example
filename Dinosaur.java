/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Dinosaur apatosaurus = new Apatosaurus();
		Dinosaur hadrosaur = new Hadrosaur();
		Dinosaur dummy = new UnknownDinosaur();
		apatosaurus.MeetOthers();
		hadrosaur.MeetOthers();
		dummy.MeetOthers();
	}
}

class Dinosaur{
	protected String SpeciesName;
	protected int Height;
	protected int Weight;
	protected int Speed;
	
	public void MeetOthers(){
		System.out.println("unknown, this is print in base");	
	}
}

class Apatosaurus extends Dinosaur{
	public Apatosaurus(){
		SpeciesName = "Apatosaurus";
		Height = 20; // m
		Weight = 10; // tons
		Speed = 10; // m/s
	}
	
	@Override
	public void MeetOthers(){
		System.out.println("Hi, my name is" + SpeciesName);
		System.out.println("my height is " + Height);
		System.out.println("my weight is " + Weight);
		System.out.println("my speed is " + Speed);
		System.out.println("+++++++++++++++++++++++");
	}
}

class Hadrosaur extends Dinosaur{
	public Hadrosaur(){
		SpeciesName = "Hadrosaur";
		Height = 200; // m
		Weight = 100; // tons
		Speed = 100; // m/s		
	}
	
	@Override
	public void MeetOthers(){
		System.out.println("Hi, my name is" + SpeciesName);
		System.out.println("my height is " + Height);
		System.out.println("my weight is " + Weight);
		System.out.println("my speed is " + Speed);
		System.out.println("+++++++++++++++++++++++");
	}
}

class UnknownDinosaur extends Dinosaur{
	public UnknownDinosaur(){
		SpeciesName = "never used";
		Height = 2000; // m
		Weight = 1000; // tons
		Speed = 1000; // m/s		
	}
}
