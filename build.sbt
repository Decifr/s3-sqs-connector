name := "spark-s3-sqs-connector"

organization := "me.decifr"

version := "2.1.0"

scalaVersion := "2.12.16"

crossScalaVersions := Seq("2.12.16")

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1" % Provided

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1" % Provided

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.1.1" % Provided

libraryDependencies += "com.amazonaws" % "aws-java-sdk-sqs" % "1.12.286"

pomExtra := {
  <url>https://github.com/imapi/spark-sqs-receiver</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/decifr/spark-s3-sqs-connector.git</connection>
      <developerConnection>scm:git:git@github.com:decifr/spark-s3-sqs-connector.git</developerConnection>
      <url>https://github.com/decifr/spark-s3-sqs-connector</url>
    </scm>
    <developers>
      <developer>
        <id>decifr</id>
        <name>Decifr</name>
        <url>https://github.com/decifr</url>
      </developer>
    </developers>
}

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard

  case x => MergeStrategy.first
}
