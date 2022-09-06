import scala.io.StdIn.readLine
import scala.util.Random
import MathExtensions._
object PrimeTimeApp extends App {

  //println("Hola a todos!")

  // definiendo variables y constantes
  val minAns = 0
  val maxAns = 250
  var respuesta = "?"

  // genera lista de numeros primos de 0 to 250
  //var primeLt = List(11, 13, 17)
  //var primeLt = constructorListaPrimosBuff(minAns,maxAns)
  //var primeLt = minAns primosBuffTo maxAns
  var primeLt = minAns primosListTo maxAns

  //println(primeLt)

  // loop
  do {

    // genera numeros aleatorios primos de 0 to 250
    var ans = 0
    while (ans % 2 ==0 || ans % 5 == 0) {
      ans =  Random.nextInt(maxAns-minAns) + minAns
    }

    // muestra un numero aleatorio para adivinar

    print(s"¿Es $ans un numero primo? digite alguna de estas opciones (S/N/X=terminar y salir) ")
    respuesta = readLine().toUpperCase()

    // muestra la respuesta correcta

    val isPrime = primeLt contains ans

    if (isPrime) {
      print(if (respuesta == "S") "Correcto!" else "Incorrecto!")
      println(s" $ans es un número primo")
    }
    else {
      print(if (respuesta == "S") "Incorrecto!" else "Correcto!")
      println(s" $ans no es un número primo")
    }

    // test

    // fin del loop
  } while(respuesta !="X")

}