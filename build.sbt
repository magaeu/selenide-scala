name := "selenide-scala"

version := "0.1"

scalaVersion := "2.13.6"

scalacOptions := Seq("-encoding", "UTF-8")
javacOptions := Seq("-encoding", "UTF-8")

val scalaTestVersion = "3.2.9"

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.32" % Test
libraryDependencies += "org.scalactic"  %% "scalactic"            % scalaTestVersion
libraryDependencies += "org.scalatest"  %% "scalatest"            % scalaTestVersion % Test
libraryDependencies += "org.scalatest"  %% "scalatest-funsuite"   % scalaTestVersion % Test
libraryDependencies += "com.codeborne"  % "selenide"               % "5.24.3" % Test
