package Introduccion

class Hotel(
    val idHotel:Int,
    val nombre: String,
    val ubicacion: String,
    val categoria: String,
    var disponibilidad: Boolean
) {
    val habitacionesDisponibles: MutableList<Habitacion> = mutableListOf()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitacionesDisponibles.add(habitacion)
    }

    fun buscarHabitacionDisponible(): Habitacion? {
        return habitacionesDisponibles.find { it.disponibilidad }
    }

    fun reservarHabitacion(habitacion: Habitacion, cliente: Cliente, fechaEntrada: String, fechaSalida: String): Reserva? {
        if (habitacion.disponibilidad) {
            habitacion.disponibilidad = false
            val reserva = Reserva(fechaEntrada, fechaSalida, habitacion, cliente, "Confirmada", habitacion.precioPorNoche)
            cliente.agregarReserva(reserva)
            return reserva
        } else {
            println("Lo sentimos, la habitación no está disponible.")
            return null
        }
    }

    fun liberarHabitacion(habitacion: Habitacion) {
        habitacion.disponibilidad = true
    }
}
