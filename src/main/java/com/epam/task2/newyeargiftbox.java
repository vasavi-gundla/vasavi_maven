package com.epam.task2;
import java.util.*;
public class newyeargiftbox {
	public static void main( String[] args )
    { 
        int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0,total_candies = 0;
        char n1;
        sweets collect;
        Boolean n=true;

        Scanner sc=new Scanner(System.in);
        System.out.println("fill the gift box with different types of sweets available below");
        while(n) {

        System.out.println("Available SWEETS");
        System.out.println("1.DARK FANTASY!!");
        System.out.println("2.KITKAT!!");
        System.out.println("3.COOKIES!!");
        System.out.println("4.CANDIES!!");
        System.out.println("5.CADBURY!!");
        System.out.println("6.HALWA!!");
        System.out.println("choose an item(1-6)");

        try {

        switch(sc.next().charAt(0))
        {
        case '1':
        	   System.out.println("please enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("please enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect= new darkfantasy();
        	   total_weight=collect.calcwt ( quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;
        	   System.out.println("total weight of Darkchocolate is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");

        	   System.out.println("do you want any other item (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break;
        	        }
        	     else
        		    {
        	    	 n=false;
                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                     System.out.println("Total number of candies in the giftbox is:"+total_candies);
                     break;
                    }
        case '2':
        	   System.out.println("please enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("please enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect=new kitkat();
        	   total_weight=collect.calcwt(quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;

        	   System.out.println("total weight of Milkchocolate is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	   System.out.println("do you want any other item (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break; 
        	        }
        	      else
        		    {
        	    	  n=false;
        	          System.out.println("Toatal gift box weight is:"+totalbox_wt+"grams");
        	          System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	          break;
        	        }
        case '3':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new cookies();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("total weight of whitechocolate is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	break;}
        case '4':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new candies();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;
        	total_candies=total_candies+quantity;

        	System.out.println("total weight of Candies is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                System.out.println("Total number of candies in the giftbox is:"+total_candies);

        	break;}
        case '5':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new cadbury();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("total weight of Gulabjamun is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	break;}
        case '6':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new halwa();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("total weight of Rasgulla is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;

        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	break;}


        }}
        catch(Exception e)
        {
        	System.out.println("please select from 1-6 options");



    }}
        sc.close();
}}
