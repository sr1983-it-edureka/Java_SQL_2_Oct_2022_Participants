package com.edureka.javafsd2.java8.features;

public class MonitorTweetImpl implements MonitorTweet{

	@Override
	public boolean monitor(String tweet) {
		
		if (tweet.contains("***")) {
			
			return true;
		}else {
			return false;
		}
	}

}
