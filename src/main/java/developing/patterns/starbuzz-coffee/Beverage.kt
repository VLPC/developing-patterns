package developing.patterns.`starbuzz-coffee`

abstract class Beverage {
    open var description: String? = null
        protected set
    protected var costCof = 0.0
    protected var condiments: MutableList? = null

    abstract fun addCondiment(condiment: Condiment?)
    abstract fun cost(): Double
}