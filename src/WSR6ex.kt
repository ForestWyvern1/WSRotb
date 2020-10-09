fun main (){
    var A = 0
    while (A == 0) {
        var pass = readLine().toString()
        var passarray = pass.toCharArray()
        var cnfrmstrng = listOf("1234567890").toString()
        var upper = listOf("QWERTYUIOPASDFGHJKLZXCVBNM").toString()
        var lower = listOf("qwertyuiopasdfghjklzxcvbnm").toString()
        var lowercnfrm = lower.toCharArray()
        var uppercnfrm = upper.toCharArray()
        var cnfrmarray = cnfrmstrng.toCharArray()
        var lengthupper = 0
        var lengthlower = 0
        var lengthnumber = 0
        var length = 0
        for (i in passarray) {
            if (cnfrmarray.contains(i)) {
                lengthnumber += 1
                length += 1
            }
            if (uppercnfrm.contains(i)) {
                lengthupper += 1
                length += 1
            }
            if (lowercnfrm.contains(i)) {
                lengthlower += 1
                length += 1
            }
            if (length == 0) {
                println("error")
            }
        }
        if (length < 6 || lengthnumber == 0 || lengthupper == 0 || lengthlower == 0) println("error")
        else println("confirm")
    }
}