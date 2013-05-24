Montpellier JUG web site / play 2.1.1 / scala 2.10.1

This project needs local install (publish-local) of:
  * sbt-dart-plugin https://github.com/cheleb/sbt-dart-plugin
  * securesocial https://github.com/jaliss/securesocial



$> export DART_SDK=/path/to/dart_sdk

$> cd jug-play-scala

$> cd dart

#Install dart dependencies.

$> $DART_SDK/bin/pub install 

$> cd -

$> sbt

$> run

== To build the dist file for cloundfoundry: 

$> sbt -Dconfig.file=conf/cloud.conf clean dist

== To deploy:

$> vmc push --path=dist/jug-play-scala-1.0.zip
