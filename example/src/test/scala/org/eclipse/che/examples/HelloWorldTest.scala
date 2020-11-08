/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples

import zio.test.Assertion._
import zio.test._

/** Unit test for simple App.
  */
object HelloWorldTest extends DefaultRunnableSpec {
  def spec: ZSpec[Environment, Failure] =
    suite("HelloWorld.greet")(
      testM("should say Hello _!") {
        assertM(HelloWorld.greet("Che"))(equalTo("Hello Che!"))
      },
    )
}
