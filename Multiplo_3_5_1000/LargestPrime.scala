object LargestPrime {

	def largest(num: Int): Int = {
		scala.math.sqrt(num)
	}

	def main(args: Array[String]) = {
		println(largest(600851475143))
	}
}