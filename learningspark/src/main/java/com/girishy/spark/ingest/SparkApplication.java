package com.girishy.spark.ingest;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class SparkApplication {
	public static void main(String[] args) {
//		
//		Logger.getLogger("org").setLevel(Level.ERROR);
//		Logger.getLogger("akka").setLevel(Level.ERROR);
		/*
		 * Logger.getLogger("org").setLevel(Level.ERROR);
		 * Logger.getLogger("akka").setLevel(Level.ERROR);
		 */
		/*
		 * InferCSVSChema csvSchema = new InferCSVSChema(); csvSchema.printSchema();
		 */
		
		/*
		 * DefineCSVSchema defineSchema = new DefineCSVSchema();
		 * defineSchema.printDefinedSchema();
		 */
		
		JsonLineParser jsonParser = new JsonLineParser();
		jsonParser.parseJsonLines();
	}

}
