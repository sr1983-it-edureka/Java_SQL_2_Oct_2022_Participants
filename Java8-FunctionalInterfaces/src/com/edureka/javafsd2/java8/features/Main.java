package com.edureka.javafsd2.java8.features;

public class Main {

	public static void main(String[] args) {
		
//		variation1();
//		variation2();
		
//		variation3();
		variation4();
	}
	
	static void variation1() {
		
		MonitorTweetImpl monitor = new MonitorTweetImpl();
		boolean outcome = monitor.monitor("abc *** def");
		System.out.println(outcome);
	}

	static void variation2() {
		
		MonitorTweet monitorIntRef = new MonitorTweetImpl();
		boolean outcome = monitorIntRef.monitor("abc *** def");
		System.out.println(outcome);
	}
	
	static void variation3() {
		
		class A {}
		
		class B implements MonitorTweet{
		
			@Override
			public boolean monitor(String tweet) {
				return true;
			}
		}
		
		MonitorTweet  monitorRef = 
			new MonitorTweet() {
				
				@Override
				public boolean monitor(String tweet) {
					
					if (tweet.contains("***")) {
						
						return true;
					}else {
						return false;
					}					
				}
			};
			
			
		boolean outcome = monitorRef.monitor("abc *** def");
		System.out.println(outcome);			
	}

	static void variation4() {
		
		MonitorTweet  monitorRef = 
		
					(String tweet) -> {
						
						if (tweet.contains("***")) {
							
							return true;
						}else {
							return false;
						}					
				};		
		

/*
	@FunctionalInterface
	public interface Addition {
		int add(int a, int b);
	}
	*/							
		// Lambda expression
		MonitorTweet monitor 
			= (String tweet) -> {
				
				if (tweet.contains("***")) {
					
					return true;
				}else {
					return false;
				}									
		};
		boolean outcome = monitor.monitor("abc  *** def");
		System.out.println(outcome);			
	}
}
