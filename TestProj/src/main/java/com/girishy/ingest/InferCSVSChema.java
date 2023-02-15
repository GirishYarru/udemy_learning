package com.girishy.ingest;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class InferCSVSChema {
	
	public void printSchema() {
		SparkSession spark = SparkSession.builder()
				             .appName("comples csv to df")
				             .master("local")
				             .getOrCreate();
		Dataset<Row> df = spark.read().format("csv")
		            .option("header", "true")
		            .option("multiline",true)
		            .option("sep", ";")
		            .option("quote", "^")
		            .option("dateFormat","M/d/y")
		            .option("inferSchema", true)
		            .load("src/main/resources/amazonProducts.txt");
		
		df.show(7);
		
		df.printSchema();
		
		
		
		
		            
				             
	}

}
