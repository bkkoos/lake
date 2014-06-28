name := "lake"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= {
  val version = "1.7.4";
  val ns = "com.orientechnologies";
  Seq(
    ns % "orientdb-core" % version,
    ns % "orientdb-client" % version
  )
}

mainClass in (Compile, run) := Some("net.shantitree.lake.Main")