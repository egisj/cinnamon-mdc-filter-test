addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.12.0-20190807-e679cc8")

credentials += Credentials(Path.userHome / ".lightbend" / "commercial.credentials")

resolvers += "com-mvn" at "https://repo.lightbend.com/commercial-releases/"

resolvers += Resolver.url("com-ivy", url("https://repo.lightbend.com/commercial-releases/"))(Resolver.ivyStylePatterns)
