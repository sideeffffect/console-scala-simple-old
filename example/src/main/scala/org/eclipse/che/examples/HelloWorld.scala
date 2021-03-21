/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples

import zio._

import java.io.IOException

object HelloWorld extends App {

  override def run(args: List[String]): ZIO[ZEnv, Nothing, ExitCode] =
    program.exitCode

  def program: ZIO[console.Console, IOException, Unit] = {
    for {
      name <- console.getStrLn
      greeting <- greet(name)
      _ <- console.putStrLn(greeting)
    } yield ()
  }

  def greet(name: String): ZIO[Any, Nothing, String] = {
    ZIO.succeed(s"Hello $name!")
  }

}
