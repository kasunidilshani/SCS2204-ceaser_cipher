object ceaser_cipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)+key) % a.size)

  val D=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)-key + a.size) % a.size)

  val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))

  var s= "encryption"

  val ct=cipher(E,s,5,alphabet)
  println(ct)

  val pt=cipher(D,ct,5,alphabet)
  println(pt)

}
