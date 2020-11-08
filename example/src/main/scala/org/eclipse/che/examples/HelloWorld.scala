/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples

import zio._

object HelloWorld extends App {

  override def run(args: List[String]): URIO[ZEnv, ExitCode] =
    program.exitCode

  def program: RIO[console.Console, Unit] = {
    for {
      name <- console.getStrLn
      greeting <- greet(name)
      _ <- console.putStrLn(greeting)
    } yield ()
  }

  def greet(name: String): Task[String] = {
    Task.succeed(s"Hello $name!")
  }

}
