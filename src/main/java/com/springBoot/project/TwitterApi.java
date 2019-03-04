package com.springBoot.project;

public class TwitterApi {

		public static void main(String[] args) throws Exception {
	      /*final LinkedBlockingQueue<Status> queue = new LinkedBlockingQueue<Status>(1000);
	      
	      	      
	      String consumerKey = args[0].toString();
	      String consumerSecret = args[1].toString();
	      String accessToken = args[2].toString();
	      String accessTokenSecret = args[3].toString();
	      String topicName = args[4].toString();
	      String[] arguments = args.clone();
	      String[] keyWords = Arrays.copyOfRange(arguments, 5, arguments.length);

	      ConfigurationBuilder cb = new ConfigurationBuilder();
	      cb.setDebugEnabled(true)
	         .setOAuthConsumerKey("cChZNFj6T5R0TigYB9yd1w")
	         .setOAuthConsumerSecret("cChZNFj6T5R0TigYB9yd1w")
	         .setOAuthAccessToken("7588892-kagSNqWge8gB1WwE3plnFsJHAZVfxWD7Vb57p0b4")
	         .setOAuthAccessTokenSecret("PbKfYqSryyeKDWz4ebtY3o5ogNLG11WJuZBc9fQrQo");

	      TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
	      StatusListener listener = new StatusListener() {
			
			public void onStatus(Status status) {
				queue.offer(status);
				status.getText();
				
			}
			
			 public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
	             System.out.println("Got a status deletion notice id:" 
	               + statusDeletionNotice.getStatusId());
	         }
	         
	         public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
	             System.out.println("Got track limitation notice:" + 
	               numberOfLimitedStatuses);
	         }

	         public void onScrubGeo(long userId, long upToStatusId) {
	             System.out.println("Got scrub_geo event userId:" + userId + 
	            "upToStatusId:" + upToStatusId);
	         }      
	         
	         public void onStallWarning(StallWarning warning) {
	            // System.out.println("Got stall warning:" + warning);
	         }
	         
	         public void onException(Exception ex) {
	            ex.printStackTrace();
	         }
		};
	      twitterStream.addListener(listener);
	      
	      FilterQuery query = new FilterQuery().track(keyWords);
	      twitterStream.filter(query);

	      Thread.sleep(5000);
	      
	      //Add Kafka producer config settings
	      Properties props = new Properties();
	      props.put("bootstrap.servers", "localhost:9092");
	      props.put("acks", "all");
	      props.put("retries", 0);
	      props.put("batch.size", 16384);
	      props.put("linger.ms", 1);
	      props.put("buffer.memory", 33554432);
	      
	      props.put("key.serializer", 
	         "org.apache.kafka.common.serializa-tion.StringSerializer");
	      props.put("value.serializer", 
	         "org.apache.kafka.common.serializa-tion.StringSerializer");
	      
	      Producer<String, String> producer = new KafkaProducer<String, String>(props);
	      int i = 0;
	      int j = 0;
	      
	      while(i < 10) {
	         Status ret = queue.poll();
	         
	         if (ret == null) {
	            Thread.sleep(100);
	            i++;
	         }else {
	            for(HashtagEntity hashtage : ret.getHashtagEntities()) {
	               System.out.println("Hashtag: " + hashtage.getText());
	               producer.send(new ProducerRecord<String, String>(
	                  topicName, Integer.toString(j++), hashtage.getText()));
	            }
	         }
	      }
	      producer.close();
	      Thread.sleep(5000);
	      twitterStream.shutdown();*/
	   }

}
