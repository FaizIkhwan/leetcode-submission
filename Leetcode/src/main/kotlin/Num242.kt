import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
//        String s = "anagram";
//        String t = "nagaram";

//        String s = "rat";
//        String t = "car";
    val s = "a"
    val t = "ab"

//        String s = "ab";
//        String t = "a";
    println(isAnagram(s, t))
}

fun isAnagram(s: String, t: String): Boolean {
    val sChar = s.toCharArray()
    val tChar = t.toCharArray()
    Arrays.sort(sChar)
    Arrays.sort(tChar)
    val n = max(sChar.size, tChar.size)
    for (i in 0 until n) {
        if ((sChar[i] ?: 0) != (tChar[i] ?: 0)) {
            return false
        }
    }
    return true
}