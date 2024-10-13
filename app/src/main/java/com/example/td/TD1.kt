package com.example.td




//exerice 1
//fun main() {
//    print("Donner un nombre (0 pour continuer, -1 pour calculer la moyenne) : \n")
//    val n = readln().toInt()
//
//    val numbers = mutableListOf<Double>()
//
//    when {
//        n < 0 -> {
//            if (n == -1) {
//                if (numbers.isNotEmpty()) {
//                    val average = numbers.average()
//                    println("La moyenne est : %.2f".format(average))
//                    when {
//                        average >= 16 -> println("Mention : Excellent")
//                        average >= 14 -> println("Mention : Bien")
//                        average >= 12 -> println("Mention : Assez bien")
//                        average >= 10 -> println("Mention : Passable")
//                        else -> println("Mention : Insuffisant")
//                    }
//                } else {
//                    println("Aucun nombre saisi. Impossible de calculer la moyenne.")
//                }
//            }
//        }
//        n == 0 -> {
//            println("Entrez un nombre supérieur à 0 ou -1 pour calculer la moyenne:")
//            while (true) {
//                val number = readln().toDoubleOrNull()
//                if (number == -1.0) {
//                    if (numbers.isNotEmpty()) {
//                        val average = numbers.average()
//                        println("La moyenne est : %.2f".format(average))
//                        when {
//                            average >= 16 -> println("Mention : Excellent")
//                            average >= 14 -> println("Mention : Bien")
//                            average >= 12 -> println("Mention : Assez bien")
//                            average >= 10 -> println("Mention : Passable")
//                            else -> println("Mention : Insuffisant")
//                        }
//                    } else {
//                        println("Aucun nombre saisi. Impossible de calculer la moyenne.")
//                    }
//                    return
//                } else if (number != null && number in 1.0..20.0) {
//                    numbers.add(number)
//                } else {
//                    println("Entrée invalide, veuillez entrer un nombre entre 1 et 20.")
//                }
//            }
//        }
//        n > 0 -> {
//            if (n in 1..20) {
//                numbers.add(n.toDouble())
//            } else {
//                println("Veuillez entrer un nombre entre 1 et 20.")
//            }
//        }
//    }
//}

//exercice 2 Class animal
//class Animal(var nom :String,var age :Int){
//    fun afficherdetails(){
//        println("le nom est : $nom et l'age est ${age}ans ")
//        }
//}
//fun main(){
//    var cat = Animal("sima",3)
//    var dog = Animal("hex",7)
//
//    cat.afficherdetails()
//    dog.afficherdetails()
//}


//exercice3
//class CompteBancaire(var titulaire:String,var solde:Double){
//    fun depot(argent:Double){
//        solde+=argent
//    }
//    fun retrait(argent: Double){
//        if(solde > argent){
//            solde-=argent
//        }else{
//            println("le solde est suffisant")
//        }
//    }
//    fun affichersolde(){
//        println("le solde actuel est ${solde}DH")
//    }
//}
//
//fun main(){
//    var Compte = CompteBancaire("Mouad",1000.50)
//    Compte.depot(10000.00)
//    Compte.retrait(1000.50)
//    Compte.affichersolde()
//}


//exercice4
//open class Forme(var couleur:String){
//    fun affichercouleur(){
//        println("le couleur de forme est $couleur")
//    }
//}
//
//
//class Cercle(var rayon:Double,couleur: String):Forme(couleur){
//    fun air():Double{
//       val air = 3.14 * rayon*rayon
//        println("air de cercle est $air et le couleur est : $couleur")
//        return air
//    }
//}
//
//class Rectangle(var Largeur:Double,var Hauteur:Double,couleur: String):Forme(couleur){
//    fun HL():Double{
//        val HL = Hauteur * Largeur
//        println("air de cercle est $HL et le couleur est : $couleur")
//        return HL
//    }
//}
//
//
//fun main(){
//    val cercle = Cercle(5.0, "Rouge")
//    val rectangle = Rectangle(4.0, 7.0, "Bleu")
//    cercle.air()
//    rectangle.HL()
//}

echo "# TD1" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Mouadcode12/TD1.git
git push -u origin main



