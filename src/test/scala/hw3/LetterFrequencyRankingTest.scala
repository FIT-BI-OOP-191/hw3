package hw3

import hw3.Main.letterFrequencyRanking
import org.scalatest.{FunSuite, Matchers}

class LetterFrequencyRankingTest extends FunSuite with Matchers {
  test("[+] Null")          { the [IllegalArgumentException] thrownBy letterFrequencyRanking(null) }
  test("[ ] Simple")          { letterFrequencyRanking("hello") shouldBe "leho" }
  test("[ ] Capital letters") { letterFrequencyRanking("AaaAaaAaa") shouldBe "a" }
  test("[ ] Punctuation")     { letterFrequencyRanking("Sic!") shouldBe "cis" }
}