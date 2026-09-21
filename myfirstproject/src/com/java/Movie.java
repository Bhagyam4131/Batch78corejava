package com.java;

public class Movie {
	static String theatreName="cinepols";
	static String theatrelocation="kbhp";
	//instances variables
	String MovieName;
	String movieBudget;
	String releasedate;
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m=new Movie();
		m.MovieName="irumudi";
		m.movieBudget="50cr";
		m.releasedate="21_08_26";
		System.out.println("theatreName:"+theatreName);
		System.out.println("theatrelocation:"+theatrelocation);
		System.out.println("MovieName:"+m.MovieName);
		System.out.println("movieBudge:"+m.movieBudget);
		System.out.println("releasedate:"+m.releasedate);
		System.out.println("object2 created***********");
		Movie m1=new Movie();
		m1.MovieName="toxic";
		m1.movieBudget="1cr";
		m1.releasedate="26_08_26";
		System.out.println("MovieName:"+m1.MovieName);
		System.out.println("movieBudge:"+m1.movieBudget);
		System.out.println("releasedate:"+m1.releasedate);
		theatreName="pvr";
		theatrelocation="knr";
		System.out.println("object3 created***********");
		Movie m2=new Movie();
		m2.MovieName="dc";
		m2.movieBudget="12cr";
		m2.releasedate="12_08_26";
		System.out.println("MovieName:"+m2.MovieName);
		System.out.println("movieBudge:"+m2.movieBudget);
		System.out.println("releasedate:"+m2.releasedate);
		System.out.println("object4 created***********");
		Movie m3=new Movie();
		m3.MovieName="mass maharaj";
		m3.movieBudget="10cr";
		m3.releasedate="10_05_25";
		System.out.println("MovieName:"+m3.MovieName);
		System.out.println("movieBudge:"+m3.movieBudget);
		System.out.println("releasedate:"+m3.releasedate);
		System.out.println("object5 created***********");
		Movie m4=new Movie();
		m4.MovieName="sitaram";
		m4.movieBudget="20cr";
		m4.releasedate="15_02_24";
		System.out.println("MovieName:"+m4.MovieName);
		System.out.println("movieBudge:"+m4.movieBudget);
		System.out.println("releasedate:"+m4.releasedate);
		System.out.println("main method ended");


	}

}
