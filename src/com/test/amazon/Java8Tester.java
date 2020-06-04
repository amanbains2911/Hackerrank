/**
 * 
 */
package com.test.amazon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amanb
 *
 */
public class Java8Tester {

	   final static String salutation = "Hello! ";
	   
	   public static void main(String args[]) {
	      GreetingService greetService1 = message -> 
	      System.out.println(salutation + message);
	      greetService1.sayMessage("Aman");
	      
	      List<String> names = new ArrayList<String>();
			
	      names.add("Aman");
	      names.add("Preet");
	      names.add("Maneet");
	      names.add("Harman");
	      names.add("Bains");
			
	      names.forEach(System.out::println);
	      
	      LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + currentTime);
			
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("date1: " + date1);
			
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
			
	      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
			
	      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
	      System.out.println("date2: " + date2);
			
	      //12 december 2014
	      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
	      System.out.println("date3: " + date3);
			
	      //22 hour 15 minutes
	      LocalTime date4 = LocalTime.of(22, 15);
	      System.out.println("date4: " + date4);
			
	      //parse a string
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	}

