package com.example.ilerikotlin

class IkinciThread:Runnable {

    override fun run() {

        for (i in 200..299){
            println("İkinci Thread : $i")
        }

    }
}