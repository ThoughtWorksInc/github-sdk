enablePlugins(MicrobuilderJsSdk)

enablePlugins(MicrobuilderJavaSdk)

organization := "com.thoughtworks.microbuilder.tutorial"

sonatypeProfileName := "com.thoughtworks.microbuilder"

name := "github-sdk"

developers := List(
  Developer(
    "Atry",
    "杨博 (Yang Bo)",
    "pop.atry@gmail.com",
    url("https://github.com/Atry")
  )
)

homepage := Some(url(s"https://github.com/ThoughtWorksInc/${name.value}"))

startYear := Some(2016)

releasePublishArtifactsAction := PgpKeys.publishSigned.value

import ReleaseTransformations._

releaseProcess := {
  releaseProcess.value.patch(releaseProcess.value.indexOf(publishArtifacts), Seq[ReleaseStep](releaseStepTask(publish in Haxe)), 0)
}

releaseProcess := {
  releaseProcess.value.patch(releaseProcess.value.indexOf(pushChanges), Seq[ReleaseStep](releaseStepCommand("sonatypeRelease")), 0)
}

releaseUseGlobalVersion := true

releaseCrossBuild := true

haxelibReleaseNote := "Initial release."

crossScalaVersions := Seq("2.10.6", "2.11.7")

scmInfo := Some(ScmInfo(
  url(s"https://github.com/ThoughtWorksInc/${name.value}"),
  s"scm:git:git://github.com/ThoughtWorksInc/${name.value}.git",
  Some(s"scm:git:git@github.com:ThoughtWorksInc/${name.value}.git")))

licenses += "MIT" -> url("http://opensource.org/licenses/MIT")
