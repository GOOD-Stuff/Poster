name := "Poster"
version := "0.1"
scalaVersion := "2.12.6"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
libraryDependencies ++= Seq(
    "org.scalatra" %% "scalatra" % "2.6.+",
    "org.scalactic" %% "scalactic" % "3.0.1",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.eclipse.jetty" % "jetty-webapp" % "9.4.7.v20170914"  % "provided;compile",
    //"org.eclipse.jetty" % "jetty-webapp" % "9.1.3.v20140225" % "container",
    //"org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test"
   // artifacts (Artifact("javax.servlet", "jar", "jar"))
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)
