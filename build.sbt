name := "FunctionalRL"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
  "org.platanios" %% "tensorflow-api" % "0.5.10",
  "org.platanios" %% "tensorflow-data" % "0.5.10",
  "org.platanios" %% "tensorflow-jni" % "0.5.10",
  "org.platanios" %% "tensorflow" % "0.5.10" classifier "linux",

  "org.plotly-scala" %% "plotly-render" % "0.8.0"
)
