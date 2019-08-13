import java.time.Instant

import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.{HttpApp, Route}
import org.slf4j.MDC

import scala.util.Random

object CinnamonMdcFilterTest {
  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem("system")
    implicit val executionContext = system.dispatcher
    val app = new HttpApp {

      override protected def routes: Route =
        path("foo") {
          complete {
            MDC.put("Test-Name-1", s"${Instant.now}")
            MDC.put("Test-Name-2", s"${Random.nextInt}")
            StatusCodes.OK
          }
        }
    }

    app.startServer("localhost", 8081, system)
  }
}
