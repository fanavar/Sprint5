package cl.awakelab.sprint5


data class Zapato(val nombre: String, val precio: Double, val imgUrl: String)

class Zapatos {
    companion object {
        val zapatos = mutableListOf<Zapato>().apply {
            add(Zapato("Haka Honu Pampa", 46.044, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dwadfda27c/images/imagenes-productos/667/261048-0001-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Lippi Outdoor", 59.990, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/203px-Flag_of_Chile.svg.png"))
            add(Zapato("Paraguay", 80.900, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/203px-Flag_of_Paraguay.svg.png"))
            add(Zapato("Bolivia", 121.589, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Bolivia.svg/203px-Flag_of_Bolivia.svg.png"))
            add(Zapato("Perú", 105.560, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Peru.svg/203px-Flag_of_Peru.svg.png"))
            add(Zapato("Ecuador", 99.990, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/203px-Flag_of_Ecuador.svg.png"))
            add(Zapato("Brasil", 150.590, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/203px-Flag_of_Brazil.svg.png"))
            add(Zapato("Colombia", 45.500, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/203px-Flag_of_Colombia.svg.png"))
            add(Zapato("Venezuela", 65.669, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/203px-Flag_of_Venezuela.svg.png"))
            add(Zapato("Uruguay", 45.000, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/203px-Flag_of_Uruguay.svg.png"))
        }
    }
}