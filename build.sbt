name := "afternoonbatchproject"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.0" % "provided"



// https://mvnrepository.com/artifact/org.apache.spark/spark-graphx
libraryDependencies += "org.apache.spark" %% "spark-graphx" % "2.1.0"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.1.0"
