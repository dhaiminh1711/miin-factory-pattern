package miin.learning

interface Candy {
    fun getCandyName(): String
}

enum class CandyType {
    MINT, HARD
}

object CandyFactory {
    fun getCandy(candyType: CandyType) : Candy {
        when (candyType) {
            CandyType.MINT -> return MintCandy()

            CandyType.HARD -> return HardCandy()

            else -> throw IllegalStateException("Not support")
        }
    }
}
