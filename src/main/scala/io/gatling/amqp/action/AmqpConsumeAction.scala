package io.gatling.amqp.action

import akka.actor._
import io.gatling.amqp.config._
import io.gatling.amqp.data._
import io.gatling.amqp.event._
import io.gatling.amqp.infra.Logging
import io.gatling.core.action.Chainable
import io.gatling.core.session.Session

class AmqpConsumeAction(req: ConsumeRequest, val next: ActorRef, amqp: AmqpProtocol) extends Chainable with Logging {
  override def execute(session: Session): Unit = {
    amqp.router ! AmqpConsumeRequest(req, session)

    next ! session
  }
}

object AmqpConsumeAction {
  def props(req: AmqpRequest, next: ActorRef, amqp: AmqpProtocol) = Props(classOf[AmqpConsumeAction], req, next, amqp)
}