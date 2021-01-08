fun main(args: Array<String>) {
    var a1: Long = 10
    var b1: Long = 20
    var c1: Long = 0
    var e1: Long = 1
    var n = readLine()!!.toInt()
    var a: Long
    var b: Long
    var c: Long
    var e: Long
    for(i in 0..n-2) {
        a = 10 * (b1 + c1 + e1)
        b = 20 * a1
        c = b1 * 2
        e = a1
        a1 = a%(1000000000+9)
        b1 = b%(1000000000+9)
        c1 = c%(1000000000+9)
        e1 = e%(1000000000+9)
    }
    println(a1+b1+c1+e1)
    println((a1+b1+c1+e1)%(1000000000+9))
    //dffdyhfyhtrfh
    //dfgjfdjdfyhkifdkh
}