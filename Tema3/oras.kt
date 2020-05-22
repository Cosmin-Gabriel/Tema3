class Oras (var asezare:Asezare,var bloc:Int,var spital:Int)
{
    fun GetNume():String
    {
        return asezare.GetNume()
    }
    fun Afisare()
    {
        asezare.Afisare()
        print( "nr.bloc"+bloc+" nr.spitale: "+ spital+"\n")
    }
}