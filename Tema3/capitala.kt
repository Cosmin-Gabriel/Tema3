class Capitala(var resedinta:String, var an:Int, var judete: Array<Judet>)
{
    fun GetNume():String
    {
        return resedinta
    }
    fun Afisare()
    {
        println("Capitala: "+ resedinta+" an: "+an)
        println("Judete")

        judete.forEach {
            print("\t")
            it.Afisare()
        }
    }
}