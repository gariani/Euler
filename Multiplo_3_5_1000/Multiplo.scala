	object Multiplo {
	 	
		def funcCollection: Int = {
			val y = (1 to 1000).collect{
	 			case x if ((x % 3 == 0) || (x % 5 == 0)) => x
	 		}.sum
	 		y
		}

	 	def main(args: Array[String]) {	 		
	 		val funCol = funcCollection
	 		println(funCol)
	 	}
 
	}   