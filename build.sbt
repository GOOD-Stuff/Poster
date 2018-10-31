organization := "org.poster.view"
name := "Poster"
version := "0.1"
scalaVersion := "2.12.6"

val ScalatraVersion = "2.6.+"

libraryDependencies ++= Seq(
    // Scalatra
    "org.scalatra" %% "scalatra" % ScalatraVersion,
    "org.scalatra" %% "scalatra-scalate"    % "2.6.3",
    "org.scalatra" %% "scalatra-specs2"   % ScalatraVersion    % Test,
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % Provided,
    "org.scalactic" %% "scalactic" % "3.0.1",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.eclipse.jetty" %  "jetty-plus"  % "9.4.7.v20170914"  % "container;provided",
    "org.eclipse.jetty" % "jetty-webapp" % "9.4.7.v20170914"  % "provided;compile",

    // Auth
    "org.scalatra"            %% "scalatra-auth"     % ScalatraVersion,

    // Scalike JSBC
    "org.scalikejdbc" %% "scalikejdbc"       % "3.3.0",
    "com.h2database"  %  "h2"                % "1.4.197",
    "mysql"           % "mysql-connector-java" % "5.1.24",
    "ch.qos.logback"  %  "logback-classic"   % "1.2.3" % Provided,

    // Atmosphere
    "org.eclipse.jetty.websocket" %  "websocket-server"    % "9.4.6.v20170531" % "container;provided",
    "org.scalatra"                %% "scalatra-atmosphere" % "2.6.3",

    // JSON
    "org.json4s"                  %% "json4s-jackson"      % "3.5.2"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
