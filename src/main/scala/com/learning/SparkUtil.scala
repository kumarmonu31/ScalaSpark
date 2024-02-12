package com.learning

import org.apache.spark.sql.{DataFrame, SparkSession}


object SparkUtil {

  def renameColumn(df:DataFrame,suffix:String) = {

  }

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("YourAppName")
      .master("local")
      .getOrCreate()
    import spark.implicits._
    val df1=Seq(("1","test","value"),("2","test","value3")).toDF("id","key","value")

    val df2=Seq(("1","test","value"),("2","test2","value4")).toDF("id","key","value")

    val l = List(df1,df2)
    l.foreach(x=>x.show())
  }
}
