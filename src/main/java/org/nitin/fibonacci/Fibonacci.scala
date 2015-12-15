package org.nitin.fibonacci

import scala.collection.mutable.ListBuffer

/**
 * Created by nitinafre on 15/12/2015.
 */
class Fibonacci {

  def fibonacci(number: Long): String = {
    val list = ListBuffer.apply[Long](0, 1)
    def sum(num1: Long, num2: Long): Long = {
      list += num1 + num2
      num1 + num2
    }
    def processSeries(num1: Long, num2: Long, length: Long): Long = {
      if (length > 1) {
        processSeries(num2, sum(num1, num2), length - 1)
      } else {
        sum(num1, num2)
      }
    }
    processSeries(0, 1, number - 2)
    list.mkString(", ")
  }

}
