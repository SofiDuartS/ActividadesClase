package com.example.reservahoteles
import com.example.reservahoteles.Habitacion
class Reserva {
    // Atributos
    var id_reserva:Long
    var fecha_entrada:String
    var fecha_salida:String
    var habitacion:Int
    var cedula_cliente:Long
    var estado:String
    var precio:Double

    constructor(id:Long, entrada:String, salida:String, habitacion:Int,
                cliente:Long, estado:String, precio:Double){
        this.id_reserva = id
        this.fecha_entrada = entrada
        this.fecha_salida = salida
        this.habitacion = habitacion
        this.cedula_cliente = cliente
        this.estado = estado
        this.precio = precio
    }

    //Métodos
    fun cambiarPrecio(nuevo_precio:Double){
        this.precio = nuevo_precio
        println("El precio ha sido exitosamente actualizado a " + this.precio)
    }
    fun cambiarReserva(nueva_entrada:String, nueva_salida:String){
        this.fecha_entrada = nueva_entrada
        this.fecha_salida = nueva_salida
        println("Su estadía ha sido exitosamente modificada, ahora usted entra el " + this.fecha_entrada
                + " y sale el " + this.fecha_salida)
    }
    fun cambioHabitacion(nueva_habitacion:Int){
        this.habitacion = nueva_habitacion
        println("Su habitación ahora es la número " + this.habitacion)
    }

    fun cambioEstado(nuevo_estado:String){
        if (this.estado == "activada"){
            if (nuevo_estado == "desactivada"){
                this.estado = nuevo_estado
                println("Su reserva ha sido " + this.estado)
            } else {
                println("Su reserva ya se encontraba activada")
            }
        } else {
            if (nuevo_estado == "activada"){
                this.estado = nuevo_estado
                println("Su reserva ha sido " + this.estado)
            } else {
                println("Su reserva ya se encontraba desactivada")
            }
        }
    }

}
