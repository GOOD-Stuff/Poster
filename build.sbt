organization := "org.poster.view"
name := "Poster"
version := "0.1"
scalaVersion := "2.12.6"

val ScalatraVersion = "2.6.+"

libraryDependencies ++= Seq(
    // Scalatra
    "org.scalatra" %% "scalatra" % "2.6.+",
    "org.scalatra" %% "scalatra-specs2"   % ScalatraVersion    % Test,
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % Provided,
    "org.scalactic" %% "scalactic" % "3.0.1",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.eclipse.jetty" % "jetty-webapp" % "9.4.7.v20170914"  % "provided;compile",

    // Scalike JSBC
    "org.scalikejdbc" %% "scalikejdbc"       % "3.3.0",
    "com.h2database"  %  "h2"                % "1.4.197",
    "ch.qos.logback"  %  "logback-classic"   % "1.2.3" % Provided
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
