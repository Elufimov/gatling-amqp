enablePlugins(GatlingPlugin)

scalaVersion := "2.11.6"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val gatlingVersion = "2.2.0-M3"

xerial.sbt.Sonatype.sonatypeRootSettings

organization := "sc.ala"
name := "gatling-amqp"
description := "Gatling AMQP support"
homepage := Some(url("https://github.com/maiha/gatling-amqp"))
licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php"))

pomExtra := (
     <developers>
        <developer>
          <id>maiha</id>
          <name>Kazunori Nishi</name>
          <url>https://github.com/maiha</url>
        </developer>
      </developers>
      <scm>
        <url>https://github.com/maiha/gatling-amqp</url>
        <connection>scm:git:git@github.com:maiha/gatling-amqp.git</connection>
      </scm>
)

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion
libraryDependencies += "com.rabbitmq" % "amqp-client" % "3.5.3"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.5.3"
libraryDependencies += "jaxen" % "jaxen" % "1.1.6"
libraryDependencies += "com.jsuereth" %% "scala-arm" % "1.4"
libraryDependencies += "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2"
libraryDependencies += "com.github.kxbmap" %% "configs" % "0.2.4"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0-SNAP4" % "test"
libraryDependencies += "pl.project13.scala" %% "rainbow" % "0.2"
