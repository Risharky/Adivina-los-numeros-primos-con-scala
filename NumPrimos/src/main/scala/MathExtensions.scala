import scala.collection.mutable.ListBuffer
object MathExtensions {

  implicit class  IntPredicates(i: Int){
    def primosBuffTo(limiteSup: Int) : ListBuffer[Int] =constructorListaPrimosBuff(i, limiteSup)
    def primosListTo(limiteSup: Int): List[Int] = (constructorListaPrimosBuff(i, limiteSup).toList)
  }

  def constructorListaPrimosBuff(limiteInf: Int, limiteSup: Int): ListBuffer[Int] = {


    val list = ListBuffer[Int]()

    if (limiteSup < 2 || limiteInf > limiteSup) {
      return list
    }

    def esSigPrimo(test: Int): Boolean = {
      for (n <- list) {
        if (test % n == 0) return false
      }
      true

    }

    var current = 2
    while (current <= limiteSup) {
      if (esSigPrimo(current)) list += current
      current += 1

    }

    list.filter(_ >= limiteInf)
  }
}