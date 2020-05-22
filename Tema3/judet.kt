class Judet(var Comuna: Array<Comuna>,var Oras: Array<Oras>,public var  nume:String ){
    fun Afisare(){
        println("--------Judete--------");
        println("Judet:"+nume);
        Comuna.forEach { it.Afisare(); }
        Oras.forEach { it.Afisare(); }
    }
    fun GetNume():String{
        return nume;
    }
}