name := "spark-project-template"

version := "1.0.cloudera"

scalaVersion := "2.11.8"

resolvers += "Cloudera CDH dependencies" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

// | @see https://github.com/jrudolph/sbt-dependency-graph
net.virtualvoid.sbt.graph.Plugin.graphSettings

// | sbt can take a load time checking dependencies. This avoids re-checking the dependencies.
// | Comment this line if error "Skipping update requested, but update has not previously run successfully."
// skip in update := true

libraryDependencies += "org.apache.spark" %% "spark-core_2.11" % "2.0.0.cloudera1" withSources() withJavadoc()

libraryDependencies += "org.apache.spark" %% "spark-sql_2.11" % "2.0.0.cloudera1" withSources() withJavadoc()

libraryDependencies += "org.apache.spark" %% "spark-hive_2.11" % "2.0.0.cloudera1" withSources() withJavadoc()


// | Before bundling the project for a spark-submit, comment the spark-* dependencies above
// | and uncomment the dependencies below. It prevents sbt-assembly from bundling the JARs already provided
// | by the Spark cluster.

// libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.0" % "provided"
//
// libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.3.0" % "provided"
//
// libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.3.0" % "provided"


// | Extra libraries

// resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases"

// libraryDependencies += "ua_parser" % "ua-parser" % "1.3.0" withSources()

// libraryDependencies += "com.maxmind.geoip" % "geoip-api" % "1.2.14" withSources() withJavadoc()

// libraryDependencies += "joda-time" % "joda-time" % "2.5" withSources() withJavadoc()

// libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.3.11" withSources() withJavadoc()
