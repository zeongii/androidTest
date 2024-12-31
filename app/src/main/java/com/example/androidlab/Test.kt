package com.example.androidlab

fun hofFun(arg : (Int) -> Boolean): () -> String {
    val result = if(arg(10)) {
        "valid"
    } else {
        "inval"
    }
    return {
        "hofFun result : ${result}"
    }
}

fun main() {
    val result = hofFun({no -> no > 0})
    println(result())
}
