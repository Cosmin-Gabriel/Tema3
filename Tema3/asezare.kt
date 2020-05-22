class Asezare(private var nume:String, private var nrloc: Int)
{
    fun GetNume():String
    {
        return nume;
    }
    fun Afisare()
    {
        print("Nume: "+nume+" nr.loc: "+nrloc);
    }
}