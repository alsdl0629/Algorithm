fun main() {
    var readln = readln()
    var arr = Array(26) { -1 }
    for (i in 0..readln.length - 1) {
        if (arr[readln[i].code - 97] == -1) arr[readln[i].code - 97] = i
    }

    for (i in 0..25) {
        print("${arr[i]} ")
    }
}