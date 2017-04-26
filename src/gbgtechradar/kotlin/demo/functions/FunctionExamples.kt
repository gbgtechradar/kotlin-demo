package gbgtechradar.kotlin.demo.functions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun double(x: Int): Int = x * 2

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {

    fun read(b: Array<Byte>, off: Int = 0, len: Int = 1000) {

    }

    println( double(2))

    val lock = ReentrantLock();
    lock(lock) {
        findFixPoint( 0.5)
    }

    val ints = asList(1, 2, 3)

    var sum = 0
    ints.filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)
}
