package com.example.reservahoteles

class Cliente {
    var cedula:Long
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var nombre:String
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var metodo_pago:String
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var historial_reserva:LongArray
        get() {
            return field
        }
        set(value) {
            field = value
        }
    constructor(cedula:Long, nombre:String, metodo_pago:String, historial:LongArray) {
        this.cedula = cedula
        this.nombre = nombre
        this.metodo_pago = metodo_pago
        this.historial_reserva = historial
    }
    fun crear_cliente() {
        println("Para crear un nuevo cliente ingrese su cedula")
        this.cedula = readLine()!!.toLong()
        println("Ingrese el nombre del cliente")
        this.nombre = readLine()!!.toString()
        println("Ingrese el metodo de pago que uso el cliente:")
        println("1:Efectivo")
        println("2:Tarjeta Debito")
        println("3:Tarjeta Credito")
        println("4:Cheque")
        var opcion = readLine()!!.toInt()
        if (opcion == 1) {
            this.metodo_pago = "Efectivo"
        } else if (opcion == 2) {
            this.metodo_pago = "Tarjeta Debito"
        } else if (opcion == 3) {
            this.metodo_pago = "Tarjeta Credito"
        } else if (opcion == 4) {
            this.metodo_pago = "Cheque"
        } else {
            println("Introduzca un metodo de pago valido")
            crear_cliente()
        }
        fun LongArray(): LongArray {
            return TODO("Provide the return value")
        }
        this.historial_reserva = LongArray()
    }
    fun modificar_cliente() {
        println("Seleccione el dato que desea modificar:")
        println("1:Cedula")
        println("2:Nombre")
        println("3:Metodo de pago")
        println("4:Salir")
        var opcion = readLine()!!.toInt()
        if (opcion == 1) {
            println("Ingrese la cedula:")
            this.cedula = readLine()!!.toLong()
        } else if (opcion == 2) {
            println("Ingrese el nombre:")
            this.nombre = readLine()!!.toString()
        } else if (opcion == 3) {
            println("Ingrese el metodo de pago que uso el cliente:")
            println("1:Efectivo")
            println("2:Tarjeta Debito")
            println("3:Tarjeta Credito")
            println("4:Cheque")
            var opcion = readLine()!!.toInt()
            if (opcion == 1) {
                this.metodo_pago = "Efectivo"
            } else if (opcion == 2) {
                this.metodo_pago = "Tarjeta Debito"
            } else if (opcion == 3) {
                this.metodo_pago = "Tarjeta Credito"
            } else if (opcion == 4) {
                this.metodo_pago = "Cheque"
            } else {
                println("Introduzca un metodo de pago valido")
                modificar_cliente()
            }
        } else if (opcion == 4) {
            println("Modificacion de datos cancelada")
        } else {
            println("Seleccion incorrecta, intentelo de nuevo")
            modificar_cliente()
        }

    }
    fun agregar_reserva() {
        println("Introduzca el numero de reserva que desea agregar al historial del cliente:")
        var numero_reserva = readLine()!!.toLong()
        this.historial_reserva += numero_reserva
    }
    fun eliminar_reserva() {
        println("Introduzca el numero de reserva que desea eliminar del historial del cliente:")
        var numero_reserva = readLine()!!.toLong()
        for (i in this.historial_reserva.indices) {
            if (this.historial_reserva[i] == numero_reserva) {
                var indice = i
                val lista = this.historial_reserva.toMutableList()
                lista.removeAt(indice)
                this.historial_reserva = lista.toLongArray()
            }
        }
        println("Se ha eliminado la reserva: " + numero_reserva + " del historial del cliente")
    }
}