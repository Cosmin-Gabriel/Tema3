class Comuna(var sate: Array<Sat>,public var nume:String)
{
    fun Afisare()
    {
        println("\tComuna: ["+nume+"]" );
       sate.forEach { it.Afisare(); }
        print(" numar sate: [" + sate+"]"  );
    }
    fun GetNume():String{
        return nume;
    }
}