package chap02.section3

fun main( )
{
    val a: Int = 128
    val b = a
    println(a === b) // Int형으로 값도 동일하므로 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교하는 경우 -> 동일하므로 true
    println(c === d) // 값의 내용은 같지만 참조 주소를 비교 -> 주소 다르므로 false
    println(c === e) // 값의 내용도 같고 주소도 같으므로 true
}