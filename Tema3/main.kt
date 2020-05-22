fun main() {
    fun isCapitala(capitala: Capitala, nume: String): Boolean {
        if (capitala.GetNume() == nume)
            return true
        else
            return false
    }

    fun main() {

        val sate_iasi = arrayOf(Sat(Asezare("Valea Lupului", 1640), 561), Sat(Asezare("Letcani", 6500), 1789));

        val sate_neamt = arrayOf(
            Sat(Asezare("Dumbrava", 5430), 1787),
            Sat(Asezare("Margineni", 3540), 780),
            Sat(Asezare("Izovoare", 5260), 1785)
        )
        val comune_iasi = arrayOf(Comuna(sate_iasi, "Osoi"))
        val comune_neamt = arrayOf(Comuna(sate_neamt, "Dumbrava Rosie"))
        val orase_iasi = arrayOf(Oras(Asezare("Pascani", 35620), 340, 1), Oras(Asezare("Iasi", 764000), 7800, 3))
        val orase_neamt = arrayOf(Oras(Asezare("Piatra Neamt", 453000), 1350, 2))
        val sate_bucuresti = arrayOf(Sat(Asezare("Dobos", 4560), 453))
        val comune_bucuresti = arrayOf(Comuna(sate_bucuresti, "Dudeni"))
        val orase_bucuresti = arrayOf(Oras(Asezare("Bucuresti", 2452000), 6741, 21), Oras(Asezare("Ilfov", 342002), 3210, 6))
        val judete = arrayOf(Judet(comune_iasi, orase_iasi, "Iasi"), Judet(comune_neamt, orase_neamt, "Neamt"), Judet(comune_bucuresti, orase_bucuresti, "Bucuresti"))
        val capitala = Capitala("BucurestiC", 1459, judete)

        sate_iasi.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        sate_neamt.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        comune_iasi.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        comune_neamt.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        orase_iasi.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        orase_neamt.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        sate_bucuresti.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        comune_bucuresti.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        orase_bucuresti.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        judete.forEach {
            print(it.GetNume() + " este capitala: ")
            if (isCapitala(capitala, it.GetNume()))
                print("true")
            else print("false\n")
        }
        print(capitala.GetNume() + " este capitala: ")
        if (isCapitala(capitala, capitala.GetNume()))
            print("true")
        else print("false\n")
    }
}
