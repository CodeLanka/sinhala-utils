/**
 * Created by bhagyasilva on 15/09/14.
 */
class Transliterator {


}

object TestTransliteration {
  def main(args: Array[String]): Unit ={
    println(SinGlishToUnicodeTransliterator.transliterate("amma"))
    println(SinGlishToUnicodeTransliterator.transliterate("thaththa"))
    println(SinGlishToUnicodeTransliterator.transliterate("puthaa"))
    println(SinGlishToUnicodeTransliterator.transliterate("duwa"))
  }
}