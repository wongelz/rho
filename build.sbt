import RhoBuild._

version       in ThisBuild := s"0.16.5${scalazCrossBuildSuffix(scalazVersion.value)}"
apiVersion    in ThisBuild <<= version.map(extractApiVersion)
scalazVersion in ThisBuild := "7.1.11"
