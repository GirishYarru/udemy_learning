package com.girishy.spark;

import static org.apache.spark.sql.functions.*;

import java.util.Properties;

import org.apache.spark.sql.*;

public class MainSparkApplication {
	public static void main(String[] args) {
		// create a session
		SparkSession spark = new SparkSession.Builder()
				.appName("csv to db")
				.master("local")
				.getOrCreate();
		
		//get data
		Dataset<Row> df = spark.read().format("csv") //dataframe is like atable
		.option("header",true)
		.load("src/main/resources/name_and_comments.txt");
		
		df.show();
		
		//new Column full name to concat both first name and last name as full name
		//if you want text to be add in between then we need to use lit
		df = df.withColumn("fullName",concat(df.col("first_name"),lit(", "),df.col("last_name")));
		
		//Transformation -> wanted to see the rows that has only numbers then we can use expressions
		df = df.filter(df.col("comment").rlike("\\d+"));
		//can also do orderbyt
		df = df.orderBy(df.col("last_name").asc());
		df.show();

		//now i wanted to save the df into db
		/*
		 * String dbConnectionUrl =
		 * "jdbc:mysql://localhost:3306/demo?characterEncoding=latin1"; Properties prop
		 * = new Properties(); prop.setProperty("driver", "org.hsqldb.jdbc.JDBCDriver");
		 * prop.setProperty("user", "root"); prop.setProperty("password", "Google@66");
		 */
	    
	    df.write()
    	.mode(SaveMode.Overwrite)
    	.format("jdbc")
    	  .option("driver","com.mysql.cj.jdbc.Driver")
    	  .option("url", "jdbc:mysql://localhost:3306/demo")
    	  .option("dbtable", "dataframe")
    	  .option("user", "root")
    	  .option("password", "Google@66")
    	  .save();
	}

}
