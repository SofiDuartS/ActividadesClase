package com.example.myfirstapp

enum class Cama{SENCILLA, DOBLE, CAMAROTE}

class Habitacion{
    private var numHabitacion:Int
    private var camasHabitacion:MutableList<Cama>
    private var precioHabitacion:Double
    private var disponibleHabitacion:Boolean

    constructor(numHabitacion: Int,
                camasHabitacion: MutableList<Cama>,
                precioHabitacion: Double = 0.0,
                disponibleHabitacion: Boolean = true){
        this.numHabitacion = numHabitacion
        this.camasHabitacion = camasHabitacion
        this.precioHabitacion = precioHabitacion
        this.disponibleHabitacion = disponibleHabitacion
    }

    fun getNumHabitacion():Int{return this.numHabitacion}
    fun setNumHabitacion(num:Int){this.numHabitacion = num}

    fun getCamasHabitacion():List<Cama>{return this.camasHabitacion}
    fun setCamasHabitacion(camas: MutableList<Cama>){this.camasHabitacion = camas}
    fun addCamaHabitacion(cama: Cama){this.camasHabitacion.add(cama)}
    fun removeCamaHabitacion(cama: Cama){this.camasHabitacion.remove(cama)}

    fun getPrecioHabitacion():Double{return this.precioHabitacion}
    fun setPrecioHabitacion(precio:Int){this.precioHabitacion = precio}
    fun calcularPrecioHabitacion(): Double {
        var precio: Double = 0.0
        for (i in camasHabitacion) precio += when (i) {
            Cama.SENCILLA -> 50000.0
            Cama.CAMAROTE -> 110000.0
            Cama.DOBLE -> 90000.0
        }
        return precio
    }

    fun isHabitacionDisponible() : Boolean{return this.disponibleHabitacion}
    fun setHabitacionDisponible(disponible: Boolean){this.disponibleHabitacion = disponible}
    fun changeHabitacionDisponible(){setHabitacionDisponible(!this.isHabitacionDisponible())}
}
