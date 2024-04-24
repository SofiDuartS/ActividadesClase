package com.example.reservahoteles
import com.example.reservahoteles.Habitacion
import com.example.reservahoteles.Cliente
import com.example.reservahoteles.Reserva
class Hotel {
    var nombre: String
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var ubicacion: String
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var categoria: String
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var habitaciones: MutableList<Habitacion>
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(
        nombre: String,
        ubicacion: String,
        categoria: String,
        disponibilidad: MutableList<Habitacion>
    ) {
        this.nombre = nombre
        this.ubicacion = ubicacion
        this.categoria = categoria
        this.habitaciones = disponibilidad
    }

    fun crear_hotel() {
        println("Para crear un nuevo hotel ingrese el nombre del hotel:")
        this.nombre = readLine()!!.toString()
        println("Ingrese la ubicacion del hotel:")
        this.ubicacion = readLine()!!.toString()
        println("Ingrese la categoria a la que hace parte el hotel:")
        this.categoria = readLine()!!.toString()
        var mutableList: MutableList<Habitacion> = mutableListOf()
        this.habitaciones = mutableList
    }

    fun agregar_habitacion(Habitacion: Habitacion) {
        this.habitaciones.add(Habitacion)
        println("Se ha agregado la reserva: " + Habitacion.getNumHabitacion() + " al hotel")
    }

    fun eliminar_habitacion(Habitacion: Habitacion) {
        this.habitaciones.remove(Habitacion)
        println("Se ha eliminado la habitacion: " + Habitacion.getNumHabitacion() + " del hotel")

    }
}

