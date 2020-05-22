class Sat(var asezare: Asezare,var case: Int)
{
    fun GetNume():String
    {
        return asezare.GetNume()
    }
    fun Afisare()
    {
        println("Sate componente:")
        asezare.Afisare()
        print( " nr.case: "+ case)
    }
}