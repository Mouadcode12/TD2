package com.example.td


//Exercice1
//open class Langue(var id:Int,var nomLangue:String)
//
//class Etudiant(id: Int,
//               var nom :String,
//               var prenom:String,
//               var age:Int,
//               var languemaitrisee:List<String>):Langue(id,nomLangue = "Unknown") {
//                   fun afficherdetail(){
//                       val langueee = languemaitrisee.joinToString(", ")
//                       println("L'Etudiant : $nom,$age ans.\n, Langue maitrisee : $langueee")
//                   }
//}
//
//
//fun main(){
//    var langue = Langue(1,"Arabe")
//    var langue1 = Langue(2,"francais")
//    var langue2 = Langue(3,"Anglais")
//    var etudiant = Etudiant(1,"ahmed","dfa",22, listOf(langue.nomLangue,langue1.nomLangue,langue2.nomLangue))
//    etudiant.afficherdetail()
//}








//Exercice2
open class Personne{
    private var id:Int = 0
    private var nom:String = "Mouad"
    private var prenom:String = "Boumahdi"
    private var age:Byte = 19

    constructor(id:Int,nom:String,prenom:String,age:Byte){
        this.id = id
        this.nom = nom
        this.prenom = prenom
        this.age = age
    }

    fun getId():Int{
        return id
    }
    fun getNom():String{
        return nom
    }
    fun getPrenom():String{
        return prenom
    }
    fun getAge():Byte{
        return age
    }


    fun setId(id:Int){
        this.id= id
    }
    fun setNom(nom:String){
        this.nom = nom
    }
    fun setPrenom(prenom:String){
        this.prenom = prenom
    }
    fun setAge(age:Byte){
        this.age = age
    }


    open fun afficherInfos(){
        println("le nom est $nom et le prenom est $prenom et l'age est $age")
    }

}


class Employe(var salaire:Double,id: Int,nom: String,prenom: String,age: Byte):Personne(id,nom,prenom,age){
    constructor(salaire: Double,nom: String,prenom: String,age: Byte): this(salaire,0,nom,prenom,age)

//    Redéfinition
    override fun afficherInfos(){
        println("le salaire est $salaire et le nom de cette personne est ${getNom()} et le prenom est ${getPrenom()} et l'age est ${getAge()} ")
    }


    init{
        nombreEmployes++
    }
    companion object{
        var nombreEmployes :Int = 0
        fun getNombreEmployes(){
            println("$nombreEmployes")
        }
    }
}

fun main(){
    var employe1 = Employe(1000.00, "Mouad", "Boumahdi", 19)
    var employe2 = Employe(2000.00, "Youness", "Boumahdi", 16)
    employe1.afficherInfos()
    employe2.afficherInfos()


    Employe.getNombreEmployes()
}
