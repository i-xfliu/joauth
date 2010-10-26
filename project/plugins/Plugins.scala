import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val twitterNestRepository  = "twitter.com" at "http://www.lag.net/nest/"
  val scalaToolsReleases = "scala-tools.org" at "http://scala-tools.org/repo-releases/"
  val twitterMavenRepo = "maven.twttr.com" at "http://maven.twttr.com/"
  val defaultProject = "com.twitter" % "standard-project" % "0.7.11"
}
