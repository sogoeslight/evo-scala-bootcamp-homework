package com.sogoeslight.homework.task1.basics

import scala.annotation.tailrec

object Basics {
  // Least common multiple
  def lcm(a: Int, b: Int): Int =
    if (a == 0 && b == 0) 0
    else Math.abs(a * b) / gcd(a, b)

  // Greatest common divisor
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) Math.abs(a)
    else gcd(b, a % b)

}
